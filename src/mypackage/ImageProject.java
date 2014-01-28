package mypackage;

/**
 *
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
 * 
 * File: ImagePrject.java
 * 
 * Description:
 * This is a test file.
 * 
 */

import java.io.IOException;
import imageX.ImageFX;

public class ImageProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
        /** Create ImageFX object */
        ImageFX iObj = new ImageFX();
        
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
        ImageFX iObj2 = new ImageFX(picWidth, picHeight);
        iObj2.writeImage(fname2, ftype2);
        
        System.out.println("iObj2 image written to file");
        
        /** create a new ImageFX object and initialize pixels */
        ImageFX iObj3 = iObj2;
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
        ImageFX iObj4 = new ImageFX(100,100);
        iObj4.initPixelArray();
        iObj4.createRandomImage();
        iObj4.writeImage("D:\\Output4.png", "png");
        
        /** threshold image */
        ImageFX iObj5 = new ImageFX();
        iObj5.readImage("D:\\City.jpg");
        iObj5.initPixelArray();
        iObj5.thresholdImageGrayscale(50);
        iObj5.writeImage("D:\\City1.png", "png");
        
    }//main() ends here
}//class ImageProject ends here