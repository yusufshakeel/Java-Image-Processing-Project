package imageFX;

/**
 * File: FilterImage.java
 * 
 * Description:
 * This will perform median filtering.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
 */
public class FilterImage {
    
    /**
     * This method is used to perform median filtering on the image object passed.
     * This method will fill the pixels outside the mask with 0 value.
     * 
     * @param img The image object passed on which median filtering is performed.
     * @param maskSize - The size of the mask is an odd integer like 3, 5, 7 … etc.
     */
    public static void medianFilter_ZeroFill(MyImage img, int maskSize){
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /**
         * Buff is a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity storing it into 1D array.
         */
        int buff[];
        
        /** Median Filter operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                buff = new int[maskSize * maskSize];
                int i = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r == img.getImageHeight() || c < 0 || c == img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            buff[i] = 0;
                        }else{
                            buff[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                java.util.Arrays.sort(buff);
                outputPixels[x+(y*img.getImageWidth())] = buff[(maskSize*maskSize)/2];
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
     * This method is used to perform median filtering on the image object passed.
     * This method fill the pixels outside the mask with values near to the pixels.
     * 
     * @param img The image object passed on which median filtering is performed.
     * @param maskSize - The size of the mask is an odd integer like 3, 5, 7 … etc.
     */
    public static void medianFilter_ValueFill(MyImage img, int maskSize){
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /**
         * Buff is a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity storing it into 1D array.
         */
        int buff[];
        
        /** Median Filter operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                buff = new int[maskSize * maskSize];
                int i = 0;
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
                java.util.Arrays.sort(buff);
                outputPixels[x+(y*img.getImageWidth())] = buff[(maskSize*maskSize)/2];
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
     * Common names: Mean Filtering, Smoothing, Averaging, Box Filtering.
     * This method is used to remove noise from image by averaging the neighbouring
     * pixels under the mask. Note! details from the image is also removed in this
     * process. Hence bigger the mask size more the detail lost.
     * This method will fill the pixels outside the mask with 0 value.
     * 
     * @param img The image object passed on which median filtering is performed.
     * @param maskSize - The size of the mask is an odd integer like 3, 5, 7 … etc.
     */
    public static void meanFilter_ZeroFill(MyImage img, int maskSize){
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /**
         * Buff is a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity storing it into 1D array.
         */
        int buff[];
        
        /** Median Filter operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                buff = new int[maskSize * maskSize];
                int i = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r == img.getImageHeight() || c < 0 || c == img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            buff[i] = 0;
                        }else{
                            buff[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                
                /** Find mean of the buff array value */
                int sa=0, sr=0, sg=0, sb=0;
                for(i = 0; i < 9; i++){
                    sa += ImageFX.getAlphaValueFromPixelValue(buff[i]);
                    sr += ImageFX.getRedValueFromPixelValue(buff[i]);
                    sg += ImageFX.getGreenValueFromPixelValue(buff[i]);
                    sb += ImageFX.getBlueValueFromPixelValue(buff[i]);
                }
                
                /** Save pixel value to outputPixels array */
                int p = ImageFX.getPixelValueFromARGBValue(sa/9, sr/9, sg/9, sb/9);
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
     * Common names: Mean Filtering, Smoothing, Averaging, Box Filtering.
     * This method is used to remove noise from image by averaging the neighbouring
     * pixels under the mask. Note! details from the image is also removed in this
     * process. Hence bigger the mask size more the detail lost.
     * This method fill the pixels outside the mask with values near to the pixels.
     * 
     * @param img The image object passed on which median filtering is performed.
     * @param maskSize - The size of the mask is an odd integer like 3, 5, 7 … etc.
     */
    public static void meanFilter_ValueFill(MyImage img, int maskSize){
        
        /** 
         * This array will store the output of the median filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];

        /**
         * Buff is a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity storing it into 1D array.
         */
        int buff[];
        
        /** Median Filter operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                buff = new int[maskSize * maskSize];
                int i = 0;
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
                
                /** Find mean of the buff array value */
                int sa=0, sr=0, sg=0, sb=0;
                for(i = 0; i < 9; i++){
                    sa += ImageFX.getAlphaValueFromPixelValue(buff[i]);
                    sr += ImageFX.getRedValueFromPixelValue(buff[i]);
                    sg += ImageFX.getGreenValueFromPixelValue(buff[i]);
                    sb += ImageFX.getBlueValueFromPixelValue(buff[i]);
                }
                
                /** Save pixel value to outputPixels array */
                int p = ImageFX.getPixelValueFromARGBValue(sa/9, sr/9, sg/9, sb/9);
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
}//class MedianFilter ends here