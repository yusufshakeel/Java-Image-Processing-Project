package imageFX.detect;
import imageFX.MyImage;
import imageFX.morph.HitMiss;
import imageFX.math.LogicalOR;

/**
 * File: CornerPoints.java
 * 
 * Description:
 * This will find the corner points in the image.
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
public class CornerPoints {
    
    /**
     * This method will find the corner points of a binary image using hit-miss morphological technique.
     * 
     * @param img The image on which corner points detection operation is performed
     * @return Binary Image having only corner points.
     */
    public static void binaryImage(MyImage img){
        
        /**
         * The 2D mask array has three types of values.
         * 0 for BLACK i.e., BACKGROUND
         * 1 for WHITE i.e., FOREGROUND
         * 2 for DON'T CARE
         * 
         * How it works:
         * To find the corner points we perform the hit-miss operation 4 times on the image img
         * using 4 different mask separately.
         * Then we perform LogicalOR operation on the 4 images to get the final result.
         */

        //1st hit-miss operation
        int mask1[] = new int[]{
            2,1,2,
            0,1,1,
            0,0,2
        };
        MyImage img1 = new MyImage(img);
        HitMiss.binaryImage(img1, mask1, 3);
        
        //2nd hit-miss operation
        int mask2[] = new int[]{
            2,1,2,
            1,1,0,
            2,0,0
        };
        MyImage img2 = new MyImage(img);
        HitMiss.binaryImage(img2, mask2, 3);
        
        //3rd hit-miss operation
        int mask3[] = new int[]{
            2,0,0,
            1,1,0,
            2,1,2
        };
        MyImage img3 = new MyImage(img);
        HitMiss.binaryImage(img3, mask3, 3);
        
        //4th hit-miss operation
        int mask4[] = new int[]{
            0,0,2,
            0,1,1,
            2,1,2
        };
        MyImage img4 = new MyImage(img);
        HitMiss.binaryImage(img4, mask4, 3);
        
        //LogicalOR the 4 images
        LogicalOR.binaryImage(img1, img2, img);
        LogicalOR.binaryImage(img, img3, img);
        LogicalOR.binaryImage(img, img4, img);
    }
}//class ends here
