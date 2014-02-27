/**
 * File: ReadWriteImage.java
 *
 * Description:
 * Read and write image.
 * @author Yusuf Shakeel
 * Date: 26-01-2014 sun
 *
 * www.github.com/yusufshakeel/Java-Image-Processing-Project
 */
 
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage{
    public static void main(String args[])throws IOException{
        BufferedImage image = null;
        File f = null;
        
        //read image file
        try{
            f = new File("D:\\Image\\Taj.jpg");
            image = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
        
        //write image
        try{
            f = new File("D:\\Image\\Output.jpg");
            ImageIO.write(image, "jpg", f);
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
    }//main() ends here
}//class ends here