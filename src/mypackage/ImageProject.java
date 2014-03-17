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
        MyImage iobj = new MyImage(3000,1500);
        DYMosaic.myColorMosaic(iobj, DYColor.Ruby_red, 100);
        iobj.writeImage("D:\\Mosaic-3000x1500.png");
    }
}//class ImageProject ends here