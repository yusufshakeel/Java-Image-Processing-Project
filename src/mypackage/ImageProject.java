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
import java.io.IOException;

public class ImageProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        //testMyImageClass();
        //testThresholdImageClass();
        //testMedianFilterClass();
        //testImageFXClass();
        test();
    }//main() ends here
    
    public static void test(){
        MyImage iObj = new MyImage();
        
        iObj.readImage("D:\\Taj.jpg");
        System.out.println("Dimension: "+iObj.getImageWidth()+"x"+iObj.getImageHeight());
        System.out.println("Total Pixels: "+iObj.getImageTotalPixels());
        iObj.initPixelArray();
        ImageFX.blur_N16(iObj);
        //DYCanvas.colorMix(iObj);
        //ThresholdImage.grayscale_Simple(120, iObj);
        //FilterImage.meanFilter_ZeroFill(iObj, 3);
        iObj.writeImage("D:\\Taj-blur-n16.jpg", "jpg");
    }
    
    public static void testImageFXClass(){
        MyImage iObj = new MyImage();
        
        /** image negative */
        iObj.readImage("D:\\Taj.jpg");
        iObj.initPixelArray();
        ImageFX.negative(iObj);
        iObj.writeImage("D:\\Taj1-negative.jpg", "jpg");
        
        /** image flip horizontal */
        iObj.readImage("D:\\Taj.jpg");
        iObj.initPixelArray();
        ImageFX.flipHorizontal(iObj);
        iObj.writeImage("D:\\Taj1-flip-horizontal.jpg", "jpg");
        
        /** image flip vertical */
        iObj.readImage("D:\\Taj.jpg");
        iObj.initPixelArray();
        ImageFX.flipVertical(iObj);
        iObj.writeImage("D:\\Taj1-flip-vertical.jpg", "jpg");
        
        /** image transparency */
        iObj.readImage("D:\\Apple.png");
        iObj.initPixelArray();
        ImageFX.transparentAllPixels(iObj, 64);
        iObj.writeImage("D:\\Apple1-transparency.png", "png");
        
        /** image transparent selective pixels */
        iObj.readImage("D:\\Apple.png");
        iObj.initPixelArray();
        ImageFX.transparentAlphaPixels(iObj, 64);
        iObj.writeImage("D:\\Apple1-transparency-alpha-pixels.png", "png");
        
        /** image sharpen */
        iObj.readImage("D:\\Apple.png");
        iObj.initPixelArray();
        ImageFX.sharpen(iObj);
        iObj.writeImage("D:\\Apple1-sharpen.png", "png");
    }

    public static void testMyImageClass(){
        /** Create ImageFX object */
        MyImage iObj = new MyImage();
        
        /** Read Image File by passing the file path */
        String filePath = "D:\\LogoJava.jpg";
        iObj.readImage(filePath);
        
        /** Display the dimension of the image */
        int width = iObj.getImageWidth();
        int height = iObj.getImageHeight();
        System.out.println("Dimension: "+width+"x"+height);
        
        /** Write the image file to an output file */
        String fname = "D:\\Output.png";
        String ftype = "png";
        iObj.writeImage(fname, ftype);
        System.out.println("iObj image written to file");
        
        /** create a new image object */
        String fname2 = "D:\\Output2.jpg";
        String ftype2 = "jpg";
        int picWidth = 10;
        int picHeight = 10;
        MyImage iObj2 = new MyImage(picWidth, picHeight);
        iObj2.writeImage(fname2, ftype2);
        
        System.out.println("iObj2 image written to file");
        
        /** create a new ImageFX object and initialize pixels */
        MyImage iObj3 = iObj2;
        iObj3.initPixelArray();
        
        System.out.println("iObj3=iObj2");
        System.out.println("iObj3 get ARGB value");
        /** get the value of 1st pixel at coordinate (0,0) */
        System.out.println(iObj3.getAlpha(0, 0));
        System.out.println(iObj3.getRed(0, 0));
        System.out.println(iObj3.getGreen(0, 0));
        System.out.println(iObj3.getBlue(0, 0));
        System.out.println(iObj3.getPixel(0, 0));
        
        System.out.println("iObj3 set and get ARGB value");
        /** set the value of the 1st pixel at coordinate (0,0) and print the value */
        iObj3.setPixel(0, 0, 255, 255, 255, 255);
        System.out.println(iObj3.getAlpha(0, 0));
        System.out.println(iObj3.getRed(0, 0));
        System.out.println(iObj3.getGreen(0, 0));
        System.out.println(iObj3.getBlue(0, 0));
        System.out.println(iObj3.getPixel(0, 0));
        
        System.out.println("iObj3 image written to file");
        iObj3.writeImage("D:\\Output3.png", "png");
        
        /** create a random image and write (save) it to a file */
        MyImage iObj4 = new MyImage(100,100);
        iObj4.initPixelArray();
        iObj4.createRandomImage();
        iObj4.writeImage("D:\\Output4.png", "png");
    }
    
    public static void testThresholdImageClass(){        
        /** threshold image */
        MyImage iObj5 = new MyImage();
        iObj5.readImage("D:\\Taj.jpg");
        iObj5.initPixelArray();
        ThresholdImage.grayscale_Simple(64, iObj5);
        iObj5.writeImage("D:\\Taj1-threshold-simple.jpg", "jpg");        
    }
    
    public static void testFilterImageClass(){
        MyImage iObj = new MyImage();
        /** median filtering image */
        iObj.readImage("D:\\Taj.jpg");
        iObj.initPixelArray();
        FilterImage.medianFilter_ZeroFill(iObj, 3);
        iObj.writeImage("D:\\Taj1-median-filter-zero-fill.jpg", "jpg");
        
        /** median filtering image */
        iObj.readImage("D:\\Taj.jpg");
        iObj.initPixelArray();
        FilterImage.medianFilter_ValueFill(iObj, 3);
        iObj.writeImage("D:\\Taj1-median-filter-value-fill.jpg", "jpg");
    }
}//class ImageProject ends here