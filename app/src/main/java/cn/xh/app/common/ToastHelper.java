package cn.xh.app.common;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by xiaohe
 * 17-08-21 021
 */
public class ToastHelper {

    public static void showDefaultToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

}
