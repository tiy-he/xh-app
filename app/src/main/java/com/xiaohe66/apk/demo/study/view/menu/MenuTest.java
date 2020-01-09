package com.xiaohe66.apk.demo.study.view.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.ToastHelper;

/**
 * Created by xiaohe
 * 17-08-23 023
 */
public class MenuTest extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_menu);
    }

    /**
     * 菜单创建方法,xml方式
     * 重写该方法，使应用在页面上按菜单按钮时，生成菜单
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //使用这条语句即可将xml菜单绑定到视力上，在点击菜单按钮时显示
        getMenuInflater().inflate(R.menu.stu_menu,menu);

        return true;
    }

    /**
     * 菜单的点击事件
     * @param featureId
     * @param item
     * @return
     */
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (featureId){
            case R.id.stu_menu_item:
                ToastHelper.showDefaultToast(this,item.getTitle()+"");
                break;
            default:
                ToastHelper.showDefaultToast(this,"未知的按钮");
        }
        return super.onMenuItemSelected(featureId,item);
    }
}
