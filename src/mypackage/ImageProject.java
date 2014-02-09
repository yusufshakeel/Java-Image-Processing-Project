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
    }//main() ends here
    
    public static void test(){
        MyImage iobj = new MyImage(100,200);
        
        iobj.readImage("D:\\Taj.jpg");
        iobj.initPixelArray();
        //ImageFX.createRandomImage(iobj);
        ImageFX.grayScale(iobj);
        //FilterImage.medianFilter(iobj, 3);
        //ImageFX.blur_D9(iobj);
        iobj.writeImage("D:\\Taj2-grayscale.jpg");
    }
}//class ImageProject ends here