package dyimagefx.morph;
import dyimagefx.MyImage;

/**
 * File: Erosion.java
 * 
 * Description:
 * Implements the image morphology operation: erosion.
 * 
 * Erosion operation is basically applied on binary image. The basic effect is to erode away the
 * boundaries of regions of foreground pixels (i.e., WHITE pixels, typically).
 * Binary images are images whose pixels have only two possible intensity values - BLACK and WHITE.
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
public class Erosion {

    /**
     * This method will perform erosion operation on the binary image img.
     * A binary image has two types of pixels - Black and White.
     * WHITE pixel has the ARGB value (255,255,255,255)
     * BLACK pixel has the ARGB value (255,0,0,0)
     * 
     * For erosion we generally consider foreground pixel. So, erodeForegroundPixel = true
     * 
     * @param img The image on which erosion operation is performed
     * @param erodeForegroundPixel If set to TRUE will perform erosion on WHITE pixels else on BLACK pixels.
     */
    public static void binaryImage(MyImage img, boolean erodeForegroundPixel){
        /**
         * Dimension of the image img.
         */
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        /**
         * This will hold the erosion result which will be copied to image img.
         */
        int output[] = new int[width * height];
        
        /**
         * If erosion is to be performed on BLACK pixels then
         * targetValue = 0
         * else
         * targetValue = 255;  //for WHITE pixels
         */
        int targetValue = (erodeForegroundPixel == true)?0:255;
        
        /**
         * If the target pixel value is WHITE (255) then the reverse pixel value will
         * be BLACK (0) and vice-versa.
         */
        int reverseValue = (targetValue == 255)?0:255;
        
        //perform erosion
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //For BLACK pixel RGB all are set to 0 and for WHITE pixel all are set to 255.
                if(img.getRed(x, y) == targetValue){
                    /**
                     * We are using a 3x3 kernel
                     * [1, 1, 1
                     *  1, 1, 1
                     *  1, 1, 1]
                     */
                    boolean flag = false;   //this will be set if a pixel of reverse value is found in the mask
                    for(int ty = y - 1; ty <= y + 1 && flag == false; ty++){
                        for(int tx = x - 1; tx <= x + 1 && flag == false; tx++){
                            if(ty >= 0 && ty < height && tx >= 0 && tx < width){
                                //origin of the mask is on the image pixels
                                if(img.getRed(tx, ty) != targetValue){
                                    flag = true;
                                    output[x+y*width] = reverseValue;
                                }
                            }
                        }
                    }
                    if(flag == false){
                        //all pixels inside the mask [i.e., kernel] were of targetValue
                        output[x+y*width] = targetValue;
                    }
                }else{
                    output[x+y*width] = reverseValue;
                }
            }
        }
        
        /**
         * Save the erosion value in image img.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int v = output[x+y*width];
                img.setPixel(x, y, 255, v, v, v);
            }
        }
    }
    
    /**
     * This method will perform erosion operation on the grayscale image img.
     * 
     * @param img The image on which erosion operation is performed
     */
    public static void grayscaleImage(MyImage img){
        /**
         * Dimension of the image img.
         */
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //buff
        int buff[];
        
        //output of erosion
        int output[] = new int[width*height];
        
        //perform erosion
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                buff = new int[9];
                int i = 0;
                for(int ty = y - 1; ty <= y + 1; ty++){
                   for(int tx = x - 1; tx <= x + 1; tx++){
                       /**
                        * 3x3 mask [kernel or structuring element]
                        * [1, 1, 1
                        *  1, 1, 1
                        *  1, 1, 1]
                        */
                       if(ty >= 0 && ty < height && tx >= 0 && tx < width){
                           //pixel under the mask
                           buff[i] = img.getRed(tx, ty);
                           i++;
                       }
                   }
                }
                
                //sort buff
                java.util.Arrays.sort(buff);
                
                //save lowest value
                output[x+y*width] = buff[9-i];
            }
        }
        
        /**
         * Save the erosion value in image img.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int v = output[x+y*width];
                img.setPixel(x, y, 255, v, v, v);
            }
        }
    }
    
    /**
     * This method will perform erosion operation on the grayscale image img.
     * It will find the minimum value among the pixels that are under the mask [element value 1] and will
     * set the origin to the minimum value.
     * 
     * @param img The image on which erosion operation is performed
     * @param mask the square mask.
     * @param maskSize the size of the square mask. [i.e., number of rows]
     */
    public static void grayscaleImage(MyImage img, int mask[], int maskSize){
        /**
         * Dimension of the image img.
         */
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        //buff
        int buff[];
        
        //output of erosion
        int output[] = new int[width*height];
        
        //perform erosion
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                buff = new int[maskSize * maskSize];
                int i = 0;
                for(int ty = y - maskSize/2, mr = 0; ty <= y + maskSize/2; ty++, mr++){
                   for(int tx = x - maskSize/2, mc = 0; tx <= x + maskSize/2; tx++, mc++){
                       /**
                        * Sample 3x3 mask [kernel or structuring element]
                        * [0, 1, 0
                        *  1, 1, 1
                        *  0, 1, 0]
                        * 
                        * Only those pixels of the image img that are under the mask element 1 are considered.
                        */
                       if(ty >= 0 && ty < height && tx >= 0 && tx < width){
                           //pixel under the mask
                           
                           if(mask[mc+mr*maskSize] != 1){
                               continue;
                           }
                           
                           buff[i] = img.getRed(tx, ty);
                           i++;
                       }
                   }
                }
                
                //sort buff
                java.util.Arrays.sort(buff);
                
                //save lowest value
                output[x+y*width] = buff[(maskSize*maskSize) - i];
            }
        }
        
        /**
         * Save the erosion value in image img.
         */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int v = output[x+y*width];
                img.setPixel(x, y, 255, v, v, v);
            }
        }
    }
}//class ends here
