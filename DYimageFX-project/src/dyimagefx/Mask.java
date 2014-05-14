package dyimagefx;
/**
 * File: Mask.java
 * 
 * Description:
 * This fill will create mask aka kernel or structuring element.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 06-05-2014 tue
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
public class Mask {
    
    //mask array
    private static int mask[];
    
    
    /**
     * This will return a square mask [maskSize x maskSize] having all the elements set to 1.
     * 
     * @param maskSize the size of the 2D array
     * @return 2D mask
     */
    public static int[] allOne(int maskSize){
        mask = new int[maskSize*maskSize];
        java.util.Arrays.fill(mask, 1);
        return mask;
    }
    
    ///////////////////////////// CIRCLE ///////////////////////////////////////
    
    /**
     * This will return a square mask with circumference of the circle set to 1.
     * 
     * @param diameter diameter of the circle. [An odd integer like 9, 11, 13 etc]
     * @return 2D mask
     */
    public static int[] drawCircle(int diameter){
        int radius = diameter/2;
        int mask[] = new int[diameter * diameter];
        int x = 0, y = radius, p = 1 - radius;
        int cx = diameter/2, cy = diameter/2;
        
        while(x<=y){
            //draw circumference of the circle circle
            mask[(cx+x)+(cy+y)*diameter] = 1;
            mask[(cx-x)+(cy+y)*diameter] = 1;
            mask[(cx+x)+(cy-y)*diameter] = 1;
            mask[(cx-x)+(cy-y)*diameter] = 1;
            mask[(cx+y)+(cy+x)*diameter] = 1;
            mask[(cx-y)+(cy+x)*diameter] = 1;
            mask[(cx+y)+(cy-x)*diameter] = 1;
            mask[(cx-y)+(cy-x)*diameter] = 1;
            
            x++;
            if(p<0){
                p+=2*x+1;
            }else{
                y--;
                p+=2*(x-y)+1;
            }
        }
        return mask;
    }
    
    /**
     * This will return a square mask with circle filled with 1.
     * 
     * @param diameter diameter of the circle. [An odd integer like 9, 11, 13...]
     * @return 2D mask
     */
    public static int[] fillCircle(int diameter){
        int radius = diameter/2;
        int cx = diameter/2, cy = diameter/2;
        
        //draw circle
        mask = drawCircle(diameter);
        
        //fill circle
        floodFill(diameter, diameter, cx, cy, 0, 1);
        
        return mask;
    }
    
    //////////////////////////////// DIAMOND ///////////////////////////////////
    
    /**
     * This will return a square mask having diamond shape set to 1.
     * 
     * @param width The width of the square mask. [An odd integer like 9, 11, 13 etc]
     * @return 2D mask
     */
    public static int[] drawDiamond(int width){
        int mask[] = new int[width * width];
        int x = 0, y = width/2;
        int cx = width/2, cy = width/2;
        
        while(x<=y){
            //draw diamond
            mask[(cx+x)+(cy+y)*width] = 1;
            mask[(cx-x)+(cy+y)*width] = 1;
            mask[(cx+x)+(cy-y)*width] = 1;
            mask[(cx-x)+(cy-y)*width] = 1;
            mask[(cx+y)+(cy+x)*width] = 1;
            mask[(cx-y)+(cy+x)*width] = 1;
            mask[(cx+y)+(cy-x)*width] = 1;
            mask[(cx-y)+(cy-x)*width] = 1;
            
            x++;
            y--;
        }
        return mask;
    }
    
    /**
     * This will return a square mask with filled diamond.
     * 
     * @param width The width of the square mask. [An odd integer like 9, 11, 13...]
     * @return 2D mask
     */
    public static int[] fillDiamond(int width){
        int cx = width/2, cy = width/2;
        
        //draw diamond
        mask = drawDiamond(width);
        
        //fill diamond
        floodFill(width, width, cx, cy, 0, 1);
        
        return mask;
    }
    
    /**
     * This will return a square mask with of diamond shape with corner filled with 1.
     * 
     * @param width The width of the square mask. [An odd integer like 9, 11, 13...]
     * @return 2D mask
     */
    public static int[] fillDiamondCorners(int width){
        int cx = width/2, cy = width/2;
        
        //draw diamond
        mask = drawDiamond(width);
        
        //fill diamond
        floodFill(width, width, cx, cy, 0, 1);
        
        //invert
        for(int y = 0; y < width; y++){
            for(int x = 0; x < width; x++){
                mask[x+y*width] = (mask[x+y*width]==1)?0:1;
            }
        }
        
        return mask;
    }
    
    ///////////////////////////// FLOOD FILL ///////////////////////////////////
    
    /**
     * This method will floodfill the image.
     * 
     * @param width the width of the image
     * @param height the height of the image
     * @param cx x coordinate of the center of the image
     * @param cy y coordinate of the center of the image
     * @param oldColor the color to be replaced
     * @param newColor the color that will replace the oldColor
     */
    private static void floodFill(int width, int height, int cx, int cy, int oldColor, int newColor){
        if(cx<0 || cx>=width || cy<0 || cy>=height){
            return;
        }
        
        if(mask[cx+cy*width] == oldColor){
            mask[cx+cy*width] = newColor;
            floodFill(width, height, cx+1, cy,   oldColor, newColor);
            floodFill(width, height, cx,   cy+1, oldColor, newColor);
            floodFill(width, height, cx-1, cy,   oldColor, newColor);
            floodFill(width, height, cx,   cy-1, oldColor, newColor);
        }
    }
}//class ends here
