package imageFX;

/**
 * File: ImageFX.java
 * 
 * Description:
 * Contains common image processing methods.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
 */
import java.awt.image.BufferedImage;

public class ImageFX {
    
    /////////////////////////// Pixel elements ARGB Methods ////////////////////
    
    /**
     * This method will return alpha value from the pixel value.
     * 
     * @param pixelVal The pixel value from which alpha value is calculated.
     * @return Alpha value [0-255].
     */
    public static int getAlphaValueFromPixelValue(int pixelVal){
        return (pixelVal>>24) & 0xFF;
    }
    
    /**
     * This method will return red value from the pixel value.
     * 
     * @param pixelVal The pixel value from which red value is calculated.
     * @return Red value [0-255].
     */
    public static int getRedValueFromPixelValue(int pixelVal){
        return (pixelVal>>16) & 0xFF;
    }
    
    /**
     * This method will return green value from the pixel value.
     * 
     * @param pixelVal The pixel value from which green value is calculated.
     * @return Green value [0-255].
     */
    public static int getGreenValueFromPixelValue(int pixelVal){
        return (pixelVal>>8) & 0xFF;
    }
    
    /**
     * This method will return blue value from the pixel value.
     * 
     * @param pixelVal The pixel value from which blue value is calculated.
     * @return Blue value [0-255].
     */
    public static int getBlueValueFromPixelValue(int pixelVal){
        return pixelVal & 0xFF;
    }
    
    /**
     * This method will return pixel value from the ARGB value.
     * 
     * @param a Alpha value [0-255].
     * @param r Red value [0-255].
     * @param g Green value [0-255].
     * @param b Blue value [0-255].
     * @return Pixel value.
     */
    public static int getPixelValueFromARGBValue(int a, int r, int g, int b){
        return (a<<24) | (r<<16) | (g<<8) | b;
    }
    
    ///////////////////////////// HSI methods //////////////////////////////////
    
