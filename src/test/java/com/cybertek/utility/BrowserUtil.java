package com.cybertek.utility;

public class BrowserUtil {
    /**
     * Waitong for x second without handling exeption
     * @param second
     */
    public static void waitFor(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
