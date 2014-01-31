package imageFX;

/**
 * File: ThresholdImage.java
 * 
 * Description:
 * This will threshold the image.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 26-01-2014 sun
 * 
 */
public class ThresholdImage {
    
    /**
     * This method will threshold the image. It will generate a Black&White image.
//     * 
     * For a given pixel at coordinate (x,y) average pixel value is
     * avgPixelValue = (r+g+b)/3
     * If thresholdValue > avgPixelValue then set Pixel (x,y) to BLACK
     * else set Pixel (x,y) to WHITE
     * 
     * @param thresholdValue value to be compared with the average pixel value.
     * @param img the Image object passed on which thresholding is performed.
     */
    public static void grayscale_Simple(int thresholdValue, MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int r = img.getRed(x,y);
                int g = img.getGreen(x,y);
                int b = img.getBlue(x,y);
                int avgPixelValue = (r+g+b)/3;
                if(thresholdValue > avgPixelValue){
                    img.setPixel(x,y,255,0,0,0);  //set BLACK                    
                }else{
                    img.setPixel(x,y,255,255,255,255);  //set WHITE
                }
            }
        }
    }
}//class ThresholdImage ends here
