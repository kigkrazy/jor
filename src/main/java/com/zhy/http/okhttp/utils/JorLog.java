package com.zhy.http.okhttp.utils;

public class JorLog {
    public static void d(String tag, String msg) {
        System.out.println(String.format("[%s] : %s", tag, msg));
    }

    public static void i(String tag, String msg) {
        System.out.println(String.format("[%s] : %s", tag, msg));
    }

    public static void v(String tag, String msg) {
        System.out.println(String.format("[%s] : %s", tag, msg));
    }

    public static void e(String tag, String msg) {
        System.out.println(String.format("[%s] : %s", tag, msg));
    }
}
