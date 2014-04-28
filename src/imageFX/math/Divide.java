package imageFX.math;
import imageFX.MyImage;

/**
 * File: Divide.java
 * 
 * Description:
 * To perform division of image pixels.
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
public class Divide {
    
    /////////////////////////////// BINARY IMAGE ////////////////////////////////
    
    /**
     * This method will divide the pixels of the binary image.
     * It takes two equal size binary images and divides their pixels.
     * The result of division is saved in resultImg which is also of the same size.
     * 
     * @param sourceImg1 The first image.
     * @param sourceImg2 The second image.
     * @param resultImg This will hold the resultant image after division of image1 and image2.
     */
    public static void binaryImage(MyImage sourceImg1, MyImage sourceImg2, MyImage resultImg){
        /**
         * Note grayscale and binary image pixel division is almost same.
         * So, calling grayscaleImage() method
         */
        grayscaleImage(sourceImg1, sourceImg2, resultImg);
    }
    
    /**
     * This method will divide the pixels of the binary image.
     * It takes a binary images and divides its pixel with a constant value C.
     * The result of division is saved in resultImg which is of same size as sourceImage.
     * 
     * @param sourceImg1 The first image.
     * @param C The constant to add. [0-255]
     * @param resultImg This will hold the resultant image after division of image1 and image2.
     */
    public static void binaryImage(MyImage sourceImg1, int C, MyImage resultImg){
        /**
         * Note grayscale and binary image pixel division is almost same.
         * So, calling grayscaleImage() method
         */
        grayscaleImage(sourceImg1, C, resultImg);
    }
    
    /////////////////////////////// GRAYSCALE IMAGE ////////////////////////////
    
    /**
     * This method will division the pixels of the grayscale image.
     * It takes two equal size grayscale images and divides their pixels.
     * The result of divisions is saved in resultImg which is also of the same size.
     * 
     * @param sourceImg1 The first image.
     * @param sourceImg2 The second image.
     * @param resultImg This will hold the resultant image after divisions of image1 and image2.
     */
    public static void grayscaleImage(MyImage sourceImg1, MyImage sourceImg2, MyImage resultImg){
        
        //image dimension - common for all the three images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int result;
        
        /**
         * divide pixels
         * Grayscale image will have same value for RGB so take any one component.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if(sourceImg2.getBlue(x, y) > 0){
                    result = sourceImg1.getBlue(x, y) / sourceImg2.getBlue(x, y);
                }else{
                    result = 0;
                }
                resultImg.setPixel(x, y, 255, result, result, result);
            }
        }
    }
    
    /**
     * This method will divide the pixels of the grayscale image.
     * It takes a grayscale images and divides its pixel with a constant value C.
     * The result of division is saved in resultImg which is of the size of sourceImage.
     * 
     * @param sourceImg1 The first image.
     * @param C constant number to add. [1-255]
     * @param resultImg This will hold the resultant image after divisions of image1 and image2.
     */
    public static void grayscaleImage(MyImage sourceImg1, int C, MyImage resultImg){

        //image dimension - common for the two images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int result;
        
        /**
         * divide pixels
         * Grayscale image will have same value for RGB so take any one component.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                result = sourceImg1.getBlue(x, y) / C;
                resultImg.setPixel(x, y, 255, result, result, result);
            }
        }
    }
    
    /////////////////////////////// COLOR IMAGE ////////////////////////////////
    
    /**
     * This method will divide the pixels of the color image.
     * It takes two equal size color images and divides their pixels.
     * The result of divisions is saved in resultImg which is also of the same size.
     * 
     * @param sourceImg1 The first image.
     * @param sourceImg2 The second image.
     * @param resultImg This will hold the resultant image after divisions of image1 and image2.
     */
    public static void colorImage(MyImage sourceImg1, MyImage sourceImg2, MyImage resultImg){
        
        //image dimension - common for all the three images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int rRED, rGREEN, rBLUE;
        
        /**
         * divide pixels
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //divide
                if(sourceImg2.getRed(x, y) > 0){
                    rRED = sourceImg1.getRed(x, y) / sourceImg2.getRed(x, y);
                }else{
                    rRED = 0;
                }
                
                if(sourceImg2.getGreen(x, y) > 0){
                    rGREEN = sourceImg1.getGreen(x, y) / sourceImg2.getGreen(x, y);
                }else{
                    rGREEN = 0;
                }
                
                if(sourceImg2.getBlue(x, y) > 0){
                    rBLUE = sourceImg1.getBlue(x, y) / sourceImg2.getBlue(x, y);
                }else{
                    rBLUE = 0;
                }
                
                //save result
                resultImg.setPixel(x, y, 255, rRED, rGREEN, rBLUE);
            }
        }
    }
    
    /**
     * This method will divide the pixels of the color image.
     * It takes a color images and divides its pixel with a constant value C.
     * The result of division is saved in resultImg which is of the size of sourceImage.
     * 
     * @param sourceImg1 The first image.
     * @param C The constant value to add. [1-255]
     * @param resultImg This will hold the resultant image after division of image1 and image2.
     */
    public static void colorImage(MyImage sourceImg1, int C, MyImage resultImg){
        
        //image dimension - common for all the three images
        int width = sourceImg1.getImageWidth();
        int height = sourceImg1.getImageHeight();
        
        //variable
        int rRED, rGREEN, rBLUE;
        
        /**
         * divide pixels
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //divide
                rRED = sourceImg1.getRed(x, y) / C;
                rGREEN = sourceImg1.getGreen(x, y) / C;
                rBLUE = sourceImg1.getBlue(x, y) / C;
                
                //save result
                resultImg.setPixel(x, y, 255, rRED, rGREEN, rBLUE);
            }
        }
    }
}//class ends here
