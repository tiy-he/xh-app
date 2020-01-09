package com.xiaohe66.apk.demo.study.data.sharedPreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-26 026
 *
 * SharedPreferences类可以在安卓上保存一些较小的数据
 * 如登录名之类的信息，可以在关闭app后下次打开时读取
 *
 */
public class SharedPreferencesTest extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_empty_layout);

        //获取默认的sharedPreferences实例
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        //自定义名称和权限的sharedPreferences实例
        SharedPreferences sharedPreferences = getSharedPreferences("xh_app_data.xml",MODE_PRIVATE);

        //获取Editor对象
        SharedPreferences.Editor editor = sharedPreferences.edit();

        //使用editor对象进行写操作，可以添加和删除
        editor.putString("name","xiaohe");
        editor.putInt("age",21);

        //删除
        editor.remove("age");

        //调用此方法，写操作才能生效
        editor.apply();

        //获取时数据，只需要通过savedInstanceState实例即可
        sharedPreferences = getSharedPreferences("xh_app_data.xml",MODE_PRIVATE);
        String name = savedInstanceState.getString("name");
        L.d(name);

    }
}
