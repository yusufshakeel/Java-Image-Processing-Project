package mypackage;

/**
 * File: Test.java
 * 
 * Description:
 * This is a test file.
 * 
 * @author Yusuf Shakeel
 * Date: 26-01-2014 sun
 */
public class Test_RGB_HSI {
    public static void main(String args[]){
        rgb_hsi();
        hsi_rgb();
    }
    
    public static void rgb_hsi(){
        /*
         * H = 0 to 360 degree
         * S = 0 to 1
         * I = 0 to 255
         */
        int a = 255, r = 100, g = 150, b = 200;
        int h = 0, s = 0, i = 0;
        double H = 0, S = 0, I = 0;
        
        I = (r+g+b)/3;
        i = (int)Math.round(I);
        
        int m = Math.min(Math.min(r,g),b);
        S = (I>0)?1 - m/I:0;
        s = (int)Math.round(S*100);
        
        H = Math.toDegrees(Math.acos((r - (0.5*g) - (0.5*b))/Math.sqrt((r*r)+(g*g)+(b*b)-(r*g)-(g*b)-(b*r))));
        H = (b>g)?360-H:H;
        h = (int)Math.round(H);
        
        System.out.println("RGB_HSI");
        
        System.out.println("ARGB: "+a+" "+r+" "+g+" "+b);
        System.out.println("HEX: "+Integer.toHexString((a<<24)|(r<<16)|(g<<8)|b));
        
        System.out.println("HSI: "+H+" "+S+" "+I);
        System.out.println("hsi: "+h+" "+s+" "+i);
    }
    
    public static void hsi_rgb(){
        /*
         * H = 0 to 360 degree
         * S = 0 to 1
         * I = 0 to 255
         */
        int a = 255, r = 0, g = 0, b = 0;
        //float H = 209.99999f, S = 0.33333f, I = 150f;
        float H = 290;
        float S = 0.5f;
        float I = 100;
        //H = (float)Math.toRadians(H);
        //int H = (int)H, S = (int)S, I = (int)I;
        
        if(H == 0){
            r = (int)Math.round(I + 2*I*S);
            g = (int)Math.round(I - I*S);
            b = (int)Math.round(I - I*S);
        }else if(H < 120){
            r = (int)Math.round(I + I*S*(Math.cos(Math.toRadians(H))/Math.cos(Math.toRadians(60-H))));
            g = (int)Math.round(I + I*S*(1 - Math.cos(Math.toRadians(H))/Math.cos(Math.toRadians(60-H))));
            b = (int)Math.round(I - I*S);
        }else if(H == 120){
            r = (int)Math.round(I - I*S);
            g = (int)Math.round(I + 2*I*S);
            b = (int)Math.round(I - I*S);
        }else if(H < 240){
            r = (int)Math.round(I - I*S);
            g = (int)Math.round(I + I*S*(Math.cos(Math.toRadians(H-120))/Math.cos(Math.toRadians(180-H))));
            b = (int)Math.round(I + I*S*(1 - (Math.cos(Math.toRadians(H-120))/Math.cos(Math.toRadians(180-H)))));
        }else if(H == 240){
            r = (int)Math.round(I - I*S);
            g = (int)Math.round(I - I*S);
            b = (int)Math.round(I + 2*I*S);
        }else if(H < 360){
            r = (int)Math.round(I + I*S*(1 - Math.cos(Math.toRadians(H-240))/Math.cos(Math.toRadians(300-H))));
            g = (int)Math.round(I - I*S);
            b = (int)Math.round(I + I*S*(Math.cos(Math.toRadians(H-240))/Math.cos(Math.toRadians(300-H))));
        }
        
        System.out.println("HSI_RBI");
        
        System.out.println("ARGB: "+a+" "+r+" "+g+" "+b);
        System.out.println("HEX: "+Integer.toHexString((a<<24)|(r<<16)|(g<<8)|b));
        
        System.out.println("HSI: "+H+" "+S+" "+I);
        System.out.println("hsi: "+H+" "+S+" "+I);
    }
}
