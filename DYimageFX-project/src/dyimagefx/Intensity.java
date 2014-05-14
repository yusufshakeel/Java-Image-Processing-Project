package dyimagefx;
/**
 * File: Intensity.java
 * 
 * Description:
 * This will find max and min intensity of the image.
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
public class Intensity {
    
    ///////////////////////////// GRAYSCALE IMAGE //////////////////////////////
    
    /**
     * This will return the maximum intensity of the grayscale image img.
     * 
     * @param img The grayscale image.
     * @return maximum intensity.
     */
    public static int grayscale_getMax(MyImage img){
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //for grayscale image RGB value is same. So considering RED value.
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int r = img.getRed(x, y);
                if(r > maxIntensity){
                    maxIntensity = r;
                }
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
        int minIntensity = 255;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //for grayscale image RGB value is same. So considering RED value.
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int r = img.getRed(x, y);
                if(r < minIntensity){
                    minIntensity = r;
                }
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
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int r = img.getRed(x, y);
                if(r > maxIntensity){
                    maxIntensity = r;
                }
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
        int minIntensity = 255;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int r = img.getRed(x, y);
                if(r < minIntensity){
                    minIntensity = r;
                }
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
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int g = img.getGreen(x, y);
                if(g > maxIntensity){
                    maxIntensity = g;
                }
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
        int minIntensity = 255;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int g = img.getGreen(x, y);
                if(g < minIntensity){
                    minIntensity = g;
                }
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
        int maxIntensity = 0;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int b = img.getBlue(x, y);
                if(b > maxIntensity){
                    maxIntensity = b;
                }
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
        int minIntensity = 255;
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int b = img.getBlue(x, y);
                if(b < minIntensity){
                    minIntensity = b;
                }
            }
        }
        return minIntensity;
    }
    
    ///////////////////////////// COLOR IMAGE //////////////////////////////////
    
    /**
     * This will return the maximum intensity of the color image img.
     * 
     * @param img The color image.
     * @return maximum intensity array having 3 elements for RGB.
     */
    public static int[] color_getMax(MyImage img){
        int maxIntensity[] = new int[3];
        maxIntensity[0] = red_getMax(img);
        maxIntensity[1] = green_getMax(img);
        maxIntensity[2] = blue_getMax(img);
        return maxIntensity;
    }
    
    /**
     * This will return the minimum intensity of the color image img.
     * 
     * @param img The color image.
     * @return minimum intensity.
     */
    public static int[] color_getMin(MyImage img){
        int minIntensity[] = new int[3];
        minIntensity[0] = red_getMin(img);
        minIntensity[1] = green_getMin(img);
        minIntensity[2] = blue_getMin(img);
        return minIntensity;
    }
}//class ends here
