package dyimagefx.math;
import dyimagefx.MyImage;

/**
 * File: Subtract.java
 * 
 * Description:
 * To perform subtraction of image pixels.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 25-04-2014 fri
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
public class Subtract {
    
    /////////////////////////////// BINARY IMAGE ////////////////////////////////
    
    /**
     * This method will subtract the pixels of the binary image.
     * It takes two equal size binary images and subtract their pixels.
     * The result of subtraction is saved in resultImg which is also of the same size.
     * 
     * @param sourceImg1 The first image.
     * @param sourceImg2 The second image.
     * @param resultImg This will hold the resultant image after subtraction of image1 and image2.
     */
    public static void binaryImage(MyImage sourceImg1, MyImage sourceImg2, MyImage resultImg){
        /**
         * Note grayscale and binary image pixel subtraction is almost same.
         * So, calling grayscaleImage() method
         */
        grayscaleImage(sourceImg1, sourceImg2, resultImg);
    }
    
    /**
     * This method will subtract the pixels of the binary image.
     * It takes a binary images and subtracts its pixel with a constant value C.
     * The result of subtraction is saved in resultImg which is of same size as sourceImage.
     * 
     * @param sourceImg1 The first image.
     * @param C The constant to add. [0-255]
     * @param resultImg This will hold the resultant image after subtraction of image1 and image2.
     */
    public static void binaryImage(MyImage sourceImg1, int C, MyImage resultImg){
        /**
         * Note grayscale and binary image pixel subtraction is almost same.
         * So, calling grayscaleImage() method
         */
        grayscaleImage(sourceImg1, C, resultImg);
    }
    
    /////////////////////////////// GRAYSCALE IMAGE ////////////////////////////
    
    /**
     * This method will subtract the pixels of the grayscale image.
     * It takes two equal size grayscale images and subtracts their pixels.
     * The result of subtraction is saved in resultImg which is also of the same size.
     * 
     * @param sourceImg1 The first image.
     * @param sourceImg2 The second image.
     * @param resultImg This will hold the resultant image after subtraction of image1 and image2.
     */
    public static void grayscaleImage(MyImage sourceImg1, MyImage sourceImg2, MyImage resultImg){
        
        //image dimension - common for all the three images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int p, result;
        
        /**
         * subtract pixels
         * Grayscale image will have same value for RGB so take any one component.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                p = Math.abs(sourceImg1.getBlue(x, y) - sourceImg2.getBlue(x, y));
                result = (p<0)?0:p;
                resultImg.setPixel(x, y, 255, result, result, result);
            }
        }
    }
    
    /**
     * This method will subtract the pixels of the grayscale image.
     * It takes a grayscale images and subtracts its pixel with a constant value C.
     * The result of subtraction is saved in resultImg which is of the size of sourceImage.
     * 
     * @param sourceImg1 The first image.
     * @param C constant number to add. [0-255]
     * @param resultImg This will hold the resultant image after subtraction of image1 and image2.
     */
    public static void grayscaleImage(MyImage sourceImg1, int C, MyImage resultImg){
        
        //image dimension - common for the two images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int p, result;
        
        /**
         * subtract pixels
         * Grayscale image will have same value for RGB so take any one component.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                p = Math.abs(sourceImg1.getBlue(x, y) - C);
                result = (p<0)?0:p;
                resultImg.setPixel(x, y, 255, result, result, result);
            }
        }
    }
    
    /////////////////////////////// COLOR IMAGE ////////////////////////////////
    
    /**
     * This method will subtract the pixels of the color image.
     * It takes two equal size color images and subtracts their pixels.
     * The result of subtraction is saved in resultImg which is also of the same size.
     * 
     * @param sourceImg1 The first image.
     * @param sourceImg2 The second image.
     * @param resultImg This will hold the resultant image after subtraction of image1 and image2.
     */
    public static void colorImage(MyImage sourceImg1, MyImage sourceImg2, MyImage resultImg){
        
        //image dimension - common for all the three images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int pRED, pGREEN, pBLUE, rRED, rGREEN, rBLUE;
        
        /**
         * subtract pixels
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //subtract the RGB components of the two source image
                pRED = Math.abs(sourceImg1.getRed(x, y) - sourceImg2.getRed(x, y));
                pGREEN = Math.abs(sourceImg1.getGreen(x, y) - sourceImg2.getGreen(x, y));
                pBLUE = Math.abs(sourceImg1.getBlue(x, y) - sourceImg2.getBlue(x, y));
                
                //find result
                rRED = (pRED<0)?0:pRED;
                rGREEN = (pGREEN<0)?0:pGREEN;
                rBLUE = (pBLUE<0)?0:pBLUE;
                
                //save result
                resultImg.setPixel(x, y, 255, rRED, rGREEN, rBLUE);
            }
        }
    }
    
    /**
     * This method will subtract the pixels of the color image.
     * It takes a color images and subtracts its pixel with a constant value C.
     * The result of subtraction is saved in resultImg which is of the size of sourceImage.
     * 
     * @param sourceImg1 The first image.
     * @param C The constant value to add. [0-255]
     * @param resultImg This will hold the resultant image after subtraction of image1 and image2.
     */
    public static void colorImage(MyImage sourceImg1, int C, MyImage resultImg){
        
        //image dimension - common for all the three images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int pRED, pGREEN, pBLUE, rRED, rGREEN, rBLUE;
        
        /**
         * subtract pixels
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //subtract the RGB components of the two source image
                pRED = Math.abs(sourceImg1.getRed(x, y) - C);
                pGREEN = Math.abs(sourceImg1.getGreen(x, y) - C);
                pBLUE = Math.abs(sourceImg1.getBlue(x, y) - C);
                
                //find result
                rRED = (pRED<0)?0:pRED;
                rGREEN = (pGREEN<0)?0:pGREEN;
                rBLUE = (pBLUE<0)?0:pBLUE;
                
                //save result
                resultImg.setPixel(x, y, 255, rRED, rGREEN, rBLUE);
            }
        }
    }
}//class ends here
