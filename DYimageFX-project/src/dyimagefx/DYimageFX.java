package dyimagefx;
/**
 * File: DYimageFX.java
 * 
 * Description:
 * Main() file
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
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
public class DYimageFX {
    public static void main(String[] args) {
        about();
        System.out.println();
        author();
        System.out.println();
        license();
    }
    
    public static void about(){
        String product = "DY imageFX - Open Source Image Processing Project";
        String version = "Version: 1.0";
        String latestUpdate = "Latest Update: 28-04-2014 Monday";
        String url = "GitHub: www.github.com/yusufshakeel/Java-Image-Processing-Project";
        
        //output
        System.out.println(product);
        System.out.println(version);
        System.out.println(latestUpdate);
        System.out.println(url);
    }
    public static void author(){
        String name = "Author: Yusuf Shakeel";
        String links = "Links:\n"
                +"GitHub: www.github.com/yusufshakeel\n"
                + "YouTube: www.youtube.com/yusufshakeel\n"
                + "Facebook: www.facebook.com/yusufshakeel\n"
                + "GooglePlus: plus.google.com/+YusufShakeel";
        //output
        System.out.println(name);
        System.out.println(links);
    }
    
    public static void license(){
        String license = "License:\n"
            +"The MIT License (MIT)\n"
            +"Copyright (c) 2014 Yusuf Shakeel\n"
            +"\n"
            +"Permission is hereby granted, free of charge, to any person obtaining a copy of\n"
            +"this software and associated documentation files (the \"Software\"), to deal in\n"
            +"the Software without restriction, including without limitation the rights to\n"
            +"use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of\n"
            +"the Software, and to permit persons to whom the Software is furnished to do so,\n"
            +"subject to the following conditions\n"
            +"\n"
            +"The above copyright notice and this permission notice shall be included in all\n"
            +"copies or substantial portions of the Software.\n"
            +"\n"
            +"THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n"
            +"IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS\n"
            +"FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR\n"
            +"COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER\n"
            +"IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN\n"
            +"CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.";
        System.out.println(license);
    }
}