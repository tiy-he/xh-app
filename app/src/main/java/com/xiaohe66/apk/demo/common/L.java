package com.xiaohe66.apk.demo.common;

import android.util.Log;

/**
 * Created by xiaohe
 * 17-08-16 016
 */
public class L {
    private static final String TAG = "xh_log";
    private static final boolean DEBUG = true;

    public static void d(String msg){
        if(DEBUG)
            Log.d(TAG,msg);
    }

    public static void d(int msg){
        if(DEBUG)
            Log.d(TAG,msg+"");
    }

    public static void d(double msg){
        if(DEBUG)
            Log.d(TAG,msg+"");
    }

    public static void e(String msg){
        if(DEBUG)
            Log.e(TAG,msg);
    }
}
