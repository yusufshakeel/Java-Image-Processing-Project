package imageFX;
/**
 * File: IntensityFreq.java
 * 
 * Description:
 * This will find max and min intensity frequency of the image.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 06-05-2014 tue
 * 
 * www.github.com/yusufshakeel/Java-Image-Processing-Project
 * 
 * The MIT License (MIT)
 * Copyright (c) 2014 Yusuf Shakeel
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class IntensityFreq {
    
    /**
     * This will return the maximum intensity frequency of the grayscale image img.
     * 
     * @param img The grayscale image.
     * @return maximum intensity.
     */
    public static int grayscale_getMax(MyImage img){
        int intensity[] = new int[256];
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensity[img.getRed(x, y)]++;
            }
        }
        
        //search max intensity
        for(int i = 0; i < 256; i++){
            if(intensity[i] > maxIntensity){
                maxIntensity = intensity[i];
            }
        }
        
        return maxIntensity;
    }
    
    /**
     * This will return the minimum intensity frequency of the grayscale image img.
     * 
     * @param img The grayscale image.
     * @return minimum intensity.
     */
    public static int grayscale_getMin(MyImage img){
        int intensity[] = new int[256];
        int minIntensity = 256;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensity[img.getRed(x, y)]++;
            }
        }
        
        //search min intensity
        for(int i = 0; i < 256; i++){
            if(intensity[i] < minIntensity){
                minIntensity = intensity[i];
            }
        }
        
        return minIntensity;
    }
    
    /**
     * This will return the maximum intensity frequency of the color image img.
     * 
     * @param img The color image.
     * @return maximum intensity.
     */
    public static int[] color_getMax(MyImage img){
        /**
         * intensity
         * row  col
         *      0 1 2
         * I    R G B
         * 0
         * 1
         * 2
         * :
         * 255
         */
        int intensity[][] = new int[256][3];
        int maxIntensity[] = new int[3];
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensity[img.getRed(x, y)][0]++;
                intensity[img.getGreen(x, y)][1]++;
                intensity[img.getBlue(x, y)][2]++;
            }
        }
        
        //search max intensity
        for(int i = 0; i < 256; i++){
            //max red
            if(intensity[i][0] > maxIntensity[0]){
                maxIntensity[0] = intensity[i][0];
            }
            
            //max green
            if(intensity[i][1] > maxIntensity[1]){
                maxIntensity[1] = intensity[i][1];
            }
            
            //max blue
            if(intensity[i][2] > maxIntensity[2]){
                maxIntensity[2] = intensity[i][2];
            }
        }
        
        return maxIntensity;
    }
    
    /**
     * This will return the minimum intensity frequency of the color image img.
     * 
     * @param img The color image.
     * @return minimum intensity.
     */
    public static int[] color_getMin(MyImage img){
        /**
         * intensity
         * row  col
         *      0 1 2
         * I    R G B
         * 0
         * 1
         * 2
         * :
         * 255
         */
        int intensity[][] = new int[256][3];
        int minIntensity[] = new int[]{256,256,256};
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensity[img.getRed(x, y)][0]++;
                intensity[img.getGreen(x, y)][1]++;
                intensity[img.getBlue(x, y)][2]++;
            }
        }
        
        //search min intensity
        for(int i = 0; i < 256; i++){
            //min red
            if(intensity[i][0] < minIntensity[0]){
                minIntensity[0] = intensity[i][0];
            }
            
            //min green
            if(intensity[i][1] < minIntensity[1]){
                minIntensity[1] = intensity[i][1];
            }
            
            //min blue
            if(intensity[i][2] < minIntensity[2]){
                minIntensity[2] = intensity[i][2];
            }
        }
        
        return minIntensity;
    }
}//class ends here
