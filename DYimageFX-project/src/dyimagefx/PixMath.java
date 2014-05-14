package dyimagefx;
/**
 * File: PixMath.java
 * 
 * Description:
 * This file contains methods for pixel component calculation like RGB value etc.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
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
public class PixMath {
    
    /////////////////////////// ARGB METHODS ///////////////////////////////////
    
    /**
     * This method will return alpha value from the pixel value.
     * 
     * @param pixelValue The pixel value from which alpha value is calculated.
     * @return Alpha value [0-255].
     */
    public static int getAlpha(int pixelValue){
        return (pixelValue>>24) & 0xFF;
    }
    
    /**
     * This method will return red value from the pixel value.
     * 
     * @param pixelValue The pixel value from which red value is calculated.
     * @return Red value [0-255].
     */
    public static int getRed(int pixelValue){
        return (pixelValue>>16) & 0xFF;
    }
    
    /**
     * This method will return green value from the pixel value.
     * 
     * @param pixelValue The pixel value from which green value is calculated.
     * @return Green value [0-255].
     */
    public static int getGreen(int pixelValue){
        return (pixelValue>>8) & 0xFF;
    }
    
    /**
     * This method will return blue value from the pixel value.
     * 
     * @param pixelValue The pixel value from which blue value is calculated.
     * @return Blue value [0-255].
     */
    public static int getBlue(int pixelValue){
        return pixelValue & 0xFF;
    }
    
    /**
     * This method will return pixel value from the ARGB value.
     * 
     * @param alpha Alpha value [0-255].
     * @param red Red value [0-255].
     * @param green Green value [0-255].
     * @param blue Blue value [0-255].
     * @return Pixel value.
     */
    public static int getPixel(int alpha, int red, int green, int blue){
        return (alpha<<24) | (red<<16) | (green<<8) | blue;
    }
    
    //////////////////////////////  HSI color model Methods ////////////////////
    
    /**
     * This method will return the hue value as per HSI color model from pixel value.
     * 
     * @param pixelValue The value of the pixel.
     * @return H The hue value of the pixel [0-360] in degree.
     */
    public static double HSI_getHue(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        double H = Math.toDegrees(Math.acos((r - (0.5*g) - (0.5*b))/Math.sqrt((r*r)+(g*g)+(b*b)-(r*g)-(g*b)-(b*r))));
        H = (b>g)?360-H:H;
        
        return H;
    }
    
    /**
     * This method will return the saturation value as per HSI color model from pixel value.
     * 
     * @param pixelValue The pixel value.
     * @return S The saturation of the pixel [0-1].
     */
    public static double HSI_getSaturation(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        double I = (r+g+b)/3;
        
        int m = Math.min(Math.min(r,g),b);
        double S = (I>0)?1 - m/I:0;
        
        return S;
    }
    
    /**
     * This method will return the intensity value as per HSI color model from pixel value.
     * 
     * @param pixelValue The pixel value
     * @return I The intensity of the pixel [0-255].
     */
    public static double HSI_getIntensity(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        double I = (r+g+b)/3;
        
        return I;
    }
    
    /**
     * This method will return the RGB value from HSI value.
     * 
     * @param H Hue value.
     * @param S Saturation value.
     * @param I Intensity value.
     * @return The RGB value for the corresponding HSI value in 1D array having 3 elements.
     */
    public static int[] HSI_getRGB(double H, double S, double I){
        int rgb[] = new int[3];
        int r = 0, g = 0, b = 0;
        
        if(H == 0){
            r = (int)Math.round(I + 2*I*S);
            g = (int)Math.round(I - I*S);
            b = (int)Math.round(I - I*S);
        }else if(H < 120){
            r = (int)Math.round(I + I*S*(Math.cos(Math.toRadians(H))/Math.cos(Math.toRadians(60-H))));
            g = (int)Math.round(I + I*S*(1 - Math.cos(Math.toRadians(H))/Math.cos(Math.toRadians(60-H))));
            b = (int)Math.round(I - I*S);
        }else if(H == 120){
            r = (int)Math.round(I - I*S);
            g = (int)Math.round(I + 2*I*S);
            b = (int)Math.round(I - I*S);
        }else if(H < 240){
            r = (int)Math.round(I - I*S);
            g = (int)Math.round(I + I*S*(Math.cos(Math.toRadians(H-120))/Math.cos(Math.toRadians(180-H))));
            b = (int)Math.round(I + I*S*(1 - (Math.cos(Math.toRadians(H-120))/Math.cos(Math.toRadians(180-H)))));
        }else if(H == 240){
            r = (int)Math.round(I - I*S);
            g = (int)Math.round(I - I*S);
            b = (int)Math.round(I + 2*I*S);
        }else if(H < 360){
            r = (int)Math.round(I + I*S*(1 - Math.cos(Math.toRadians(H-240))/Math.cos(Math.toRadians(300-H))));
            g = (int)Math.round(I - I*S);
            b = (int)Math.round(I + I*S*(Math.cos(Math.toRadians(H-240))/Math.cos(Math.toRadians(300-H))));
        }
        
        rgb[0]=r;
        rgb[1]=g;
        rgb[2]=b;
        
        return rgb;
    }
    
    ////////////////////////////// HSV color model Methods /////////////////////
    
    /**
     * This method will return the hue value as per HSV color model from pixel value.
     * 
     * @param pixelValue The pixel value.
     * @return H The hue value of the pixel [0-360] in degree.
     */
    public static double HSV_getHue(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        double H = Math.toDegrees(Math.acos((r - (0.5*g) - (0.5*b))/Math.sqrt((r*r)+(g*g)+(b*b)-(r*g)-(g*b)-(b*r))));
        H = (b>g)?360-H:H;
        
        return H;
    }
    
    /**
     * This method will return the saturation value as per HSV color model from pixel value.
     * 
     * @param pixelValue The pixel value.
     * @return S The saturation of the pixel [0-1].
     */
    public static double HSV_getSaturation(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        int max = Math.max(Math.max(r, g), b);
        int min = Math.min(Math.min(r, g), b);
        
        double S = (max>0)?(1 - (double)min/max):0;
        
        return S;
    }
    
    /**
     * This method will return the Value as per HSV color model from pixel value.
     * 
     * @param pixelValue The pixel Value.
     * @return V The value of the pixel [0-1].
     */
    public static double HSV_getValue(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        int max = Math.max(Math.max(r, g), b);
        double V = max/255.0;
        
        return V;
    }
    
    /**
     * This method will return the RGB value from HSV value.
     * 
     * @param H Hue of the pixel.
     * @param S Saturation of the pixel.
     * @param V Value of the pixel.
     * @return The RGB value for the corresponding HSV value in 1D array.
     */
    public static int[] HSV_getRGB(double H, double S, double V){
        int rgb[] = new int[3];
        int r = 0, g = 0, b = 0;
        
        double max = 255.0*V;
        double min = max*(1-S);
        double tmp = (max-min)*(1 - Math.abs((H/60)%2 - 1));
        
        H %= 360;
        
        if(H < 60){
            r = (int)Math.round(max);
            g = (int)Math.round(tmp+min);
            b = (int)Math.round(min);
        }else if(H < 120){
            r = (int)Math.round(tmp+min);
            g = (int)Math.round(max);
            b = (int)Math.round(min);
        }else if(H < 180){
            r = (int)Math.round(min);
            g = (int)Math.round(max);
            b = (int)Math.round(tmp+min);
        }else if(H < 240){
            r = (int)Math.round(min);
            g = (int)Math.round(tmp+min);
            b = (int)Math.round(max);
        }else if(H < 300){
            r = (int)Math.round(tmp+min);
            g = (int)Math.round(min);
            b = (int)Math.round(max);
        }else if(H < 360){
            r = (int)Math.round(max);
            g = (int)Math.round(min);
            b = (int)Math.round(tmp+min);
        }
        
        rgb[0]=r;
        rgb[1]=g;
        rgb[2]=b;
        
        return rgb;
    }
    
    ////////////////////////////// HSL color model Methods /////////////////////
    
    /**
     * This method will return the hue value as per HSL color model from pixel value.
     * 
     * @param pixelValue The pixel value.
     * @return H The hue value of the pixel [0-360] in degree.
     */
    public static double HSL_getHue(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        double H = Math.toDegrees(Math.acos((r - (0.5*g) - (0.5*b))/Math.sqrt((r*r)+(g*g)+(b*b)-(r*g)-(g*b)-(b*r))));
        H = (b>g)?360-H:H;
        
        return H;
    }
    
    /**
     * This method will return the saturation value as per HSL color model from pixel value.
     * 
     * @param pixelValue The pixel value.
     * @return S The saturation of the pixel [0-1].
     */
    public static double HSL_getSaturation(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        int max = Math.max(Math.max(r, g), b);
        int min = Math.min(Math.min(r, g), b);
        double tmp = (max-min)/255.0;
        double L = (max+min)/510.0;
        
        double S = (L>0)?tmp/(1.0 - Math.abs(2*L - 1.0)):0;
        
        return S;
    }
    
    /**
     * This method will return the lightness value as per HSL color model from pixel value.
     * 
     * @param pixelValue The pixel value.
     * @return L The lightness of the pixel [0-1].
     */
    public static double HSL_getLightness(int pixelValue){
        int r = getRed(pixelValue);
        int g = getGreen(pixelValue);
        int b = getBlue(pixelValue);
        
        int max = Math.max(Math.max(r, g), b);
        int min = Math.min(Math.min(r, g), b);
        double L = (max+min)/510.0;
        
        return L;
    }
    
    /**
     * This method will return the RGB value from HSL value.
     * 
     * @param H Hue of the pixel.
     * @param S Saturation of the pixel.
     * @param L Lightness of the pixel.
     * @return The RGB value for the corresponding HSL value in 1D array.
     */
    public static int[] HSL_getRGB(double H, double S, double L){
        int rgb[] = new int[3];
        int r = 0, g = 0, b = 0;
        
        double tmp = S*(1.0 - Math.abs(2*L - 1.0));
        double min = 255.0*(L - 0.5*tmp);
        double tmp2 = tmp*(1.0 - Math.abs((H/60)%2 - 1));
        
        H %= 360;
        
        if(H < 60){
            r = (int)Math.round(255*tmp+min);
            g = (int)Math.round(255*tmp2+min);
            b = (int)Math.round(min);
        }else if(H < 120){
            r = (int)Math.round(255*tmp2+min);
            g = (int)Math.round(255*tmp+min);
            b = (int)Math.round(min);
        }else if(H < 180){
            r = (int)Math.round(min);
            g = (int)Math.round(255*tmp+min);
            b = (int)Math.round(255*tmp2+min);
        }else if(H < 240){
            r = (int)Math.round(min);
            g = (int)Math.round(255*tmp2+min);
            b = (int)Math.round(255*tmp+min);
        }else if(H < 300){
            r = (int)Math.round(255*tmp2+min);
            g = (int)Math.round(min);
            b = (int)Math.round(255*tmp+min);
        }else if(H < 360){
            r = (int)Math.round(255*tmp+min);
            g = (int)Math.round(min);
            b = (int)Math.round(255*tmp2+min);
        }
        
        rgb[0]=r;
        rgb[1]=g;
        rgb[2]=b;
        
        return rgb;
    }
}//class ends here