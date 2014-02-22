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
    }//main() ends here
    
    public static void test(){
        MyImage iobj = new MyImage();
        iobj.readImage("D:\\Taj.jpg");
        iobj.initPixelArray();
        ImageFX.HSI_changeImageHueValue(iobj, 300);
        //ImageFX.HSI_changeImageSaturationValue(iobj, 0.5);
        //ImageFX.HSI_changeImageIntensityValue(iobj, 200);
        iobj.writeImage("D:\\Taj2-HSI-hue.jpg");
    }
    
    public static void RGB_HSI_test(){
        MyImage iobj = new MyImage();
        
        iobj.readImage("D:\\testPixel.png");
        iobj.initPixelArray();
        System.out.println("before");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.getHue_HSI(0, 0));
        System.out.println(iobj.getSaturation_HSI(0, 0));
        System.out.println(iobj.getIntensity_HSI(0, 0));
        //ImageFX.HSI_changeImageHueValue(iobj, 300);
        //ImageFX.HSI_changeImageSaturationValue(iobj, 0.5);
        //ImageFX.HSI_changeImageIntensityValue(iobj, 100);
        iobj.writeImage("D:\\testPixel2-hue.png");
        System.out.println("after");
        System.out.println(iobj.getRed(0, 0));
        System.out.println(iobj.getGreen(0, 0));
        System.out.println(iobj.getBlue(0, 0));
        System.out.println(iobj.getHue_HSI(0, 0));
        System.out.println(iobj.getSaturation_HSI(0, 0));
        System.out.println(iobj.getIntensity_HSI(0, 0));
    }
}//class ImageProject ends here