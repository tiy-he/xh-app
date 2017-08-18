package cn.xh.app.common;

import android.util.Log;

/**
 * Created by xiaohe
 * 17-08-16 016
 */
public class L {
    private static final String TAG = "xiaohe";
    private static final boolean DEBUG = true;

    public static void d(String msg){
        if(DEBUG)
            Log.d(TAG,msg);
    }

    public static void e(String msg){
        if(DEBUG)
            Log.e(TAG,msg);
    }
}
