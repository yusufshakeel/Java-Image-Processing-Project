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
public class ImageFX {
    
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
    
    /**
     * This method will sharpen the image.
     * 
     * @param img The image to sharpen.
     */
    public static void sharpen(MyImage img){
        
        /**
         * Mask is a 2D square of odd size like 3x3
         * For simplicity converting it into 1D array.
         */
        int mask[] = new int[]{  0, -1,  0,
                                -1,  5, -1,
                                 0, -1,  0};
        
        int maskSize = 3;   //The width size of the mask.
        
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
                        if(r < 0 || r >= img.getImageHeight() || c < 0 || c >= img.getImageWidth()){
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
                int sum = 0;
                for(i = 0; i < 9; i++){
                    sum += mask[i]*buff[i];
                }
                
                /** Save result in outputPixels array. */
                outputPixels[x+(y*img.getImageWidth())] = sum;
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
