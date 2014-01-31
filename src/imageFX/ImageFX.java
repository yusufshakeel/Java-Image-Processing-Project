package imageFX;

/**
 * File: ImageFX.java
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun

 * 
 * Description:
 * Contains common image processing methods.
 * 
 */
public class ImageFX {
    
    /**
     * This method will generate the negative of an image.
     * 
     * @param img The image whose negative is generated.
     */
    public static void negative(MyImage img){
        for(int y = 0; y < img.getImageHeight(); y++){
            for(int x = 0; x < img.getImageWidth(); x++){
                int a = img.getAlpha(x, y);
                int r = 255 - img.getRed(x, y);
                int g = 255 - img.getGreen(x, y);
                int b = 255 - img.getBlue(x, y);
                img.setPixel(x, y, a, r, g, b);
            }
        }
    }
    
    /**
     * This method will flip the image horizontally.
     * 
     * @param img The image to be flipped horizontally.
     */
    public static void flipHorizontal(MyImage img){
        for(int xi = 0, xj = img.getImageWidth() - 1 ; xi < xj; xi++, xj--){
            for(int y = 0; y < img.getImageHeight(); y++){
                int t = img.getPixel(xi, y);
                img.setPixelToValue(xi, y, img.getPixel(xj, y));
                img.setPixelToValue(xj, y, t);
            }
        }
    }
    
    /**
     * This method will flip the image vertically.
     * 
     * @param img The image to be flipped vertically.
     */
    public static void flipVertical(MyImage img){
        for(int yi = 0, yj = img.getImageHeight() - 1 ; yi < yj; yi++, yj--){
            for(int x = 0; x < img.getImageWidth(); x++){
                int t = img.getPixel(x, yi);
                img.setPixelToValue(x, yi, img.getPixel(x, yj));
                img.setPixelToValue(x, yj, t);
            }
        }
    }
}//class ImageFX ends here
