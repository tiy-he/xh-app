package com.xiaohe66.apk.demo.study.view.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.xiaohe66.apk.demo.R;

/**
 * Created by xiaohe
 * 17-08-19 019
 *
 * Toast是一个提示框
 * 它不会影响用户的使用，不会获得焦点，只起到提示作用
 */
public class ToastTest extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_toast);
    }

    public void defaultToast(View view) {
        Toast.makeText(this,"默认Toast",Toast.LENGTH_SHORT).show();
    }

    public void positionToast(View view) {
        Toast toast = Toast.makeText(this,"改变位置的Toast",Toast.LENGTH_SHORT);
        /*
         * 该语句设置提示框位置
         * 第1个参表示位置，居中、左对齐、右对齐等
         * 第2个参和第3个参表示x和y的偏移量
         */
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }

    public void imgToast(View view) {
        //1.创建toast
        Toast toast = Toast.makeText(this,"带图片的toast",Toast.LENGTH_SHORT);
        //2.获取布局
        LinearLayout linearLayout = (LinearLayout) toast.getView();
        //3.设置图片
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);
        //第2个参数设置为0，表示在显示toast的文字前面，设置为1可以使其在文字下面
        linearLayout.addView(imageView,0);
        //4.显示
        toast.show();
    }

    /**
     * 自定义toast
     *
     * 实现该toast需要先定义好一个layout文件，以便使用
     * @param view
     */
    public void diyToast(View view) {
        //1.创建toast
        Toast toast = new Toast(this);
        //2.获取布局文件
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View toastView = layoutInflater.inflate(R.layout.stu_view_toast_layout,null);
        //3.给toast设置该布局文件
        toast.setView(toastView);
        //4.显示
        toast.show();
    }
}
