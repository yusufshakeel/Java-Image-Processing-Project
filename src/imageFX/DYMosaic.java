package imageFX;
/**
 * File: DYMosaic.java
 * 
 * Description:
 * This file contains methods to create random mosaic.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 21-02-2014 fri
 * 
 * www.github.com/yusufshakeel/Java-Image-Processing-Project
 * 
 * The MIT License (MIT)
 * Copyright (c) 2014 Yusuf Shakeel
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class DYMosaic {
    
    
    //////////////////////////////// MOSAIC Method /////////////////////////////
    
    private static void _createMosaic(MyImage img, int mSize, int r, int g, int b){
        int buff = 20;
        int lim = Math.max(Math.max(r, g), b);
        lim = (((255-lim)/2)>buff)?buff:((255-lim)/2);
                
        for(int y = 0; y < img.getImageHeight(); y += mSize){
            for(int x = 0; x < img.getImageWidth(); x += mSize){
                int c;
                if(lim>0){
                    c = (int)(Math.random()*lim);
                    c = ((int)(Math.random()*2))==0?c:-1*c;
                }else{
                    lim = buff;
                    c = -1*(int)(Math.random()*lim);
                }
                
                int[] rgb = new int[3];
                rgb[0] = (c+r)>0?(c+r):r;
                rgb[1] = (c+g)>0?(c+g):g;
                rgb[2] = (c+b)>0?(c+b):b;
                
                for(int yi = 0; yi < mSize && y+yi < img.getImageHeight(); yi++){
                    for(int xi = 0; xi < mSize && x+xi < img.getImageWidth(); xi++){
                        img.setPixel(x+xi, y+yi, 255, rgb[0], rgb[1], rgb[2]);
                    }
                }
            }
        }
    }
    
    /**
     * This method will generate a random mosaic pattern.
     * 
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void Random(MyImage img, int pieceSize){
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        _createMosaic(img, pieceSize, r, g, b);
    }
    
    ///////////////////////////////// Color Method /////////////////////////////
    /**
     * All the methods in the color_ section will generate random mosaic.
     */
    
    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Acid_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 168, 187, 25);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Aero(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 124, 185, 232);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Aero_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 201, 255, 229);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_African_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 178, 132, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Air_Force_blue__RAF_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 93, 138, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Air_Force_blue__USAF_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 48, 143);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Air_superiority_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 114, 160, 193);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Alabama_Crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 175, 0, 42);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Alice_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 248, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Alizarin_crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 38, 54);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Alloy_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 196, 98, 16);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Almond(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 239, 222, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Amaranth(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 229, 43, 80);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Amaranth_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 241, 156, 187);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Amaranth_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 171, 39, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Amazon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 59, 122, 87);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Amber(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 191, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_SAE_ECE_Amber__color_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 126, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Amethyst(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 102, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Android_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 164, 198, 57);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Anti_flash_white(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 242, 243, 244);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Antique_brass(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 205, 149, 117);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Antique_fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 93, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Antique_ruby(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 145, 92, 131);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Antique_white(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 235, 215);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ao__English_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 128, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Apple_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 141, 182, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Apricot(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 206, 177);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Aqua(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Aquamarine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 127, 255, 212);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Army_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 75, 83, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Arsenic(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 59, 68, 75);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Artichoke(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 143, 151, 121);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Arylide_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 214, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ash_grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 178, 190, 181);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Asparagus(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 135, 169, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Atomic_tangerine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 153, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Auburn(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 165, 42, 42);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Aureolin(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 238, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_AuroMetalSaurus(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 110, 127, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Avocado(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 86, 130, 3);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Azure(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 127, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Azure_mist_web(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Baby_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 137, 207, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Baby_blue_eyes(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 161, 202, 241);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Baby_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 194, 194);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Baby_powder(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 254, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Baker_Miller_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 145, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ball_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 33, 171, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Banana_Mania(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 231, 181);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Banana_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 225, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bangladesh_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 106, 78);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Barbie_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 224, 33, 138);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Barn_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 124, 10, 2);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Battleship_grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 132, 132, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bazaar(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 119, 123);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Beau_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 188, 212, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Beaver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 159, 129, 112);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Beige(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 245, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_B_dazzled_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 46, 88, 148);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Big_dip_o_ruby(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 156, 37, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bisque(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 228, 196);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bistre(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 61, 43, 31);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bistre_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 113, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bitter_lemon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 202, 224, 13);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bitter_lime(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 191, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bittersweet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 111, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bittersweet_shimmer(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 191, 79, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Black(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Black_bean(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 61, 12, 2);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Black_leather_jacket(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 37, 53, 41);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Black_olive(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 59, 60, 54);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blanched_almond(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 235, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blast_off_bronze(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 165, 113, 100);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bleu_de_France(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 49, 140, 231);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blizzard_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 172, 229, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 240, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue__NCS_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 147, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 135, 189);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue__RYB_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 51, 51, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue_Bell(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 2, 71, 254);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 153, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue_sapphire(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 13, 152, 186);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 18, 97, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blue_yonder(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 43, 226);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blueberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 80, 114, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bluebonnet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 79, 134, 247);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Blush(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 28, 28, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bole(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 93, 131);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bondi_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 121, 68, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bone(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 149, 182);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Boston_University_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 218, 201);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bottle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Boysenberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 106, 78);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brandeis_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 135, 50, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brass(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 112, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brick_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 181, 166, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_cerulean(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 203, 65, 84);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 29, 172, 214);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_lilac(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 191, 148, 228);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_maroon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 216, 145, 239);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_navy_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 195, 33, 72);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 25, 116, 210);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_turquoise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bright_ube(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 8, 232, 222);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brilliant_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 209, 159, 232);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brilliant_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 187, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brink_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 85, 163);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_British_racing_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 96, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bronze(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 66, 37);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bronze_Yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 205, 127, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brown__traditional_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 115, 112, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brown__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 75, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brown_nose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 165, 42, 42);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Brunswick_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 107, 68, 35);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bubble_gum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 27, 77, 62);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bubbles(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 193, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Buff(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 231, 254, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bud_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 220, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Bulgarian_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 123, 182, 97);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Burgundy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 72, 6, 7);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Burlywood(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 0, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Burnt_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 184, 135);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Burnt_sienna(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 85, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Burnt_umber(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 116, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Byzantine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 51, 36);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Byzantium(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 189, 51, 164);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 41, 99);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadet_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 83, 104, 114);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadet_grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 95, 158, 160);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadmium_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 145, 163, 176);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadmium_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 107, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadmium_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 237, 135, 45);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cadmium_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 0, 34);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Caf__au_lait(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 246, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Caf__noir(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 166, 123, 91);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cal_Poly_Pomona_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 75, 54, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cambridge_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 30, 77, 43);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Camel(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 163, 193, 173);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cameo_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 154, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Camouflage_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 239, 187, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Canary_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 120, 134, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Candy_apple_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 239, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Candy_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 8, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Capri(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 113, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Caput_mortuum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 191, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cardinal(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 89, 39, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Caribbean_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 196, 30, 58);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 204, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carmine__M_amp_P_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 0, 24);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carmine_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 0, 64);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carmine_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 235, 76, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carnation_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 56);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carnelian(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 166, 201);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carolina_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 179, 27, 27);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Carrot_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 86, 160, 211);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Castleton_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 237, 145, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Catalina_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 86, 63);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Catawba(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 6, 42, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cedar_Chest(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 54, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ceil(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 201, 90, 73);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Celadon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 146, 161, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Celadon_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 172, 225, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Celadon_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 123, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Celeste(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 47, 132, 124);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Celestial_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 178, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cerise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 73, 151, 208);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cerise_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 49, 99);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cerulean(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 236, 59, 131);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cerulean_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 123, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cerulean_frost(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 42, 82, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_CG_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 109, 155, 195);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_CG_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 122, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chamoisee(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 224, 60, 49);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Champagne(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 160, 120, 90);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Charcoal(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 231, 206);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Charleston_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 54, 69, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Charm_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 35, 43, 43);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chartreuse__traditional_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 143, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chartreuse__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 223, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cherry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 127, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cherry_blossom_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 49, 99);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chestnut(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 183, 197);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_China_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 149, 69, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_China_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 111, 161);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chinese_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 168, 81, 110);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chinese_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 170, 56, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chocolate__traditional_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 133, 96, 136);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chocolate__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 123, 63, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Chrome_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 210, 105, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cinereous(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 167, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cinnabar(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 129, 123);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cinnamon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 66, 52);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Citrine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 210, 105, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Citron(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 208, 10);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Claret(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 158, 169, 31);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Classic_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 127, 23, 52);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cobalt(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 204, 231);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cocoa_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 71, 171);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Coconut(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 210, 105, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Coffee(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 90, 62);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Columbia_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 111, 78, 55);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Congo_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 196, 216, 226);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cool_grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 131, 121);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Copper(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 140, 146, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Copper__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 184, 115, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Copper_penny(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 138, 103);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Copper_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 173, 111, 105);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Copper_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 203, 109, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Coquelicot(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 102, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Coral(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 56, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Coral_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 127, 80);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Coral_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 131, 121);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cordovan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 64, 64);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Corn(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 137, 63, 69);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cornell_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 236, 93);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cornflower_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 179, 27, 27);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cornsilk(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 100, 149, 237);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cosmic_latte(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 248, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cotton_candy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 248, 231);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cream(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 188, 217);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 253, 208);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Crimson_glory(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 220, 20, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cyan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 190, 0, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cyan__process_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cyber_grape(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 183, 235);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Cyber_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 88, 66, 124);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Daffodil(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 211, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dandelion(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 49);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 225, 48);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_blue_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 0, 139);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 102, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_byzantium(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 101, 67, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_candy_apple_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 93, 57, 84);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_cerulean(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 164, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_chestnut(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 8, 69, 126);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_coral(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 105, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_cyan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 205, 91, 69);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_electric_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 139, 139);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_goldenrod(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 83, 104, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_gray__X11_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 184, 134, 11);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 169, 169, 169);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_green__X11_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 1, 50, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_imperial_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 100, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_jungle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 65, 106);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_khaki(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 26, 36, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_lava(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 189, 183, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 72, 60, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_liver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 115, 79, 150);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_liver__horses_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 83, 75, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 84, 61, 55);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_medium_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 139, 0, 139);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_midnight_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 169, 169, 169);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_moss_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 51, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_olive_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 74, 93, 35);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 85, 107, 47);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 140, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_pastel_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 50, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_pastel_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 119, 158, 203);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_pastel_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 3, 192, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_pastel_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 111, 214);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 194, 59, 34);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_powder_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 231, 84, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_puce(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 51, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_raspberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 79, 58, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 135, 38, 87);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_salmon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 139, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_scarlet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 150, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_sea_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 86, 3, 25);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_sienna(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 143, 188, 143);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 60, 20, 20);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_slate_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 140, 190, 214);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_slate_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 72, 61, 139);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_spring_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 47, 79, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_tan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 23, 114, 69);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_tangerine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 145, 129, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 168, 18);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_terra_cotta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 72, 60, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_turquoise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 78, 92);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_vanilla(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 206, 209);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 209, 190, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dark_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 148, 0, 211);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dartmouth_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 155, 135, 12);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Davy_s_grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 112, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Debian_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 85, 85, 85);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 10, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_carmine_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 169, 32, 62);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_carrot_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 239, 48, 56);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_cerise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 105, 44);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_champagne(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 50, 135);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_chestnut(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 214, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_coffee(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 185, 78, 72);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 66, 65);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_jungle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 84, 193);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_lemon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 75, 73);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_lilac(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 199, 26);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 85, 187);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_mauve(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 0, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_moss_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 212, 115, 212);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_peach(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 53, 94, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 203, 164);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_puce(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 20, 147);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_ruby(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 169, 92, 104);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_saffron(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 132, 63, 91);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 153, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_Space_Sparkle(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 191, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_Taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 74, 100, 108);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deep_Tuscan_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 126, 94, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Deer(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 66, 77);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Denim(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 186, 135, 89);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Desert(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 21, 96, 189);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Desert_sand(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 154, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Desire(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 237, 201, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Diamond(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 234, 60, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dim_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 185, 242, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dirt(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 105, 105, 105);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dodger_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 155, 118, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dogwood_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 30, 144, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dollar_bill(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 24, 104);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Donkey_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 133, 187, 101);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Drab(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 76, 40);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Duke_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 113, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dust_storm(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 0, 156);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Dutch_white(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 229, 204, 201);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Earth_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 239, 223, 187);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ebony(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 225, 169, 95);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ecru(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 85, 93, 80);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Eerie_black(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 194, 178, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Eggplant(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 27, 27, 27);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Eggshell(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 97, 64, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Egyptian_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 234, 214);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 16, 52, 166);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 125, 249, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_cyan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 63);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_indigo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 111, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_lime(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 187, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_ultramarine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 191, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 63, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Electric_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 143, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Emerald(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Eminence(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 80, 200, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_English_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 108, 48, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_English_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 27, 77, 62);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_English_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 180, 131, 149);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_English_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 171, 75, 82);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Eton_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 86, 60, 92);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Eucalyptus(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 200, 162);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fallow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 68, 215, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Falu_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 154, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fandango(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 24, 24);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fandango_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 181, 51, 137);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fashion_fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 82, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fawn(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 0, 161);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Feldgrau(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 229, 170, 112);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Feldspar(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 77, 93, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fern_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 213, 177);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ferrari_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 79, 121, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Field_drab(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 40, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Firebrick(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 108, 84, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fire_engine_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 178, 34, 34);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Flame(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 206, 32, 41);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Flamingo_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 226, 88, 34);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Flattery(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 142, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Flavescent(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 107, 68, 35);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Flax(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 233, 142);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Flirt(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 220, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Floral_white(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 162, 0, 109);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fluorescent_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 250, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fluorescent_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 191, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fluorescent_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 20, 147);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Folly(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Forest_green__traditional_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Forest_green__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 1, 68, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_beige(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 34, 139, 34);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_bistre(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 166, 123, 91);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 133, 109, 77);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 114, 187);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_lilac(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 63, 146);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_lime(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 134, 96, 142);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_mauve(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 158, 253, 56);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 212, 115, 212);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_plum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 108, 158);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_puce(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 129, 20, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_raspberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 78, 22, 9);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 199, 44, 72);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 246, 74, 138);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 119, 181, 254);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_French_wine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 136, 6, 206);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fresh_Air(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 172, 30, 68);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 166, 231, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fuchsia__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fuchsia_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 84, 193);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fuchsia_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 119, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fuchsia_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 57, 123);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fulvous(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 199, 67, 117);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Fuzzy_Wuzzy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 132, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gainsboro(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 102, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gamboge(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 220, 220, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Generic_viridian(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 155, 15);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ghost_white(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 127, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Giants_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 248, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ginger(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 90, 29);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Glaucous(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 176, 101, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Glitter(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 96, 130, 182);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_GO_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 232, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gold__metallic_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 171, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gold__web___Golden_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 212, 175, 55);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gold_Fusion(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 215, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Golden_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 133, 117, 78);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Golden_poppy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 101, 21);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Golden_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 194, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Goldenrod(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 223, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Granny_Smith_Apple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 165, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Grape(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 168, 228, 160);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 111, 45, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gray__HTML_CSS_gray_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 128, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gray__X11_gray_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 128, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gray_asparagus(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 190, 190, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Gray_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 70, 89, 69);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__Color_Wheel___X11_green_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 140, 146, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__HTML_CSS_color_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 28, 172, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__Munsell_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 128, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__NCS_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 168, 119);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 159, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__pigment_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 173, 67);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green__RYB_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 165, 80);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Green_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 176, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Grullo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 173, 255, 47);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Guppie_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 169, 154, 134);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Halay___be(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Han_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 55, 84);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Han_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 68, 108, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Hansa_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 82, 24, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Harlequin(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 214, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Harvard_crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 63, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Harvest_gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 201, 0, 22);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Heart_Gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 145, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Heliotrope(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 128, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Heliotrope_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 223, 115, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Hollywood_cerise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 170, 152, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Honeydew(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 0, 161);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Honolulu_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 255, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Hooker_s_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 109, 176);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Hot_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 73, 121, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Hot_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 29, 206);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Hunter_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 105, 180);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Iceberg(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 53, 94, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Icterine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 113, 166, 210);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Illuminating_Emerald(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 247, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Imperial(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 49, 145, 119);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Imperial_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 96, 47, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Imperial_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 35, 149);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Imperial_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 2, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Inchworm(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 237, 41, 57);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Independence(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 178, 236, 93);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_India_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 76, 81, 109);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Indian_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 19, 136, 8);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Indian_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 205, 92, 92);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Indigo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 168, 87);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Indigo_dye(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 111, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Indigo__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 9, 31, 146);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_International_Klein_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 75, 0, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_International_orange__aerospace_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 47, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_International_orange__engineering_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 79, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_International_orange__Golden_Gate_Bridge_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 186, 22, 12);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Iris(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 192, 54, 44);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Irresistible(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 90, 79, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Isabelline(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 179, 68, 108);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Islamic_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 240, 236);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Italian_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 144, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ivory(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 178, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jade(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Japanese_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 168, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Japanese_indigo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 157, 41, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Japanese_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 38, 67, 72);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jasmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 91, 50, 86);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jasper(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 222, 126);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jazzberry_jam(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 59, 62);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jelly_Bean(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 165, 11, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 97, 78);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jonquil(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 52, 52, 52);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jordy_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 202, 22);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_June_bud(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 185, 241);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Jungle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 189, 218, 87);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Kelly_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 41, 171, 135);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Kenyan_copper(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 76, 187, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Keppel(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 124, 28, 5);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Khaki__HTML_CSS___Khaki_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 58, 176, 158);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Khaki__X11___Light_khaki_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 195, 176, 145);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Kobe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 230, 140);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Kobi(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 136, 45, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Kombu_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 231, 159, 196);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_KU_Crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 53, 66, 48);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_La_Salle_Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 232, 0, 13);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Languid_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 8, 120, 48);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lapis_lazuli(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 214, 202, 221);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Laser_Lemon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 38, 97, 156);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Laurel_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lava(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 169, 186, 157);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender__floral_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 207, 16, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 181, 126, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 230, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_blush(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 204, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 240, 245);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_indigo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 196, 195, 208);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 148, 87, 235);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_mist(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 130, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 230, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 174, 210);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lavender_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 123, 182);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lawn_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 160, 227);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 124, 252, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon_chiffon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 247, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon_curry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 250, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon_glacier(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 160, 29);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon_lime(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon_meringue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lemon_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 246, 234, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Licorice(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 244, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Liberty(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 26, 17, 16);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_apricot(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 84, 90, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 213, 177);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 173, 216, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_carmine_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 181, 101, 29);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_coral(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 103, 113);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_cornflower_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 128, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 147, 204, 234);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_cyan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 105, 145);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_deep_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 224, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_French_beige(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 92, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_fuchsia_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 200, 173, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_goldenrod_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 249, 132, 239);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 250, 210);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 211, 211, 211);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_hot_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 144, 238, 144);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_khaki(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 179, 222);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_medium_orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 240, 230, 140);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_moss_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 211, 155, 203);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 173, 223, 173);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_pastel_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 168, 215);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 177, 156, 217);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_red_ochre(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 182, 193);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_salmon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 116, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_salmon_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 160, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_sea_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 153, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 32, 178, 170);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_slate_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 135, 206, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_steel_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 119, 136, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 176, 196, 222);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_Thulian_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 179, 139, 109);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Light_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 143, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lilac(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 224);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lime__color_wheel_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 200, 162, 200);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lime__web___X11_green_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 191, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lime_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Limerick(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 50, 205, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lincoln_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 157, 194, 9);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Linen(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 25, 89, 5);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lion(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 240, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Liseran_Purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 154, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Little_boy_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 111, 161);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Liver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 108, 160, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Liver__dogs_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 103, 76, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Liver__organ_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 184, 109, 41);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Liver_chestnut(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 108, 46, 31);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Livid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 116, 86);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lumber(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 153, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Lust(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 228, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 32, 32);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magenta__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magenta__dye_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 85, 163);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magenta__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 202, 31, 123);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magenta__process_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 208, 65, 126);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magenta_haze(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 144);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magic_mint(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 159, 69, 118);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Magnolia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 170, 240, 209);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mahogany(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 244, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Maize(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 192, 64, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Majorelle_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 236, 93);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Malachite(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 96, 80, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Manatee(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 11, 218, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mango_Tango(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 151, 154, 170);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mantis(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 130, 67);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mardi_Gras(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 116, 195, 101);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Maroon__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 136, 0, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Maroon__HTML_CSS_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 195, 33, 72);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Maroon__X11_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mauve(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 176, 48, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mauve_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 224, 176, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mauvelous(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 145, 95, 109);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_May_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 239, 152, 170);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Maya_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 76, 145, 65);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Meat_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 115, 194, 251);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_aquamarine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 229, 183, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 221, 170);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_candy_apple_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 0, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 226, 6, 44);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_champagne(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 175, 64, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_electric_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 243, 229, 171);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_jungle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 3, 80, 150);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_lavender_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 28, 53, 45);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 221, 160, 221);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_Persian_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 186, 85, 211);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 103, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_red_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 147, 112, 219);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_ruby(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 187, 51, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_sea_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 170, 64, 105);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 60, 179, 113);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_slate_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 218, 235);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_spring_bud(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 123, 104, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_spring_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 201, 220, 135);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 250, 154);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_turquoise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 103, 76, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_Tuscan_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 72, 209, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_vermilion(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 121, 68, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Medium_violet_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 217, 96, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mellow_apricot(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 199, 21, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mellow_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 184, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Melon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 222, 126);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Metallic_Seaweed(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 188, 180);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Metallic_Sunburst(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 10, 126, 140);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mexican_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 156, 124, 56);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Midnight_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 0, 124);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Midnight_green__eagle_green_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 25, 25, 112);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mikado_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 73, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mindaro(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 196, 12);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mint(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 249, 136);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mint_cream(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 62, 180, 137);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mint_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 255, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Misty_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 255, 152);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Moccasin(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 228, 225);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mode_beige(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 235, 215);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Moonstone_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 113, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mordant_red_19(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 115, 169, 194);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Moss_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 174, 12, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mountain_Meadow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 154, 91);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mountbatten_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 48, 186, 143);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_MSU_Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 122, 141);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mughal_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 24, 69, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mulberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 48, 96, 48);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Mustard(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 197, 75, 140);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Myrtle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 219, 88);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Nadeshiko_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 49, 120, 115);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Napier_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 246, 173, 198);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Naples_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 42, 128, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Navajo_white(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 218, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Navy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 222, 173);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Navy_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 0, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Neon_Carrot(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 148, 87, 235);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Neon_fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 163, 67);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Neon_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 65, 100);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_New_Car(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 57, 255, 20);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_New_York_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 33, 79, 198);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Non_photo_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 131, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_North_Texas_Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 164, 221, 237);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Nyanza(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 5, 144, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ocean_Boat_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 233, 255, 219);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ochre(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 119, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Office_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 119, 34);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_burgundy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 128, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 67, 48, 46);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_heliotrope(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 207, 181, 59);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_lace(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 86, 60, 92);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 245, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_mauve(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 121, 104, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_moss_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 103, 49, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 134, 126, 54);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Old_silver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 192, 128, 129);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Olive(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 132, 132, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Olive_Drab___3_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 128, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Olive_Drab__7(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 107, 142, 35);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Olivine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 60, 52, 31);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Onyx(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 154, 185, 115);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Opera_mauve(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 53, 56, 57);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange__color_wheel_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 183, 132, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 127, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 117, 56);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange__RYB_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 88, 00);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 153, 2);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange_peel(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 165, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orange_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 159, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 69, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orchid_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 112, 214);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Orioles_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 242, 189, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Otter_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 79, 20);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Outer_Space(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 101, 67, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Outrageous_Orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 65, 74, 76);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Oxford_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 110, 74);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_OU_Crimson_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 33, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pakistan_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Palatinate_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 102, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Palatinate_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 39, 59, 226);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_aqua(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 104, 40, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 188, 212, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 175, 238, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 118, 84);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_cerulean(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 175, 64, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_chestnut(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 155, 196, 226);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_copper(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 221, 173, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_cornflower_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 138, 103);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 171, 205, 239);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_goldenrod(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 190, 138);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 232, 170);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 251, 152);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 220, 208, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 249, 132, 229);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_plum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 218, 221);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_red_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 221, 160, 221);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_robin_egg_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 219, 112, 147);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_silver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 222, 209);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_spring_bud(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 201, 192, 187);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 236, 235, 189);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_turquoise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 188, 152, 126);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pale_violet_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 175, 238, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pansy_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 219, 112, 147);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Paolo_Veronese_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 120, 24, 74);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Papaya_whip(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 155, 125);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Paradise_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 239, 213);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Paris_Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 62, 98);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 80, 200, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 174, 198, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 130, 105, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 207, 207, 196);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 119, 221, 119);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 154, 194);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 179, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 165, 164);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 179, 158, 181);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 105, 97);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pastel_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 203, 153, 201);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Patriarch(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 253, 150);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Payne_s_grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 0, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peach(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 83, 104, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peach2(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 229, 180);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peach_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 203, 164);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peach_puff(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 204, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peach_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 218, 185);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pear(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 223, 173);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pearl(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 209, 226, 49);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pearl_Aqua(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 234, 224, 200);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pearly_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 136, 216, 192);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peridot(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 183, 104, 162);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Periwinkle(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 226, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 204, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 28, 57, 187);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_indigo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 166, 147);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 50, 18, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 217, 144, 88);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_plum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 127, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 28, 28);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persian_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 51, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Persimmon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 40, 162);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Peru(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 236, 88, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Phlox(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 205, 133, 63);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Phthalo_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 223, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Phthalo_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 15, 137);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Picton_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 18, 53, 36);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pictorial_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 69, 177, 232);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Piggy_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 195, 11, 78);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pine_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 221, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pineapple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 1, 121, 111);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 86, 60, 13);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 192, 203);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink_lace(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 72, 148);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 221, 244);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 216, 178, 209);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink_pearl(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 153, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pink_Sherbet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 231, 172, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pistachio(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 143, 167);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Platinum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 147, 197, 114);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Plum(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 229, 228, 226);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Plum__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 142, 69, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pomp_and_Power(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 221, 160, 221);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Popstar(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 134, 96, 142);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Portland_Orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 190, 79, 98);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Powder_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 90, 54);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Princeton_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 176, 224, 230);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Prune(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 128, 37);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Prussian_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 28, 28);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Psychedelic_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 49, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Puce(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 223, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Puce_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 136, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pullman_Brown__UPS_Brown_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 114, 47, 55);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Pumpkin(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 100, 65, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple__HTML_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 117, 24);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple__Munsell_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 0, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple__X11_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 159, 0, 197);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple_Heart(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 160, 32, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple_mountain_majesty(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 105, 53, 156);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple_navy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 120, 182);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple_pizzazz(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 78, 81, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purple_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 78, 218);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Purpureus(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 80, 64, 77);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Quartz(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 154, 78, 174);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Queen_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 81, 72, 79);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Queen_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 67, 107, 149);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Quinacridone_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 232, 204, 215);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rackley(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 142, 58, 89);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Radical_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 93, 138, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rajah(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 53, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Raspberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 251, 171, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Raspberry_glace(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 11, 92);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Raspberry_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 145, 95, 109);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Raspberry_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 226, 80, 152);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Raw_umber(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 179, 68, 108);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Razzle_dazzle_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 130, 102, 68);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Razzmatazz(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 51, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Razzmic_Berry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 37, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 141, 78, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red__Munsell_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 32, 77);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red__NCS_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 242, 0, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 196, 2, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red__pigment_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 237, 41, 57);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red__RYB_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 237, 28, 36);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 39, 18);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red_devil(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 165, 42, 42);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 134, 1, 17);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 83, 73);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Red_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 0, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Redwood(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 199, 21, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Regalia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 164, 90, 82);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Resolution_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 82, 45, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rhythm(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 35, 135);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_black(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 119, 118, 150);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_brilliant_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 64, 64);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 241, 167, 254);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_electric_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 215, 0, 64);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 8, 146, 208);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_lilac(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 167, 107, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rich_maroon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 182, 102, 210);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rifle_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 176, 48, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Roast_coffee(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 68, 76, 56);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Robin_egg_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 66, 65);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rocket_metallic(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 204, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Roman_silver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 127, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 131, 137, 150);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_bonbon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_ebony(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 249, 66, 158);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 103, 72, 70);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_madder(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 183, 110, 121);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 38, 54);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_quartz(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 102, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 170, 152, 169);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 194, 30, 86);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rose_vale(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 144, 93, 93);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rosewood(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 171, 78, 82);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rosso_corsa(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 101, 0, 11);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rosy_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 212, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Royal_azure(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 188, 143, 143);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Royal_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 56, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Royal_blue2(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 35, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Royal_fuchsia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 65, 105, 225);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Royal_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 202, 44, 146);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Royal_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 120, 81, 169);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ruber(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 218, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rubine_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 206, 70, 118);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ruby(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 209, 0, 86);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ruby_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 224, 17, 95);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ruddy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 155, 17, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ruddy_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 0, 40);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ruddy_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 187, 101, 40);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rufous(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 225, 142, 150);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Russet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 168, 28, 7);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Russian_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 70, 27);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Russian_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 103, 146, 103);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rust(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 50, 23, 77);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Rusty_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 183, 65, 14);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sacramento_State_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 44, 67);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Saddle_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 86, 63);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Safety_orange__blaze_orange_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 139, 69, 19);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Safety_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 103, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Saffron(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 210, 2);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sage(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 196, 48);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_St__Patrick_s_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 188, 184, 138);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Salmon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 35, 41, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Salmon_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 128, 114);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sand(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 145, 164);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sand_dune(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 194, 178, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sandstorm(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 113, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sandy_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 236, 213, 64);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sandy_taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 164, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sangria(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 150, 113, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sap_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 146, 0, 10);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sapphire(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 80, 125, 42);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sapphire_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 15, 82, 186);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Satin_sheen_gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 103, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Scarlet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 203, 161, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Scarlet2(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 36, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Schauss_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 14, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_School_bus_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 145, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Screamin__Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 216, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sea_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 118, 255, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sea_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 105, 148);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Seal_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 46, 139, 87);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Seashell(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 50, 20, 20);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Selective_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 245, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sepia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 186, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shadow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 66, 20);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shadow_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 121, 93);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shampoo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 119, 139, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shamrock_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 207, 241);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sheen_Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 158, 96);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shimmering_Blush(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 143, 212, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shocking_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 217, 134, 149);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Shocking_pink__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 15, 192);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sienna(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 111, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Silver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 136, 45, 23);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Silver_chalice(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 192, 192, 192);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Silver_Lake_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 172, 172, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Silver_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 93, 137, 186);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Silver_sand(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 196, 174, 173);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sinopia(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 191, 193, 194);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Skobeloff(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 203, 65, 11);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 116, 116);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sky_magenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 135, 206, 235);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Slate_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 207, 113, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Slate_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 106, 90, 205);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Smalt__Dark_powder_blue_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 112, 128, 144);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Smitten(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 51, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Smoke(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 200, 65, 134);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Smokey_topaz(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 115, 130, 118);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Smoky_black(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 147, 61, 65);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Snow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 16, 12, 8);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Soap(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 250, 250);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Solid_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 206, 200, 239);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sonic_silver(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 137, 56, 67);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spartan_Crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 117, 117, 117);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Space_cadet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 158, 19, 22);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_bistre(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 29, 41, 81);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 117, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_carmine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 112, 184);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 209, 0, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 229, 26, 76);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 152, 152, 152);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 145, 80);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 232, 97, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 191, 190);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 230, 0, 38);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spanish_viridian(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 76, 40, 130);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spiro_Disco_Ball(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 127, 92);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spring_bud(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 15, 192, 252);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Spring_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 167, 252, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Star_command_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Steel_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 123, 184);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Steel_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 70, 130, 180);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Stil_de_grain_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 51, 204);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Stizza(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 218, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Stormcloud(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Straw(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 79, 102, 106);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Strawberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 217, 111);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sunglow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 90, 141);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sunray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 204, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sunset(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 171, 87);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Sunset_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 214, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Super_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 94, 83);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 207, 107, 169);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tangelo(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 210, 180, 140);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tangerine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 249, 77, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tangerine_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 242, 133, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tango_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 204, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Taupe(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 228, 113, 122);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Taupe_gray(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 72, 60, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tea_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 139, 133, 137);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tea_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 208, 240, 192);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tea_rose2(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 248, 131, 121);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Teal(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 244, 194, 194);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Teal_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 128, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Teal_deer(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 54, 117, 136);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Teal_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 230, 179);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Telemagenta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 130, 127);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tenn_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 207, 52, 118);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Terra_cotta(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 205, 87, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Thistle(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 226, 114, 91);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Thulian_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 216, 191, 216);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tickle_Me_Pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 111, 161);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tiffany_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 137, 172);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tiger_s_eye(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 10, 186, 181);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Timberwolf(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 224, 141, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Titanium_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 219, 215, 210);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tomato(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 230, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Toolbox(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 99, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Topaz(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 116, 108, 192);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tractor_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 200, 124);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Trolley_Grey(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 14, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tropical_rain_forest(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 128, 128, 128);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_True_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 117, 94);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tufts_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 115, 207);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tulip(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 65, 125, 193);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tumbleweed(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 135, 141);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Turkish_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 222, 170, 136);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Turquoise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 181, 114, 129);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Turquoise_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 64, 224, 208);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Turquoise_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 255, 239);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tuscan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 160, 214, 180);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tuscan_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 250, 214, 165);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tuscan_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 111, 78, 55);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tuscan_tan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 124, 72, 72);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tuscany(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 166, 123, 91);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Twilight_lavender(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 192, 153, 153);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Tyrian_purple(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 138, 73, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UA_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 102, 2, 60);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UA_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 51, 170);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ube(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 217, 0, 76);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UCLA_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 136, 120, 195);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UCLA_Gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 83, 104, 149);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UFO_Green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 179, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ultramarine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 60, 208, 112);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ultramarine_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 18, 10, 143);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ultra_pink(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 65, 102, 245);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Ultra_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 111, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Umber(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 108, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Unbleached_silk(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 99, 81, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_United_Nations_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 221, 202);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_University_of_California_Gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 91, 146, 229);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Unmellow_yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 183, 135, 39);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UP_Forest_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 102);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_UP_Maroon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 1, 68, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Upsdell_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 123, 17, 19);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Urobilin(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 174, 32, 41);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_USAFA_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 225, 173, 33);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_USC_Cardinal(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 79, 152);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_USC_Gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 153, 0, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_University_of_Tennessee_Orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 204, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Utah_Crimson(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 127, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vanilla(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 211, 0, 63);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vanilla_ice(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 243, 229, 171);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vegas_gold(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 243, 143, 169);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Venetian_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 197, 179, 88);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Verdigris(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 200, 8, 21);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vermilion(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 67, 179, 174);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vermilion2(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 227, 66, 52);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Veronica(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 217, 56, 30);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 160, 32, 240);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Violet__color_wheel_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 143, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Violet__RYB_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 127, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Violet__web_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 134, 1, 175);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Violet_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 238, 130, 238);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Violet_red(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 50, 74, 178);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Viridian(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 247, 83, 148);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Viridian_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 64, 130, 109);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vista_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 150, 152);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_auburn(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 124, 158, 217);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_burgundy(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 146, 39, 36);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_cerise(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 159, 29, 53);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 218, 29, 129);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_sky_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 204, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_tangerine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 204, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Vivid_violet(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 160, 137);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Warm_black(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 159, 0, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Waterspout(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 66, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wenge(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 164, 244, 249);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wheat(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 100, 84, 82);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_White(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 222, 179);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_White_smoke(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 255);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wild_blue_yonder(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 245, 245, 245);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wild_orchid(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 162, 173, 208);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wild_Strawberry(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 212, 112, 162);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wild_watermelon(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 67, 164);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Willpower_orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 108, 133);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Windsor_tan(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 253, 88, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wine(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 167, 85, 2);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wine_dregs(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 114, 47, 55);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wisteria(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 103, 49, 71);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Wood_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 201, 160, 220);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Xanadu(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 193, 154, 107);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yale_Blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 115, 134, 120);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yankees_blue(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 15, 77, 146);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 28, 40, 65);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow__Crayola_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 255, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow__Munsell_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 252, 232, 131);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow__NCS_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 239, 204, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow__Pantone_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 211, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow__process_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 223, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow__RYB_(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 239, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow_green(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 254, 254, 51);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow_Orange(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 154, 205, 50);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Yellow_rose(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 174, 66);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Zaffre(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 255, 240, 0);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Zinnwaldite_brown(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 0, 20, 168);
    }

    /**
     * @param img The image object.
     * @param pieceSize The piece size. [Mosaic pieces will be in square shape]
     */
    public static void color_Zomp(MyImage img, int pieceSize){
        _createMosaic(img, pieceSize, 44, 22, 8);
    }
}//class Mosaic ends here