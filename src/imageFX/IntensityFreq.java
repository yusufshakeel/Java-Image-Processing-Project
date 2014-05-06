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
        int intensityFreq[] = new int[256];
        int maxFreq = 0;
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getRed(x, y)]++;
            }
        }
        
        //search max intensity
        for(int i = 0; i < 256; i++){
            if(intensityFreq[i] > maxFreq){
                maxIntensity = i;
                maxFreq = intensityFreq[i];
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
        int intensityFreq[] = new int[256];
        int minFreq;
        int minIntensity;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getRed(x, y)]++;
            }
        }
        
        //minIntensity
        minFreq = width*height + 1;
        minIntensity = 0;
        
        //search min intensity
        for(int i = 0; i < 256; i++){
            if(intensityFreq[i] < minFreq && intensityFreq[i] > 0){
                minIntensity = i;
                minFreq = intensityFreq[i];
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
        int intensityFreq[][] = new int[256][3];
        int maxIntensity[] = new int[3];
        int maxFreq[] = new int[3];
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getRed(x, y)][0]++;
                intensityFreq[img.getGreen(x, y)][1]++;
                intensityFreq[img.getBlue(x, y)][2]++;
            }
        }
        
        //search max intensity
        for(int i = 0; i < 256; i++){
            //max red
            if(intensityFreq[i][0] > maxFreq[0]){
                maxIntensity[0] = i;
                maxFreq[0] = intensityFreq[i][0];
            }
            
            //max green
            if(intensityFreq[i][1] > maxFreq[1]){
                maxIntensity[1] = i;
                maxFreq[1] = intensityFreq[i][1];
            }
            
            //max blue
            if(intensityFreq[i][2] > maxFreq[2]){
                maxIntensity[2] = i;
                maxFreq[2] = intensityFreq[i][2];
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
        int intensityFreq[][] = new int[256][3];
        int minIntensity[] = new int[3];
        int minFreq[] = new int[3];
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getRed(x, y)][0]++;
                intensityFreq[img.getGreen(x, y)][1]++;
                intensityFreq[img.getBlue(x, y)][2]++;
            }
        }
        
        //initialize
        minFreq[0] = width*height + 1;
        minFreq[1] = width*height + 1;
        minFreq[2] = width*height + 1;
        minIntensity[0] = 0;
        minIntensity[1] = 0;
        minIntensity[2] = 0;

        //search min intensity
        for(int i = 0; i < 256; i++){
            //min red
            if(intensityFreq[i][0] < minFreq[0] && intensityFreq[i][0] > 0){
                minIntensity[0] = i;
                minFreq[0] = intensityFreq[i][0];
            }
            
            //min green
            if(intensityFreq[i][1] < minFreq[1] && intensityFreq[i][1] > 0){
                minIntensity[1] = i;
                minFreq[1] = intensityFreq[i][1];
            }
            
            //min blue
            if(intensityFreq[i][2] < minFreq[2] && intensityFreq[i][2] > 0){
                minIntensity[2] = i;
                minFreq[2] = intensityFreq[i][2];
            }
        }
        
        return minIntensity;
    }
}//class ends here
