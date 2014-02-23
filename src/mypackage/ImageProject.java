package mypackage;

/**
 * File: ImageProject.java
 * 
 * Description:
 * This is a test file.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
 */

import imageFX.*;
//import java.io.IOException;

public class ImageProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){//throws IOException {
        test();
        //RGB_HSI_test();
        //RGB_HSV_test();
        //RGB_HSL_test();
    }//main() ends here
    
    public static void test(){
        MyImage iobj = new MyImage();
        iobj.readImage("D:\\Taj.jpg");
        iobj.initPixelArray();
        ThresholdImage.autoThreshold(iobj);
        //FilterImage.medianFilter(iobj, 3);
        //ImageFX.HSI_changeImageHue(iobj, 300);
        //ImageFX.HSI_changeImageSaturationValue(iobj, 0.5);
        //ImageFX.HSI_changeImageIntensityValue(iobj, 200);
        iobj.writeImage("D:\\Taj2-autothreshold.jpg");
    }
    
    public static void RGB_HSI_test(){
        MyImage iobj = new MyImage();
        
        iobj.readImage("D:\\testPixel.png");
        iobj.initPixelArray();
        System.out.println("before");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.HSI_getHue(0, 0));
        System.out.println(iobj.HSI_getSaturation(0, 0));
        System.out.println(iobj.HSI_getIntensity(0, 0));
        //ImageFX.HSI_changeImageHueValue(iobj, 300);
        //ImageFX.HSI_changeImageSaturationValue(iobj, 0.5);
        //ImageFX.HSI_changeImageIntensityValue(iobj, 100);
        iobj.writeImage("D:\\testPixel2-hue.png");
        System.out.println("after");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.HSI_getHue(0, 0));
        System.out.println(iobj.HSI_getSaturation(0, 0));
        System.out.println(iobj.HSI_getIntensity(0, 0));
    }
    
    public static void RGB_HSV_test(){
        MyImage iobj = new MyImage();
        
        iobj.readImage("D:\\testPixel.png");
        iobj.initPixelArray();
        System.out.println("before");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.HSV_getHue(0, 0));
        System.out.println(iobj.HSV_getSaturation(0, 0));
        System.out.println(iobj.HSV_getValue(0, 0));
        //ImageFX.HSV_changeImageHue(iobj, 0);
        //ImageFX.HSV_changeImageSaturation(iobj, 1);
        //ImageFX.HSV_changeImageValue(iobj, 1);
        //iobj.writeImage("D:\\testPixel2-hue.png");
        System.out.println("after");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.HSV_getHue(0, 0));
        System.out.println(iobj.HSV_getSaturation(0, 0));
        System.out.println(iobj.HSV_getValue(0, 0));
    }
    
    public static void RGB_HSL_test(){
        MyImage iobj = new MyImage();
        
        iobj.readImage("D:\\testPixel.png");
        iobj.initPixelArray();
        System.out.println("before");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.HSL_getHue(0, 0));
        System.out.println(iobj.HSL_getSaturation(0, 0));
        System.out.println(iobj.HSL_getLightness(0, 0));
        //ImageFX.HSL_changeImageHue(iobj, 360);
        //ImageFX.HSL_changeImageSaturation(iobj, 1);
        //ImageFX.HSL_changeImageLightness(iobj, 0.5);
        //iobj.writeImage("D:\\testPixel2-hue.png");
        System.out.println("after");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.HSL_getHue(0, 0));
        System.out.println(iobj.HSL_getSaturation(0, 0));
        System.out.println(iobj.HSL_getLightness(0, 0));
    }
}//class ImageProject ends here