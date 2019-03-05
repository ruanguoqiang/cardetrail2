package com.config;

public class Playutil {

    public static String openExe(String file) {
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
            p = rn.exec("/vlc-2.2.1/vlc"+file);
        } catch (Exception e) {
            System.out.println("Error exec!");
            return "error";
        }
        return "sucess";
    }
}
