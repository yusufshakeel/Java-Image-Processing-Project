package dyimagefx;
/**
 * File: IntensityFreq.java
 * 
 * Description:
 * This will find max and min intensity as per frequency of the image.
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
    
    ///////////////////////////// GRAYSCALE IMAGE //////////////////////////////
    
    /**
     * This will return the maximum intensity of the grayscale image img.
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
     * This will return the minimum intensity of the grayscale image img.
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
    
    ///////////////////////////// RED IMAGE ////////////////////////////////////
    
    /**
     * This will return the maximum intensity of the RED image img.
     * 
     * @param img The RED image.
     * @return maximum intensity.
     */
    public static int red_getMax(MyImage img){
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
     * This will return the minimum intensity of the RED image img.
     * 
     * @param img The RED image.
     * @return minimum intensity.
     */
    public static int red_getMin(MyImage img){
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
    
    ///////////////////////////// GREEN IMAGE //////////////////////////////////
    
    /**
     * This will return the maximum intensity of the GREEN image img.
     * 
     * @param img The GREEN image.
     * @return maximum intensity.
     */
    public static int green_getMax(MyImage img){
        int intensityFreq[] = new int[256];
        int maxFreq = 0;
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getGreen(x, y)]++;
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
     * This will return the minimum intensity of the GREEN image img.
     * 
     * @param img The GREEN image.
     * @return minimum intensity.
     */
    public static int green_getMin(MyImage img){
        int intensityFreq[] = new int[256];
        int minFreq;
        int minIntensity;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getGreen(x, y)]++;
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
    
    ///////////////////////////// BLUE IMAGE ///////////////////////////////////
    
    /**
     * This will return the maximum intensity of the BLUE image img.
     * 
     * @param img The BLUE image.
     * @return maximum intensity.
     */
    public static int blue_getMax(MyImage img){
        int intensityFreq[] = new int[256];
        int maxFreq = 0;
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getBlue(x, y)]++;
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
     * This will return the minimum intensity of the BLUE image img.
     * 
     * @param img The BLUE image.
     * @return minimum intensity.
     */
    public static int blue_getMin(MyImage img){
        int intensityFreq[] = new int[256];
        int minFreq;
        int minIntensity;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //get intensity
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                intensityFreq[img.getBlue(x, y)]++;
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
    
    ///////////////////////////// COLOR IMAGE //////////////////////////////////
    
    /**
     * This will return the maximum intensity of the color image img.
     * 
     * @param img The color image.
     * @return maximum intensity array having 3 elements.
     */
    public static int[] color_getMax(MyImage img){
        int maxIntensity[] = new int[3];
        maxIntensity[0] = red_getMax(img);
        maxIntensity[1] = green_getMax(img);
        maxIntensity[2] = blue_getMax(img);
        return maxIntensity;
    }
    
    /**
     * This will return the minimum intensity as per frequency of the color image img.
     * 
     * @param img The color image.
     * @return minimum intensity array having 3 elements.
     */
    public static int[] color_getMin(MyImage img){
        int minIntensity[] = new int[3];
        minIntensity[0] = red_getMin(img);
        minIntensity[1] = green_getMin(img);
        minIntensity[2] = blue_getMin(img);
        return minIntensity;
    }
}//class ends here
