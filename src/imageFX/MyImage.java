package imageFX;

/**
 * File: MyImage.java
 * 
 * Description:
 * This is used to create an BufferedImage object and comes with different methods
 * to work with the image.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * date: 26-01-2014 sun
 * 
 */

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage {
    
    //////////////////////////// VARIABLES /////////////////////////////////////
    
    /** Store the Image reference */
    private BufferedImage image;
    
    /** Store the image width and height */
    private int width, height;
    
    /** Pixel values */
    private int pixels[];
    
    /** Total number of pixel in an image*/
    private int totalPixels;
    
    ////////////////////////////////// CONSTRUCTORS ////////////////////////////
    
    /** Default constructor */
    public MyImage(){}
    
    /** 
     * Constructor to create a new image object
     * 
     * @param width width of the image passed by the user
     * @param height height of the image passed by the user
     * 
     */
    public MyImage(int width, int height){
        this.width = width;
        this.height = height;
        this.totalPixels = this.width * this.height;
        image = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_ARGB);
    }
    
    
    /////////////////////////////////////// METHODS ////////////////////////////
    
    /** 
     * Read the image using the image file path passed
     * 
     * @param filePath the path of the image file
     * Example filePath = "D:\\LogoJava.jpg"
     * 
     */
    public void readImage(String filePath){
        try{
            File f = new File(filePath);
            image = ImageIO.read(f);
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.totalPixels = this.width * this.height;
        }catch(IOException e){
            System.out.println("Error Occurred!\n"+e);
        }
    }
    
    /**
     * Write the content of the BufferedImage object 'image' to a file
     * 
     * @param outputFilePath complete file path of the output image file to be created
     * @param outputFileType file type of the output file
     * 
     * Example outputFilePath = "D:\\Output.jpg"
     * Example outputFileType = "jpg|png|bmp|gif"
     * 
     */
    public void writeImage(String outputFilePath, String outputFileType){
        try{
            File f = new File(outputFilePath);
            ImageIO.write(image, outputFileType, f);
        }catch(IOException e){
            System.out.println("Error Occurred!\n"+e);
        }
    }
    
    /**
     * Return the image width
     * 
     * @return the width of the image
     */
    public int getImageWidth(){
        return width;
    }
    
    /**
     * Return the image height
     * 
     * @return the height of the image
     */
    public int getImageHeight(){
        return height;
    }
    
    /**
     * Return total number of pixels in the image
     * 
     * @return the total number of pixels
     */
    public int getImageTotalPixels(){
        return totalPixels;
    }
    
    /**
     * Initialize the pixel array
     * Image origin is at coordinate (0,0)
     * (0,0)--------> X-axis
     *     |
     *     |
     *     |
     *     v
     *   Y-axis
     * 
     * This method will store the value of each pixels of a 2D image in a 1D array.
     * 
     */
    public void initPixelArray(){
        pixels = new int[totalPixels];
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                pixels[x+(y*height)] = image.getRGB(x, y);
            }
        }
    }
    
    /**
     * This method will return the amount of alpha value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @return the amount of alpha (transparency)
     * 
     * 0 means transparent
     * 255 means opaque
     */
    public int getAlpha(int x, int y){
        return (pixels[x+(y*height)] >> 24) & 0xFF;
    }
    
    /**
     * This method will return the amount of red value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @return the amount of red
     * 
     * 0 means none
     * 255 means fully red
     */
    public int getRed(int x, int y){
        return (pixels[x+(y*height)] >> 16) & 0xFF;
    }
    
    /**
     * This method will return the amount of green value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel 
     * @return the amount of green
     * 
     * 0 means none
     * 255 means fully green
     */
    public int getGreen(int x, int y){
        return (pixels[x+(y*height)] >> 8) & 0xFF;
    }
    
    /**
     * This method will return the amount of blue value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @return the amount of blue
     * 
     * 0 means none
     * 255 means fully blue
     */
    public int getBlue(int x, int y){
        return pixels[x+(y*height)] & 0xFF;
    }
    
    /**
     * This method will return the pixel value of the pixel at the coordinate (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @return the pixel value in integer [Value can be negative and positive.]
     * 
     */
    public int getPixel(int x, int y){
        return pixels[x+(y*height)];
    }
    
    /**
     * This method will set the amount of alpha value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @param alpha the alpha value to set
     * 
     * 0 means transparent
     * 255 means opaque
     */
    public void setAlpha(int x, int y, int alpha){
        pixels[x+(y*height)] = (alpha<<24) | (pixels[x+(y*height)] & 0x00FFFFFF);
        updateImagePixelAt(x,y);
    }
    
    /**
     * This method will set the amount of red value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @param red the red value to set
     * 
     * 0 means none
     * 255 means fully red
     */
    public void setRed(int x, int y, int red){
        pixels[x+(y*height)] = (red<<16) | (pixels[x+(y*height)] & 0xFF00FFFF);
        updateImagePixelAt(x,y);
    }
    
    /**
     * This method will set the amount of green value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @param green the green value to set
     * 
     * 0 means none
     * 255 means fully green
     */
    public void setGreen(int x, int y, int green){
        pixels[x+(y*height)] = (green<<8) | (pixels[x+(y*height)] & 0xFFFF00FF);
        updateImagePixelAt(x,y);
    }
    
    /**
     * This method will set the amount of blue value between 0-255 at the pixel (x,y)
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @param blue the blue value to set
     * 
     * 0 means none
     * 255 means fully blue
     */
    public void setBlue(int x, int y, int blue){
        pixels[x+(y*height)] = blue | (pixels[x+(y*height)] & 0xFFFFFF00);
        updateImagePixelAt(x,y);
    }
    
    /**
     * This method will set the value of the pixel of the image at the coordinate (x,y).
     * 
     * @param x the x coordinate of the pixel
     * @param y the y coordinate of the pixel
     * @param alpha the alpha value to set [value from 0-255]
     * @param red the red value to set [value from 0-255]
     * @param green the green value to set [value from 0-255]
     * @param blue the blue value to set  [value from 0-255]
     * 
     */
    public void setPixel(int x, int y, int alpha, int red, int green, int blue){
        int p = 0;
        p = p | blue;
        p = p | (green << 8);
        p = p | (red << 16);
        p = p | (alpha << 24);
        pixels[x+(y*height)] = p;
        updateImagePixelAt(x,y);
    }
    
    /**
     * This method will update the image pixel at coordinate (x,y)
     * 
     * @param x the x coordinate of the pixel that is set
     * @param y the y coordinate of the pixel that is set
     * 
     */
    public void updateImagePixelAt(int x, int y){
        image.setRGB(x, y, pixels[x+(y*height)]);
    }
    
    /**
     * This method will create a random image.
     * 
     */
    public void createRandomImage(){
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int a = (int)(Math.random()*256);
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);
                setPixel(x,y,a,r,g,b);
            }
        }
    }
}//class MyImage ends here
