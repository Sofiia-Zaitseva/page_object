package com.a_level.page_object.utils;

import net.bytebuddy.utility.RandomString;

import java.nio.charset.Charset;
import java.util.Random;

public class StringUtils {
    public static String RandomString (Integer lenght){
        byte[] array = new byte[lenght]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
