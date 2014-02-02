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
         * Mask is a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity converting it into 1D array.
         */
        int mask[];
        
        /** Median Filter operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                mask = new int[maskSize * maskSize];
                int i = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r >= img.getImageHeight() || c < 0 || c >= img.getImageWidth()){
                            /** Some portion of the mask is outside the image. */
                            mask[i] = 0;
                        }else{
                            mask[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                java.util.Arrays.sort(mask);
                outputPixels[x+(y*img.getImageHeight())] = mask[(maskSize*maskSize)/2];
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setPixelToValue(x, y, outputPixels[x+(y*img.getImageHeight())]);
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
         * Mask is a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity converting it into 1D array.
         */
        int mask[];
        
        /** Median Filter operation */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                mask = new int[maskSize * maskSize];
                int i = 0;
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
                            mask[i] = img.getPixel(tc, tr);
                        }else{
                            mask[i] = img.getPixel(c, r);
                        }
                        i++;
                    }
                }
                java.util.Arrays.sort(mask);
                outputPixels[x+(y*img.getImageHeight())] = mask[(maskSize*maskSize)/2];
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                img.setPixelToValue(x, y, outputPixels[x+(y*img.getImageHeight())]);
            }
        }
    }
}//class MedianFilter ends here