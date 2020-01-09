package com.xiaohe66.apk.demo.study.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.study.view.autoCompleteTextView.AutoCompleteTextViewTest;
import com.xiaohe66.apk.demo.study.view.btnListen.BtnListenActivity;
import com.xiaohe66.apk.demo.study.view.checkBox.CheckBoxTest;
import com.xiaohe66.apk.demo.study.view.dialog.DialogTest;
import com.xiaohe66.apk.demo.study.view.listView.ListViewDemo;
import com.xiaohe66.apk.demo.study.view.menu.ContextMenuTest;
import com.xiaohe66.apk.demo.study.view.menu.MenuTest;
import com.xiaohe66.apk.demo.study.view.notification.NotificationTest;
import com.xiaohe66.apk.demo.study.view.radio.RadioTest;
import com.xiaohe66.apk.demo.study.view.textView.TextViewTest;
import com.xiaohe66.apk.demo.study.view.toast.ToastTest;
import com.xiaohe66.apk.demo.study.view.toggleButton.ToggleButtonTest;

/**
 * Created by xiaohe
 * 17-08-16 016
 */
public class ViewMain extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_main);
    }

    private void go(Class<?> cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }

    public void toBtnListen(View view) {
        go(BtnListenActivity.class);
    }

    public void toLongTextView(View view) {
        go(TextViewTest.class);
    }

    public void toAutoText(View view) {
        go(AutoCompleteTextViewTest.class);
    }

    public void toOnOff(View view) {
        go(ToggleButtonTest.class);
    }

    public void toCheckBox(View view) {
        go(CheckBoxTest.class);
    }

    public void toRadio(View view) {
        go(RadioTest.class);
    }

    public void toToast(View view) {
        go(ToastTest.class);
    }

    public void toDialog(View view) {
        go(DialogTest.class);
    }

    public void toNotification(View view) {
        go(NotificationTest.class);
    }

    public void toMenu(View view) {
        go(MenuTest.class);
    }

    public void toContextMenu(View view) {
        go(ContextMenuTest.class);
    }

    public void toListView(View view) {
        go(ListViewDemo.class);
    }
}
