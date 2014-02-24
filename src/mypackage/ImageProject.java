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

public class ImageProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        test();
    }//main() ends here
    
    public static void test(){
        MyImage iobj = new MyImage();
        iobj.readImage("D:\\Taj.jpg");
        iobj.initPixelArray();
        ImageFX.pixelation(iobj, 20);
        iobj.writeImage("D:\\Taj2-pixelation.jpg");
    }
}//class ImageProject ends here