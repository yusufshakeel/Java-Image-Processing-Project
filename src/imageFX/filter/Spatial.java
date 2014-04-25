package imageFX.filter;

import imageFX.ImageFX;
import imageFX.MyImage;

/**
 * File: Spatial.java
 * 
 * Description:
 * This will perform spatial - conservative smoothing.
 * It is a noise reduction technique.
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
public class Spatial {
    
    /**
     * This method is used to perform spatial filtering on the image object passed.
     * Also known as Conservative smoothing and used for noise reduction.
     * 
     * @param img The image object passed on which spatial filtering is performed.
     * @param maskSize - The size of the mask is an odd integer like 3, 5, 7 … etc.
     */
    public static void spatialFilter_RGB(MyImage img, int maskSize){
        
        /** 
         * This array will store the output of the spatial filter operation which will
         * be later written back to the original image pixels.
         */
        int outputPixels[] = new int[img.getImageTotalPixels()];
        
        //image dimension
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        
        /**
         * red, green and blue are a 2D square of odd size like 3x3, 5x5, 7x7, ...
         * For simplicity storing it into 1D array.
         */
        int red[], green[], blue[];
        
        /** spatial Filter operation */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                red = new int[maskSize * maskSize];
                green = new int [maskSize * maskSize];
                blue = new int [maskSize * maskSize];
                int count = 0;
                for(int r = y - (maskSize / 2); r <= y + (maskSize / 2); r++){
                    for(int c = x - (maskSize / 2); c <= x + (maskSize / 2); c++){
                        if(r < 0 || r >= height || c < 0 || c >= width){
                            /** Some portion of the mask is outside the image. */
                            continue;
                        }else if(x == c && y == r){
                            /** pixel below the center of the mask */
                            continue;
                        }else{
                            red[count] = img.getRed(c, r);
                            green[count] = img.getGreen(c, r);
                            blue[count] = img.getBlue(c, r);
                            count++;
                        }
                    }
                }
                
                /** sort red, green, blue array */
                java.util.Arrays.sort(red);
                java.util.Arrays.sort(green);
                java.util.Arrays.sort(blue);
                
                //RGB value of image pixel
                int pixelRED = img.getRed(x, y);
                int pixelGREEN = img.getGreen(x, y);
                int pixelBLUE = img.getBlue(x, y);
                
                //final RGB value
                int fRED, fGREEN, fBLUE;
                
                //compute final RGB value
                if(pixelRED > red[maskSize*maskSize - 1]){
                    fRED = red[maskSize*maskSize - 1];
                }else if(pixelRED < red[maskSize*maskSize - count]){
                    fRED = red[maskSize*maskSize - count];
                }else{
                    fRED = pixelRED;
                }
                
                if(pixelGREEN > green[maskSize*maskSize - 1]){
                    fGREEN = green[maskSize*maskSize - 1];
                }else if(pixelGREEN < green[maskSize*maskSize - count]){
                    fGREEN = green[maskSize*maskSize - count];
                }else{
                    fGREEN = pixelGREEN;
                }
                
                if(pixelBLUE > blue[maskSize*maskSize - 1]){
                    fBLUE = blue[maskSize*maskSize - 1];
                }else if(pixelBLUE < blue[maskSize*maskSize - count]){
                    fBLUE = blue[maskSize*maskSize - count];
                }else{
                    fBLUE = pixelBLUE;
                }
                
                /** save spatial value in outputPixels array */
                int p = ImageFX.getPixelValueFromARGBValue(255, fRED, fGREEN, fBLUE);
                outputPixels[x+y*width] = p;
            }
        }
        /** Write the output pixels to the image pixels */
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                img.setPixelToValue(x, y, outputPixels[x+y*width]);
            }
        }
    }
}//class ends here
