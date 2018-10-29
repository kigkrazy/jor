package com.zhy.http.okhttp.utils;

/**
 * Created by zhy on 15/11/6.
 */
public class L
{
    private static boolean debug = false;

    public static void e(String msg)
    {
        if (debug)
        {
            System.out.println("<OkHttp> " + msg);
        }
    }

}

