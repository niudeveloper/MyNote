/*
 * Written by wei.Li and released to the public domain
 * Welcome to correct discussion as explained at
 *
 * -----------------------------------------------------------------
 *
 * GitHub:  https://github.com/GourdErwa
 * CSDN  :	http://blog.csdn.net/xiaohulunb
 * WeiBo :	http://www.weibo.com/xiaohulunb  	@GourdErwa
 * Email :	gourderwa@163.com
 *
 * Personal home page: http://grouderwa.com
 */

package io;

import java.io.*;

/**
 * @author wei.Li by 15/1/19 (gourderwa@163.com).
 */
public class InOutPutStream_ {


    private static void aVoid() throws FileNotFoundException {

        InputStream inputStream;

        inputStream = new FileInputStream(new File("fileName"));
        inputStream = new ByteArrayInputStream(new byte[]{1, 2, 3});

        final InputStreamReader inputStreamReader = new InputStreamReader(null);
    }

    public static void main(String[] args) {

    }
}
