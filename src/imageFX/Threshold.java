package imageFX;
/**
 * File: Threshold.java
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
public class Threshold {
    
    /**
     * Note:
     * Thresholding of an image will produce a binary image.
     * A binary image is an image having only two types of pixel - BLACK and WHITE.
     * ARGB value of BLACK = (255,0,0,0)
     * ARGB value of WHITE = (255,255,255,255)
     * BLACK pixel denotes the background color.
     * WHITE pixel denotes the foreground color.
     * 
     * If the pixel intensity value is greater than threshold value then that pixel is set to WHITE.
     * else the pixel is set to BLACK.
     */
    
    
    ////////////////////////////// THRESHOLDING ////////////////////////////////
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * 
     * For a given pixel at coordinate (x,y) average pixel value is
     * avgPixelValue = (r+g+b)/3
     * If avgPixelValue > thresholdValue then set Pixel (x,y) to white
     * else set Pixel (x,y) to black
     * 
     * @param img the Image object passed on which thresholding is performed.
     * @param thresholdValue value to be compared with the average pixel value.
     */
    public static void averageOfRGBValue(MyImage img, int thresholdValue){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int r = img.getRed(x,y);
                int g = img.getGreen(x,y);
                int b = img.getBlue(x,y);
                int avgPixelValue = (r+g+b)/3;
                if(avgPixelValue > thresholdValue){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    
    //////////////////////////// AUTO THRESHOLDING /////////////////////////////
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the thresholdValue and
     * If avgOfRGB > thresholdValue then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK
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
        
        /** calculating thresholdValue */
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
                
                if(avgOfRGB > thresholdValue){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the thresholdValue and
     * If redValueOfPixel > thresholdValue then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK
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
        
        /** calculate thresholdValue using only the R value of the pixel */
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
                if(r > thresholdValue){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the thresholdValue and
     * If greenValueOfPixel > thresholdValue then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK
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
        
        /** calculate thresholdValue using only the G value of the pixel */
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
                if(g > thresholdValue){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the thresholdValue and
     * If blueValueOfPixel > thresholdValue then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK
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
        
        /** calculating thresholdValue using only the B value of the pixel */
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
                if(b > thresholdValue){
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }else{
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }
            }
        }
    }
    
    /////////////////////////////// ADAPTIVE THRESHOLD /////////////////////////
    
    /**
     * Pixels under a 3x3 mask
     *    |
     *    V
     * +-+-+-+
     * |2|1|3|
     * +-+-+-+
     * |9|4|5|
     * +-+-+-+
     * |6|7|8|
     * +-+-+-+
     */
    
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the mean of the pixels under a mask of dimension: size x size.
     * 
     * If value of pixel(x,y) > mean then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK.
     * 
     * @param img the Image object passed on which thresholding is performed.
     * @param maskSize The size of the mask. [3,5,7,9,...]
     * @param C The constant value that is subtracted from mean. [3,7,10,...]
     */
    public static void adaptiveThreshold_Mean(MyImage img, int maskSize, int C){
        
        //image img dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //output array it will hold the result of threshold that will be saaved back to img
        int output[] = new int[img.getImageTotalPixels()];
        
        //variables
        int blue, mean, count;
        
        /** find mean and threshold the pixel */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                blue = 0;
                count = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r >= height || c < 0 || c >= width){
                            /** Some portion of the mask is outside the image. */
                            continue;
                        }else{
                            try{
                                blue += img.getBlue(c, r);
                                count++;
                            }catch(ArrayIndexOutOfBoundsException e){
                            }
                        }
                    }
                }
                
                /** get mean pixel value */
                mean = blue/count - C;
                
                //adaptive threshold - mean
                if(img.getBlue(x, y) > mean){
                    output[x+y*width] = 0xffffffff;     //WHITE
                }else{
                    output[x+y*width] = 0xff000000;     //BLACK
                }
            }
        }
        
        //save output value in image img
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                img.setPixelToValue(x, y, output[x+y*width]);
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the median of the pixels under a mask of dimension: size x size.
     * 
     * If value of pixel(x,y) > median then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK.
     * 
     * @param img the Image object passed on which thresholding is performed.
     * @param maskSize The size of the mask. [3,5,7,9,...]
     * @param C The constant value that is subtracted from median. [3,7,10,...]
     */
    public static void adaptiveThreshold_Median(MyImage img, int maskSize, int C){
        
        //image img dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //output array it will hold the result of threshold that will be saaved back to img
        int output[] = new int[img.getImageTotalPixels()];
        
        //variables
        int blue[], median, count;
        
        /** find median and threshold the pixel */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                blue = new int[maskSize*maskSize];
                count = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r >= height || c < 0 || c >= width){
                            /** Some portion of the mask is outside the image. */
                            continue;
                        }else{
                            try{
                                blue[count] = img.getBlue(c, r);
                                count++;
                            }catch(ArrayIndexOutOfBoundsException e){
                            }
                        }
                    }
                }
                
                /** sort blue array */
                java.util.Arrays.sort(blue);
                
                /** get median pixel value */
                median = blue[count/2] - C;
                
                //adaptive threshold - median
                if(img.getBlue(x, y) > median){
                    output[x+y*width] = 0xffffffff;     //WHITE
                }else{
                    output[x+y*width] = 0xff000000;     //BLACK
                }
            }
        }
        
        //save output value in image img
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                img.setPixelToValue(x, y, output[x+y*width]);
            }
        }
    }
    
    /**
     * This method will threshold the image. It will generate a binary image.
     * This method will calculate the max and min value of the pixels under a mask of dimension: size x size.
     * t = (max+min)/2 - C;
     * If value of pixel(x,y) > t then set Pixel (x,y) to WHITE
     * else set Pixel (x,y) to BLACK.
     * 
     * @param img the Image object passed on which thresholding is performed.
     * @param maskSize The size of the mask. [3,5,7,9,...]
     * @param C The constant value that is subtracted from median. [3,7,10,...]
     */
    public static void adaptiveThreshold_MaxMin(MyImage img, int maskSize, int C){
        
        //image img dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //output array it will hold the result of threshold that will be saaved back to img
        int output[] = new int[img.getImageTotalPixels()];
        
        //variables
        int blue, max, min, t;
        
        /** find max-min and threshold the pixel */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                max = 0;
                min = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r >= height || c < 0 || c >= width){
                            /** Some portion of the mask is outside the image. */
                            continue;
                        }else{
                            try{
                                blue = img.getBlue(c, r);
                                if(blue > max){
                                    max = blue;
                                }
                                if(blue < min){
                                    min = blue;
                                }
                            }catch(ArrayIndexOutOfBoundsException e){
                            }
                        }
                    }
                }
                
                /** calculate threshold value t */
                t = ((max+min)/2) - C;
                
                //adaptive threshold - maxmin
                if(img.getBlue(x, y) > t){
                    output[x+y*width] = 0xffffffff;     //WHITE
                }else{
                    output[x+y*width] = 0xff000000;     //BLACK
                }
            }
        }
        
        //save output value in image img
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                img.setPixelToValue(x, y, output[x+y*width]);
            }
        }
    }
}//class ThresholdImage ends here
