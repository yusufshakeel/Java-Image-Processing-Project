/**
 * File: BlueImage.java
 * 
 * Description:
 * Convert color image to blue image.
 *
 * @author Yusuf Shakeel
 * Date: 27-01-2014 mon
 *
 * www.github.com/yusufshakeel/Java-Image-Processing-Project
 */

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class BlueImage{
    public static void main(String args[])throws IOException{
        BufferedImage img = null;
        File f = null;
        
        //read image
        try{
            f = new File("D:\\Image\\sonam.jpg");
            img = ImageIO.read(f);
        }catch(IOException e){
            System.out.println(e);
        }
        
        //get width and height
        int width = img.getWidth();
        int height = img.getHeight();
        
        //convert to blue image
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int p = img.getRGB(x,y);
                
                int a = (p>>24)&0xff;
                int b = p&0xff;
                
                //set new RGB
                p = (a<<24) | (0<<16) | (0<<8) | b;
                
                img.setRGB(x, y, p);
            }
        }
        
        //write image
        try{
            f = new File("D:\\Image\\output.jpg");
            ImageIO.write(img, "jpg", f);
        }catch(IOException e){
            System.out.println(e);
        }
    }//main() ends here
}//class ends here