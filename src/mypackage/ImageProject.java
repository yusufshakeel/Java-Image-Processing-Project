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
        //photoText();
    }//main() ends here
    
    public static void test(){
        MyImage iobj = new MyImage(3000,1500);
        //iobj.readImage("D:\\Taj.jpg");
        DYMosaic.myColorMosaic(iobj, DYColor.Ruby_red, 100);
        iobj.writeImage("D:\\Taj2-hsi.png");
    }
    
    public static void photoText(){
        MyImage textImg = new MyImage();
        textImg.readImage("D:\\imgText3.png");
        MyImage photoImg = new MyImage();
        photoImg.readImage("D:\\Taj.jpg");
        DYCanvas.Layer_pictureText(textImg, photoImg);
        textImg.writeImage("D:\\Output.png");
    }
}//class ImageProject ends here