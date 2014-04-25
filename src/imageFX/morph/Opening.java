package imageFX.morph;
import imageFX.MyImage;

/**
 * File: Opening.java
 * 
 * Description:
 * Implements the image morphology operation: opening.
 * 
 * Opening is defined as an erosion followed by a dilation.
 * 
 * WHITE is represented as (255,255,255,255) and BLACK as (255,0,0,0) in ARGB form respectively.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 24-042014 Thu
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
public class Opening {
    
    /**
     * This method will perform opening on image img.
     * 
     * For erosion we generally consider foreground pixel. So, erodeBlackpixel = false
     * For dilation we generally consider the background pixel. So, dilateBlackPixel = true.
     * 
     * @param img The image on which opening is performed.
     * @param erodeBlackPixel If set to TRUE will perform erosion on BLACK pixels else on WHITE pixels.
     * @param dilateBlackPixel If set to TRUE will perform dilation on BLACK pixels else on WHITE pixels.
     */
    public static void binaryImage(MyImage img, boolean erodeBlackPixel, boolean dilateBlackPixel){
        Erosion.binaryImage(img, erodeBlackPixel);
        Dilation.binaryImage(img, dilateBlackPixel);
    }
}//class ends here
