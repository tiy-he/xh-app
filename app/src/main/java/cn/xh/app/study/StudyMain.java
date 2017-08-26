package cn.xh.app.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.xh.app.R;
import cn.xh.app.study.activity.activityLifeCycle.ActivityLifeCycle;
import cn.xh.app.study.activity.viewSkip.ViewSkip;
import cn.xh.app.study.view.autoCompleteTextView.AutoCompleteTextViewTest;
import cn.xh.app.study.view.btnListen.BtnListenActivity;
import cn.xh.app.study.view.checkBox.CheckBoxTest;
import cn.xh.app.study.view.dialog.DialogTest;
import cn.xh.app.study.view.menu.ContextMenuTest;
import cn.xh.app.study.view.menu.MenuTest;
import cn.xh.app.study.view.notification.NotificationTest;
import cn.xh.app.study.view.radio.RadioTest;
import cn.xh.app.study.view.textView.TextViewTest;
import cn.xh.app.study.view.toast.ToastTest;
import cn.xh.app.study.view.toggleButton.ToggleButtonTest;

/**
 * Created by xiaohe
 * 17-08-16 016
 */
public class StudyMain extends Activity{
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

    public void toActivity(View view) {
        go(ActivityLifeCycle.class);
    }

    public void toViewSkip(View view) {
        go(ViewSkip.class);
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
}