    /**
     * This method will change the hue value of the image.
     * This method is using HSI (Hue-Saturation-Intensity) color model.
     * 
     * @param img The image pixels to change.
     * @param hue The hue value to set in degree [0-360]
     */
    public static void HSI_changeImageHueValue(MyImage img, double hue){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setHue_HSI(x, y, hue);
            }
        }
    }
    
    /**
     * This method will change the saturation value of the image.
     * This method is using HSI (Hue-Saturation-Intensity) color model.
     * 
     * @param img The image pixels to change.
     * @param saturation The saturation value [0-1]
     */
    public static void HSI_changeImageSaturationValue(MyImage img, double saturation){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setSaturation_HSI(x, y, saturation);
            }
        }
    }
    
    /**
     * This method will change the intensity value of the image.
     * This method is using HSI (Hue-Saturation-Intensity) color model.
     * 
     * @param img The image pixels to change.
     * @param intensity The intensity value [0-255]
     */
    public static void HSI_changeImageIntensityValue(MyImage img, double intensity){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setIntensity_HSI(x, y, intensity);
            }
        }
    }
    
    //////////////////////////// Rotation and Flip Methods /////////////////////
    
    /**
     * This method will rotate the image left.
     * 
     * @param img The image to rotate.
     */
    public static void rotateLeft(MyImage img){
        BufferedImage bi = new BufferedImage(img.getImageHeight(), img.getImageWidth(), BufferedImage.TYPE_INT_ARGB);
        for(int sx = img.getImageWidth()-1, y = 0; sx >= 0; sx--, y++){
            for(int sy = 0, x = 0; sy < img.getImageHeight(); sy++, x++){
                bi.setRGB(x, y, img.getPixel(sx, sy));
            }
        }
        img.modifyImageObject(img.getImageHeight(), img.getImageWidth(), bi);
        img.initPixelArray();
    }
    
    /**
     * This method will rotate the image right.
     * 
     * @param img The image to rotate.
     */
    public static void rotateRight(MyImage img){
        BufferedImage bi = new BufferedImage(img.getImageHeight(), img.getImageWidth(), BufferedImage.TYPE_INT_ARGB);
        for(int sx = 0, y = 0; sx < img.getImageWidth(); sx++, y++){
            for(int sy = img.getImageHeight()-1 , x = 0; sy >= 0; sy--, x++){
                bi.setRGB(x, y, img.getPixel(sx, sy));
            }
        }
        img.modifyImageObject(img.getImageHeight(), img.getImageWidth(), bi);
        img.initPixelArray();
    }
    
    /**
     * This method will flip the image horizontally.
     * 
     * @param img The image to be flipped horizontally.
     */
    public static void flipHorizontal(MyImage img){
        for(int xi = 0, xj = img.getImageWidth() - 1 ; xi < xj; xi++, xj--){
            for(int y = 0; y < img.getImageHeight(); y++){
                int t = img.getPixel(xi, y);
                img.setPixelToValue(xi, y, img.getPixel(xj, y));
                img.setPixelToValue(xj, y, t);
            }
        }
    }
    
    /**
     * This method will flip the image vertically.
     * 
     * @param img The image to be flipped vertically.
     */
    public static void flipVertical(MyImage img){
        for(int yi = 0, yj = img.getImageHeight() - 1 ; yi < yj; yi++, yj--){
            for(int x = 0; x < img.getImageWidth(); x++){
                int t = img.getPixel(x, yi);
                img.setPixelToValue(x, yi, img.getPixel(x, yj));
                img.setPixelToValue(x, yj, t);
            }
        }
    }
    
    /////////////////////////////// Transparency Methods ///////////////////////
    
    /**
     * This method will change the transparency (alpha) of all the pixels of the image.
     * Works well with .png files.
     * 
     * @param img The image pixels to change.
     * @param alpha The alpha value [0-255] to set in each pixels of the image.
     */
    public static void transparentAllPixels(MyImage img, int alpha){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setAlpha(x, y, alpha);
            }
        }
    }
    
    /**
     * This method will change the transparency (alpha) of those pixels which have
     * alpha value greater than 0.
     * Works well with .png files.
     * 
     * @param img The image pixels to change.
     * @param alpha The alpha value [0-255] to set in each pixels of the image.
     */
    public static void transparentAlphaPixels(MyImage img, int alpha){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                if(img.getAlpha(x, y) > 0){
                    img.setAlpha(x, y, alpha);
                }
            }
        }
    }
    
    ////////////////////////////// Grayscale Methods ///////////////////////////
    
    /**
     * This method will turn color image to gray scale image.
     * It will set the RGB value of the pixel to (R+G+B)/3
     * 
     * @param img The image pixels to change.
     */
    public static void grayScale_Average(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                int g = img.getGreen(x, y);
                int b = img.getBlue(x, y);
                int grayscale = (r+g+b)/3;
                img.setPixel(x, y, a, grayscale, grayscale, grayscale);
            }
        }
    }
    
    /**
     * This method will turn color image to gray scale image.
     * In this method GrayScale = (max(R, G, B) + min(R, G, B)) / 2.
     *
     * @param img The image pixels to change.
     */
    public static void grayScale_Lightness(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                int g = img.getGreen(x, y);
                int b = img.getBlue(x, y);
                int max = Math.max(Math.max(r, g), b);
                int min = Math.min(Math.min(r, g), b);
                int grayscale = (max+min)/2;
                img.setPixel(x, y, a, grayscale, grayscale, grayscale);
            }
        }
    }
    
    /**
     * This method will turn color image to gray scale image.
     * This method uses the formula GrayScale = 0.2126*R + 0.7152*G + 0.0722*B
     * 
     * @param img The image pixels to change.
     */
    public static void grayScale_Luminosity(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                int g = img.getGreen(x, y);
                int b = img.getBlue(x, y);
                int grayscale = (int)(0.2126*r + 0.7152*g + 0.0722*b);
                img.setPixel(x, y, a, grayscale, grayscale, grayscale);
            }
        }
    }
    
    /**
     * This method will turn color image to gray scale image.
     * It will set the RGB value of the pixel to red value of the pixel.
     * 
     * @param img The image pixels to change.
     */
    public static void grayScale_setRGBValueToRedValue(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                img.setPixel(x, y, a, r, r, r);
            }
        }
    }
    
    /**
     * This method will turn color image to gray scale image.
     * It will set the RGB value of the pixel to green value of the pixel.
     * 
     * @param img The image pixels to change.
     */
    public static void grayScale_setRGBValueToGreenValue(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int g = img.getGreen(x, y);
                img.setPixel(x, y, a, g, g, g);
            }
        }
    }
    
    /**
     * This method will turn color image to gray scale image.
     * It will set the RGB value of the pixel to blue value of the pixel.
     * 
     * @param img The image pixels to change.
     */
    public static void grayScale_setRGBValueToBlueValue(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int b = img.getBlue(x, y);
                img.setPixel(x, y, a, b, b, b);
            }
        }
    }

    //////////////////////////////// Image Methods /////////////////////////////
    
    /**
     * This method will create a random image.
     * 
     * @param img The image object that will hold the random image.
     */
    public static void createRandomImage(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = (int)(Math.random()*256);
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);
                img.setPixel(x, y, a, r, g, b);
            }
        }
    }
    
    /**
     * This method will crop the image img.
     * 
     * @param img The image to crop.
     * @param x The x coordinate from where cropping will start.
     * @param y The y coordinate from where cropping will start.
     * @param width The width of the new cropped image.
     * @param height The height of the new cropped image.
     */
    public static void crop(MyImage img, int x, int y, int width, int height){
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for(int sy = y, j = 0; sy < y+height; sy++, j++){
            for(int sx = x, i = 0; sx < x+width; sx++, i++){
                bi.setRGB(i, j, img.getPixel(sx, sy));
            }
        }
        img.modifyImageObject(width, height, bi);
        img.initPixelArray();
    }
    
    /**
     * This method will generate the negative of an image.
     * 
     * @param img The image whose negative is generated.
     */
    public static void negative(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = 255 - img.getRed(x, y);
                int g = 255 - img.getGreen(x, y);
                int b = 255 - img.getBlue(x, y);
                img.setPixel(x, y, a, r, g, b);
            }
        }
    }
    
    /**
     * This method will turn color image to red image.
     * 
     * @param img The image pixels to change.
     */
    public static void redImage(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                img.setPixel(x, y, a, r, 0, 0);
            }
        }
    }
    
    /**
     * This method will turn color image to green image.
     * 
     * @param img The image pixels to change.
     */
    public static void greenImage(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int g = img.getGreen(x, y);
                img.setPixel(x, y, a, 0, g, 0);
            }
        }
    }
    
    /**
     * This method will turn color image to blue image.
     * 
     * @param img The image pixels to change.
     */
    public static void blueImage(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int b = img.getBlue(x, y);
                img.setPixel(x, y, a, 0, 0, b);
            }
        }
    }
    
    /**
     * This method will change the red value of the image.
     * 
     * @param img The image pixels to change.
     * @param red The red value to set. [0-255]
     */
    public static void changeImageRedValue(MyImage img, int red){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int g = img.getGreen(x, y);
                int b = img.getBlue(x, y);
                img.setPixel(x, y, a, red, g, b);
            }
        }
    }
    
    /**
     * This method will change the green value of the image.
     * 
     * @param img The image pixels to change.
     * @param green The green value to set. [0-255]
     */
    public static void changeImageGreenValue(MyImage img, int green){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                int b = img.getBlue(x, y);
                img.setPixel(x, y, a, r, green, b);
            }
        }
    }
    
    /**
     * This method will change the blue value of the image.
     * 
     * @param img The image pixels to change.
     * @param blue The blue value to set. [0-255]
     */
    public static void changeImageBlueValue(MyImage img, int blue){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = img.getRed(x, y);
                int g = img.getGreen(x, y);
                img.setPixel(x, y, a, r, g, blue);
            }
        }
    }
    
    ////////////////////////////////// SHARPEN METHOD //////////////////////////
    
    /**
     * This method will sharpen the image.
     * 
     * @param img The image to sharpen.
     */
    public static void sharpen(MyImage img){
        
        /**
         * Mask is a 2D square of odd size like 3x3
         * For simplicity storing it into 1D array.
         */
        int mask[] = new int[]{  0, -1,  0,
                                -1,  5, -1,
                                 0, -1,  0};
        
        int maskSize = 3;   //The width of the mask.
        
        /**
         * Buffered array of pixels holds the intermediate value of pixels that
         * is multiplied with the mask to get the final value for the center
         * pixel under the mask.
         */
        int buff[];
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /** Sharpen operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                /** Fill buff array */
                int i = 0;
                buff = new int[9];
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r == img.getImageHeight() || c < 0 || c == img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            int tr = r, tc = c;
                            if(r < 0){
                                tr = r+1;
                            }else if(r == img.getImageHeight()){
                                tr = r-1;
                            }
                            if(c < 0){
                                tc = c+1;
                            }else if(c == img.getImageWidth()){
                                tc = c-1;
                            }
                            buff[i] = img.getPixel(tc, tr);
                        }else{
                            buff[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                
                /** Multiply mask with buff array to get the final value. */
                int sa=0, sr=0, sg=0, sb=0;
                for(i = 0; i < 9; i++){
                    sa += mask[i]*getAlphaValueFromPixelValue(buff[i]);
                    sr += mask[i]*getRedValueFromPixelValue(buff[i]);
                    sg += mask[i]*getGreenValueFromPixelValue(buff[i]);
                    sb += mask[i]*getBlueValueFromPixelValue(buff[i]);
                }
                
                /** Save result in outputPixels array. */
                int p = getPixelValueFromARGBValue(sa,sr,sg,sb);
                outputPixels[x+(y*img.getImageWidth())] = p;
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setPixelToValue(x, y, outputPixels[x+(y*img.getImageWidth())]);
            }
        }
    }
    
    /////////////////////////////// BLUR METHODS ///////////////////////////////
    
    /**
     * This method will blur the image using 
     * mask=[1/9, 1/9, 1/9,
     *       1/9, 1/9, 1/9,
     *       1/9, 1/9, 1/9]
     * 
     * @param img The image to blur.
     */
    public static void blur_D9(MyImage img){
        
        int maskSize = 3;   //The width of the mask.
        
        /**
         * Buffered array of pixels holds the intermediate value of pixels that
         * is multiplied with the mask to get the final value for the center
         * pixel under the mask.
         */
        int buff[];
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /** Sharpen operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                /** Fill buff array */
                int i = 0;
                buff = new int[9];
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r == img.getImageHeight() || c < 0 || c == img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            int tr = r, tc = c;
                            if(r < 0){
                                tr = r+1;
                            }else if(r == img.getImageHeight()){
                                tr = r-1;
                            }
                            if(c < 0){
                                tc = c+1;
                            }else if(c == img.getImageWidth()){
                                tc = c-1;
                            }
                            buff[i] = img.getPixel(tc, tr);
                        }else{
                            buff[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                
                /** Multiply mask with buff array to get the final value. */
                int sa=0, sr=0, sg=0, sb=0;
                for(i = 0; i < 9; i++){
                    sa += getAlphaValueFromPixelValue(buff[i])/9;
                    sr += getRedValueFromPixelValue(buff[i])/9;
                    sg += getGreenValueFromPixelValue(buff[i])/9;
                    sb += getBlueValueFromPixelValue(buff[i])/9;
                }
                
                /** Save result in outputPixels array. */
                int p = getPixelValueFromARGBValue(sa, sr, sg, sb);
                outputPixels[x+(y*img.getImageWidth())] = p;
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setPixelToValue(x, y, outputPixels[x+(y*img.getImageWidth())]);
            }
        }
    }
    
    /**
     * This method will blur the image using
     * mask[1/16, 2/16, 1/16,
     *      2/16, 4/16, 2/16,
     *      1/16, 2/16, 1/16]
     * 
     * @param img The image to blur.
     */
    public static void blur_D16(MyImage img){
        
        /**
         * Mask is a 2D square of odd size like 3x3
         * For simplicity storing it into 1D array.
         */
        int mask[] = new int[]{  1, 2, 1,
                                 2, 4, 2,
                                 1, 2, 1};
        
        int maskSize = 3;   //The width of the mask.
        
        /**
         * Buffered array of pixels holds the intermediate value of pixels that
         * is multiplied with the mask to get the final value for the center
         * pixel under the mask.
         */
        int buff[];
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /** Sharpen operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                /** Fill buff array */
                int i = 0;
                buff = new int[9];
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r == img.getImageHeight() || c < 0 || c == img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            int tr = r, tc = c;
                            if(r < 0){
                                tr = r+1;
                            }else if(r == img.getImageHeight()){
                                tr = r-1;
                            }
                            if(c < 0){
                                tc = c+1;
                            }else if(c == img.getImageWidth()){
                                tc = c-1;
                            }
                            buff[i] = img.getPixel(tc, tr);
                        }else{
                            buff[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                
                /** Multiply mask with buff array to get the final value. */
                int sa=0, sr=0, sg=0, sb=0;
                for(i = 0; i < 9; i++){
                    sa += (mask[i]*getAlphaValueFromPixelValue(buff[i]))/16;
                    sr += (mask[i]*getRedValueFromPixelValue(buff[i]))/16;
                    sg += (mask[i]*getGreenValueFromPixelValue(buff[i]))/16;
                    sb += (mask[i]*getBlueValueFromPixelValue(buff[i]))/16;
                }
                
                /** Save result in outputPixels array. */
                int p = getPixelValueFromARGBValue(sa, sr, sg, sb);
                outputPixels[x+(y*img.getImageWidth())] = p;
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setPixelToValue(x, y, outputPixels[x+(y*img.getImageWidth())]);
            }
        }
    }
    
    //////////////////////////////// EDGE DETECT METHOD ////////////////////////
    
    /**
     * This method will detect edges in the image
     * mask[ -1, -1, -1,
     *       -1,  8, -1,
     *       -1, -1, -1]
     * 
     * @param img The image to blur.
     */
    public static void edgeDetect(MyImage img){
        
        /**
         * Mask is a 2D square of odd size like 3x3
         * For simplicity storing it into 1D array.
         */
        int mask[] = new int[]{  -1, -1, -1,
                                 -1,  8, -1,
                                 -1, -1, -1};
        
        int maskSize = 3;   //The width of the mask.
        
        /**
         * Buffered array of pixels holds the intermediate value of pixels that
         * is multiplied with the mask to get the final value for the center
         * pixel under the mask.
         */
        int buff[];
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /** Sharpen operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                /** Fill buff array */
                int i = 0;
                buff = new int[9];
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r == img.getImageHeight() || c < 0 || c == img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            int tr = r, tc = c;
                            if(r < 0){
                                tr = r+1;
                            }else if(r == img.getImageHeight()){
                                tr = r-1;
                            }
                            if(c < 0){
                                tc = c+1;
                            }else if(c == img.getImageWidth()){
                                tc = c-1;
                            }
                            buff[i] = img.getPixel(tc, tr);
                        }else{
                            buff[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                
                /** Multiply mask with buff array to get the final value. */
                int sa=0, sr=0, sg=0, sb=0;
                for(i = 0; i < 9; i++){
                    sa += (mask[i]*getAlphaValueFromPixelValue(buff[i]))/16;
                    sr += (mask[i]*getRedValueFromPixelValue(buff[i]))/16;
                    sg += (mask[i]*getGreenValueFromPixelValue(buff[i]))/16;
                    sb += (mask[i]*getBlueValueFromPixelValue(buff[i]))/16;
                }
                
                /** Save result in outputPixels array. */
                int p = getPixelValueFromARGBValue(sa, sr, sg, sb);
                outputPixels[x+(y*img.getImageWidth())] = p;
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setPixelToValue(x, y, outputPixels[x+(y*img.getImageWidth())]);
            }
        }
    }
}//class ImageFX ends here