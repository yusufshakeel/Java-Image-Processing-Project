Java-Image-Processing-Project
=============================

DY imageFX - Image Processing project

By: Yusuf Shakeel

Date: 26-Jan-2014 Sunday


[facebook.com/yusufshakeel](https://www.facebook.com/yusufshakeel)

[youtube.com/yusufshakeel](https://www.youtube.com/yusufshakeel)

[github.com/yusufshakeel](https://www.github.com/yusufshakeel)

[plus.google.com/+YusufShakeel](https://plus.google.com/+YusufShakeel/posts)


Note
----
This project is in development stage so files will get modified quite often.

I have used NetBeans IDE 7.3.1 for this project. It is a free software and you can download it from there website [netbeans.org] (https://netbeans.org)


Content
-------

Directories:

 * src - Holds the source code files.
 * src/imageFX - This directory is the ENGINE of the project. It contains .java files to process image.
 * src/imageFX/filter - This directory contains .Java files that performs filtering operations like median, mean filter etc.
 * src/imageFX/morph - This directory contains .Java files that performs morphological operations like erosion, dilation etc.
 * src/myPackage - This directory contains .java files that uses the ENGINE to give output.

Files:

 * src/imageFX/DYCanvas.java - This file contains some random canvas creating method.
 * src/imageFX/DYColor.java - This file contains hex value of colors.
 * src/imageFX/DYMosaic.java - This file contains methods to create mosaic.
 * src/imageFX/FilterImage.java - Contains filtering methods.
 * src/imageFX/ImageFX.java - Contains common image processing functions like flip, negative etc.
 * src/imageFX/MyImage.java - Contains MyImage class that is used to create image objects.
 * src/imageFX/ThresholdImage.java - Contains thresholding methods.

 * src/imageFX/filter/mean.java - To perform mean filter operation.
 * src/imageFX/filter/median.java - To perform median filter operation.

 * src/imageFX/morph/erosion - To perform erosion operation.
 * src/imageFX/morph/dilation - To perform dilation operation.


### How to use the imageFX package in your project?

1. Download the [Java-Image-Processing-Project](https://github.com/yusufshakeel/Java-Image-Processing-Project) repository and copy paste the imageFX directory inside your project directory.
2. Import the imageFX classes inside your java file(s) where you want to use it.

For instance, if you want to import the imageFX classes inside your Test.java file, then write the following line

`import imageFX.*;`

inside your Test.java file.

So your Test.java file may look something like this

    import java.io.*;

    import imageFX.*;

    public class Test{

        //your code goes here...

    }//class Test ends here


### For more details check the project wiki [https://github.com/yusufshakeel/Java-Image-Processing-Project/wiki] (https://github.com/yusufshakeel/Java-Image-Processing-Project/wiki)



# License

The MIT License (MIT)

Copyright (c) 2014 Yusuf Shakeel

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
