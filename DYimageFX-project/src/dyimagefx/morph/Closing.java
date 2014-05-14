package dyimagefx.morph;
import dyimagefx.MyImage;

/**
 * File: Closing.java
 * 
 * Description:
 * Implements the image morphology operation: closing.
 * 
 * CLosing is defined as dilation followed by erosion of image.
 * 
 * WHITE is represented as (255,255,255,255) and BLACK as (255,0,0,0) in ARGB form respectively.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 24-04-2014 Thu
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
public class Closing {
    
    /**
     * This method will perform closing on binary image img.
     * 
     * @param img The image on which opening is performed.
     */
    public static void binaryImage(MyImage img){
        Dilation.binaryImage(img, true);
        Erosion.binaryImage(img, true);
    }
    
    /**
     * This method will perform closing on grayscale image img.
     * 
     * @param img The image on which opening is performed.
     * @param mask The square mask
     * @param maskSize The size of the square mask [No. of rows or columns of the square mask]
     */
    public static void grayscaleImage(MyImage img, int mask[], int maskSize){
        Dilation.grayscaleImage(img, mask, maskSize);
        Erosion.grayscaleImage(img, mask, maskSize);
    }
}//class ends here
