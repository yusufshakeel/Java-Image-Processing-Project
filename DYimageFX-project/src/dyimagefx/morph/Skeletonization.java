package dyimagefx.morph;
import dyimagefx.MyImage;
import dyimagefx.morph.Thinning;

/**
 * File: Skeletonization.java
 * 
 * Description:
 * This will create a thin the image.
 * It uses Thinning morphological concept.
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
public class Skeletonization {
    
    /**
     * This method will perform skeletonization [thinning] operation on the binary image img.
     * 
     * @param img The image to thin.
     */
    public static void binaryImage(MyImage img){
        
        //1st set of masks
        int mask1[] = new int[]{
            0,0,0,
            2,1,2,
            1,1,1
        };
        int mask2[] = new int[]{
            0,2,1,
            0,1,1,
            0,2,1
        };
        int mask3[] = new int[]{
            1,1,1,
            2,1,2,
            0,0,0
        };
        int mask4[] = new int[]{
            1,2,0,
            1,1,0,
            1,2,0
        };
        
        //2nd set of masks
        int mask5[] = new int[]{
            2,0,0,
            1,1,0,
            2,1,2
        };
        int mask6[] = new int[]{
            0,0,2,
            0,1,1,
            2,1,2
        };
        int mask7[] = new int[]{
            2,1,2,
            0,1,1,
            0,0,2
        };
        int mask8[] = new int[]{
            2,1,2,
            1,1,0,
            2,0,0
        };
        
        //thin image till no change occurs
        MyImage tmpImg;
        int count = 0;
        do{
            tmpImg = new MyImage(img);
            
            //thin with mask1
            Thinning.binaryImage(img, mask1, 3);
            
            //thin with mask5
            Thinning.binaryImage(img, mask5, 3);
            
            //thin with rest of the masks
            Thinning.binaryImage(img, mask2, 3);
            Thinning.binaryImage(img, mask3, 3);
            Thinning.binaryImage(img, mask4, 3);
            Thinning.binaryImage(img, mask6, 3);
            Thinning.binaryImage(img, mask7, 3);
            Thinning.binaryImage(img, mask8, 3);
            
            count++;
            System.out.println("Skeletonization() Loop Executed: "+count+" times.");
        }while(img.isEqual(tmpImg) == false);   //change occured, so continue with the loop
    }
}//class ends here
