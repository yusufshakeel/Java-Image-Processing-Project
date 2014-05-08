package imageFX.morph;
import imageFX.MyImage;
import imageFX.math.Subtract;

/**
 * File: Thinning.java
 * 
 * Description:
 * Implements the image morphology operation: thinning
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 29-04-2014 tue
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
public class Thinning {
    
    /**
     * This method will perform thinning operation on the binary image.
     * 
     * @param img The binary image on which thinning is performed.
     * @param mask The mask used for thinning. [Mask is a 2D matrix stored in 1D array]
     * @param maskSize The size of the mask. [No. of rows in the 2D mask matrix]
     */
    public static void binaryImage(MyImage img, int mask[], int maskSize){
        /**
         * How it works:
         * If we consider an image I and a mask M, then thinning T can be expressed as:
         * T(I,M) = I - HitMiss(I,M)
         */
        MyImage tmp = new MyImage(img);
        HitMiss.binaryImage(tmp, mask, maskSize);
        Subtract.binaryImage(img, tmp, img);
    }
}//class ends here
