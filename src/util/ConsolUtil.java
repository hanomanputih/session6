package util;

import java.util.Date;

/**
 * Created by IvanAdhi on 16/03/18.
 */
public class ConsolUtil {
    public static void tampilMenu(){
        System.out.println("1. Menu 1");
        System.out.println("2. Menu 2");
    }

    public static String showPointer(Object object){
        return object.toString();
    }

    public static String writeLog(String proses){
        return new Date() + ": " + proses;
    }
}
