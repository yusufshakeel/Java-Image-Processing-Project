/**
 * NOTE! THIS FILE IS NO LONGER IN USE [OBSOLETE].
 * Check:
 * https://github.com/yusufshakeel/Java-Image-Processing-Project/blob/master/src/Obsolete.txt
 * 
 * for more details.
 * 
 */

package imageFX;
/**
 * File: ThresholdImage.java
 * 
 * Description:
 * This will threshold the image.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 26-01-2014 sun
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
public class ThresholdImage {
    
    /**
     * This method will threshold the image. It will generate a Black&White image.
     * 
     * For a given pixel at coordinate (x,y) average pixel value is
     * avgPixelValue = (r+g+b)/3
     * If thresholdValue > avgPixelValue then set Pixel (x,y) to white
     * else set Pixel (x,y) to black
     * 
     * @param img the Image object passed on which thresholding is performed.
     * @param thresholdValue value to be compared with the average pixel value.
     */
    public static void threshold_AverageOfRGBValue(MyImage img, int thresholdValue){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int r = img.getRed(x,y);
                int g = img.getGreen(x,y);
                int b = img.getBlue(x,y);
                int avgPixelValue = (r+g+b)/3;
                if(thresholdValue > avgPixelValue){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a Black&White image.
     * This method will calculate the thresholdValue and
     * If thresholdValue > avgOfRGB then set Pixel (x,y) to BLACK
     * else set Pixel (x,y) to WHITE.
     * 
     * @param img the Image object passed on which thresholding is performed.
     */
    public static void autoThreshold(MyImage img){
        
        /**
         * thresholdValue will hold the final threshold value for the image.
         * Initially thresholdValue = 127 [i.e. 255/2 = 127 (integer part)]
         * 
         * iThreshold will hold the intermediate threshold value during computation
         * of final threshold value.
         */
        int thresholdValue = 127, iThreshold;
        
        /**
         * sum1 holds the sum of avgOfRGB values less than thresholdValue.
         * sum2 holds the sum of avgOfRGB values greater than or equal to the thresholdValue.
         * count1 holds the number of pixels whose avgOfRGB value is less than thresholdValue.
         * count2 holds the number of pixels whose avgOfRGB value is greater than or equal to thresholdValue.
         */
        int sum1, sum2, count1, count2;
        
        /**
         * mean1 is equal to sum1/count1.
         * mean2 is equal to sum2/count2.
         */
        int mean1, mean2;
        
        /** searching thresholdValue */
        while(true){
            sum1 = sum2 = count1 = count2 = 0;
            for(int y = 0; y < img.getImageHeight(); y++){
                for(int x = 0; x < img.getImageWidth(); x++){
                    int r = img.getRed(x,y);
                    int g = img.getGreen(x, y);
                    int b = img.getGreen(x, y);
                    int avgOfRGB = (r+g+b)/3;
                    
                    if(avgOfRGB < thresholdValue){
                        sum1 += avgOfRGB;
                        count1++;
                    }else{
                        sum2 += avgOfRGB;
                        count2++;
                    }
                }
            }
            /** calculating mean */
            mean1 = (count1 > 0)?(int)(sum1/count1):0;
            mean2 = (count2 > 0)?(int)(sum2/count2):0;
            
            /** calculating intermediate threshold */
            iThreshold = (mean1 + mean2)/2;
            
            if(thresholdValue != iThreshold){
                thresholdValue = iThreshold;
            }else{
                break;
            }
        }
        
        /** performing thresholding on the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int r = img.getRed(x,y);
                int g = img.getGreen(x, y);
                int b = img.getBlue(x, y);
                int avgOfRGB = (r+g+b)/3;
                
                if(thresholdValue > avgOfRGB){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a Black&White image.
     * This method will calculate the thresholdValue and
     * If thresholdValue > redValueOfPixel then set Pixel (x,y) to BLACK
     * else set Pixel (x,y) to WHITE.
     * 
     * @param img the Image object passed on which thresholding is performed.
     */
    public static void autoThreshold_usingRedValueOfPixels(MyImage img){
        
        /**
         * thresholdValue will hold the final threshold value for the image.
         * Initially thresholdValue = 127 [i.e. 255/2 = 127 (integer part)]
         * 
         * iThreshold will hold the intermediate threshold value during computation
         * of final threshold value.
         */
        int thresholdValue = 127, iThreshold;
        
        /**
         * sum1 holds the sum of red values less than thresholdValue.
         * sum2 holds the sum of red values greater than or equal to the thresholdValue.
         * count1 holds the number of pixels whose red value is less than thresholdValue.
         * count2 holds the number of pixels whose red value is greater than or equal to thresholdValue.
         */
        int sum1, sum2, count1, count2;
        
        /**
         * mean1 is equal to sum1/count1.
         * mean2 is equal to sum2/count2.
         */
        int mean1, mean2;
        
        /** searching thresholdValue */
        while(true){
            sum1 = sum2 = count1 = count2 = 0;
            for(int y = 0; y < img.getImageHeight(); y++){
                for(int x = 0; x < img.getImageWidth(); x++){
                    int r = img.getRed(x,y);
                    if(r < thresholdValue){
                        sum1 += r;
                        count1++;
                    }else{
                        sum2 += r;
                        count2++;
                    }
                }
            }
            /** calculating mean */
            mean1 = (count1 > 0)?(int)(sum1/count1):0;
            mean2 = (count2 > 0)?(int)(sum2/count2):0;
            
            /** calculating intermediate threshold */
            iThreshold = (mean1 + mean2)/2;
            
            if(thresholdValue != iThreshold){
                thresholdValue = iThreshold;
            }else{
                break;
            }
        }
        
        /** performing thresholding on the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int r = img.getRed(x,y);
                if(thresholdValue > r){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a Black&White image.
     * This method will calculate the thresholdValue and
     * If thresholdValue > greenValueOfPixel then set Pixel (x,y) to BLACK
     * else set Pixel (x,y) to WHITE.
     * 
     * @param img the Image object passed on which thresholding is performed.
     */
    public static void autoThreshold_usingGreenValueOfPixels(MyImage img){
        
        /**
         * thresholdValue will hold the final threshold value for the image.
         * Initially thresholdValue = 127 [i.e. 255/2 = 127 (integer part)]
         * 
         * iThreshold will hold the intermediate threshold value during computation
         * of final threshold value.
         */
        int thresholdValue = 127, iThreshold;
        
        /**
         * sum1 holds the sum of green values less than thresholdValue.
         * sum2 holds the sum of green values greater than or equal to the thresholdValue.
         * count1 holds the number of pixels whose green value is less than thresholdValue.
         * count2 holds the number of pixels whose green value is greater than or equal to thresholdValue.
         */
        int sum1, sum2, count1, count2;
        
        /**
         * mean1 is equal to sum1/count1.
         * mean2 is equal to sum2/count2.
         */
        int mean1, mean2;
        
        /** searching thresholdValue */
        while(true){
            sum1 = sum2 = count1 = count2 = 0;
            for(int y = 0; y < img.getImageHeight(); y++){
                for(int x = 0; x < img.getImageWidth(); x++){
                    int g = img.getGreen(x,y);
                    if(g < thresholdValue){
                        sum1 += g;
                        count1++;
                    }else{
                        sum2 += g;
                        count2++;
                    }
                }
            }
            /** calculating mean */
            mean1 = (count1 > 0)?(int)(sum1/count1):0;
            mean2 = (count2 > 0)?(int)(sum2/count2):0;
            
            /** calculating intermediate threshold */
            iThreshold = (mean1 + mean2)/2;
            
            if(thresholdValue != iThreshold){
                thresholdValue = iThreshold;
            }else{
                break;
            }
        }
        
        /** performing thresholding on the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int g = img.getGreen(x,y);
                if(thresholdValue > g){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a Black&White image.
     * This method will calculate the thresholdValue and
     * If thresholdValue > blueValueOfPixel then set Pixel (x,y) to BLACK
     * else set Pixel (x,y) to WHITE.
     * 
     * @param img the Image object passed on which thresholding is performed.
     */
    public static void autoThreshold_usingBlueValueOfPixels(MyImage img){
        
        /**
         * thresholdValue will hold the final threshold value for the image.
         * Initially thresholdValue = 127 [i.e. 255/2 = 127 (integer part)]
         * 
         * iThreshold will hold the intermediate threshold value during computation
         * of final threshold value.
         */
        int thresholdValue = 127, iThreshold;
        
        /**
         * sum1 holds the sum of blue values less than thresholdValue.
         * sum2 holds the sum of blue values greater than or equal to the thresholdValue.
         * count1 holds the number of pixels whose blue value is less than thresholdValue.
         * count2 holds the number of pixels whose blue value is greater than or equal to thresholdValue.
         */
        int sum1, sum2, count1, count2;
        
        /**
         * mean1 is equal to sum1/count1.
         * mean2 is equal to sum2/count2.
         */
        int mean1, mean2;
        
        /** searching thresholdValue */
        while(true){
            sum1 = sum2 = count1 = count2 = 0;
            for(int y = 0; y < img.getImageHeight(); y++){
                for(int x = 0; x < img.getImageWidth(); x++){
                    int b = img.getBlue(x,y);
                    if(b < thresholdValue){
                        sum1 += b;
                        count1++;
                    }else{
                        sum2 += b;
                        count2++;
                    }
                }
            }
            /** calculating mean */
            mean1 = (count1 > 0)?(int)(sum1/count1):0;
            mean2 = (count2 > 0)?(int)(sum2/count2):0;
            
            /** calculating intermediate threshold */
            iThreshold = (mean1 + mean2)/2;
            
            if(thresholdValue != iThreshold){
                thresholdValue = iThreshold;
            }else{
                break;
            }
        }
        
        /** performing thresholding on the image pixels */
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int b = img.getBlue(x,y);
                if(thresholdValue > b){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
}//class ThresholdImage ends here
