/**
 * File: MirrorImage.java
 * 
 * Description:
 * Create a mirror image.
 * 
 * @author Yusuf Shakeel
 * Date: 04-04-2014 fri
 */

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MirrorImage{
    public static void main(String args[])throws IOException{
        //BufferedImage for source image
        BufferedImage simg = null;
        
        //File object
        File f = null;
        
        //read source image file
        try{
            f = new File("D:\\Image\\audrey.jpg");
            simg = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        
        //get source image dimension
        int width = simg.getWidth();
        int height = simg.getHeight();
        
        //BufferedImage for mirror image
        BufferedImage mimg = new BufferedImage(width*2, height, BufferedImage.TYPE_INT_ARGB);
        
        //create mirror image pixel by pixel
        for(int y = 0; y < height; y++){
            for(int lx = 0, rx = width*2 - 1; lx < width; lx++, rx--){
                //lx starts from the left side of the image
                //rx starts from the right side of the image
                
                //get source pixel value
                int p = simg.getRGB(lx, y);
                
                //set mirror image pixel value - both left and right
                mimg.setRGB(lx, y, p);
                mimg.setRGB(rx, y, p);
            }
        }
        
        //save mirror image
        try{
            f = new File("D:\\Image\\Output.png");
            ImageIO.write(mimg, "png", f);
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }//main() ends here
}//class ends here