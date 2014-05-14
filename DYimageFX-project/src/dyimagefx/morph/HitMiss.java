package dyimagefx.morph;
import dyimagefx.MyImage;

/**
 * File: HitMiss.java
 * 
 * Description:
 * Implements the image morphology operation: hit-miss
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
public class HitMiss {
    
    ///////////////////////// BINARY IMAGE /////////////////////////////////////
    
    /**
     * This method will perform hit-miss operation on the binary image img.
     * A binary image has two types of pixels - Black and White.
     * WHITE pixel has the ARGB value (255,255,255,255)
     * BLACK pixel has the ARGB value (255,0,0,0)
     * 
     * The 2D mask array has three types of values.
     * 0 for BLACK i.e., BACKGROUND
     * 1 for WHITE i.e., FOREGROUND
     * 2 for DON'T CARE
     * 
     * @param img The image on which hit miss operation is performed
     * @param mask 2D array of square mask.
     * @param maskSize The size of the square mask - no. of rows.
     */
    public static void binaryImage(MyImage img,int mask[], int maskSize){
        /**
         * Dimension of the image img.
         */
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        /**
         * This will hold the dilation result which will be copied to image img.
         */
        int output[] = new int[width * height];
        
        //perform hit-miss
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                boolean flag = false;   //this will be set if mismatch is found
                for(int ty = y - (maskSize/2), mr = 0; ty <= y + (maskSize/2) && flag == false; ty++, mr++){
                    for(int tx = x - (maskSize/2), mc = 0; tx <= x + (maskSize/2) && flag == false; tx++, mc++){
                        //pixel under the mask
                        if(ty >= 0 && ty < height && tx >= 0 && tx < width){
                            
                            //for don't-care value in mask
                            if(mask[mc+mr*maskSize] > 1){
                                continue;
                            }
                                
                            //if image pixel not same as mask
                            if(img.getRed(tx, ty) != (mask[mc+mr*maskSize]*255)){
                                flag = true;
                                output[x+y*width] = 0;  //BLACK
                                break;
                            }
                        }
                    }
                }
                if(flag == false){
                    //all pixels of image under the mask has matched
                    output[x+y*width] = 255;    //FOREGROUND COLOR WHITE
                }
            }
        }
        
        /**
         * Save the hit miss value in image img.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int v = output[x+y*width];
                img.setPixel(x, y, 255, v, v, v);
            }
        }
    }
}//class ends here
