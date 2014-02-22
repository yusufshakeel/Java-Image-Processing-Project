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
        MyImage iobj = new MyImage();
        
        iobj.readImage("D:\\NoiseImage2.jpg");
        iobj.initPixelArray();
        FilterImage.medianFilter_RGB(iobj, 3);
        //ImageFX.grayScale_Luminosity(iobj);
        //ImageFX.greenImage(iobj);
        //ThresholdImage.threshold_AverageOfRGBValue(iobj, 136);
        //ThresholdImage.autoThreshold_usingBlueValueOfPixels(iobj);
        iobj.writeImage("D:\\Taj2-threshold.jpg");
    }
}//class ImageProject ends here