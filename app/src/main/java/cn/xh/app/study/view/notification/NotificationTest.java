package cn.xh.app.study.view.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.xh.app.R;

/**
 * Created by xiaohe
 * 17-08-21 021
 */
public class NotificationTest extends Activity{

    private NotificationManager notificationManager;
    private int notificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_notification);
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void sendInform(View view) {

        Intent intent = new Intent(this,NotificationTest.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this,0, intent,0);

        //构建通知
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.img);//设置图片
        builder.setTicker("hello");//手机状态栏的提示
        builder.setWhen(System.currentTimeMillis());//设置时间
        builder.setContentTitle("标题");//设置标题
        builder.setContentText("通知栏通知内容");//通知内容
        builder.setContentIntent(pendingIntent);//设置点击后的意图


        //设置物理提示，需要获取相关权限
//        builder.setDefaults(Notification.DEFAULT_ALL);//设置以上下三种效果

//        builder.setDefaults(Notification.DEFAULT_LIGHTS);//设置提示灯
//        builder.setDefaults(Notification.DEFAULT_SOUND);//设置提示声音
//        builder.setDefaults(Notification.DEFAULT_VIBRATE);//设置振动

        Notification notification = builder.build();
//        builder.getNotification();//4.1以下版本使用

        //发送通知到通知栏
        notificationManager.notify(notificationId,notification);
    }

    public void cancelInform(View view) {
        //取消通知
        notificationManager.cancel(notificationId);
    }
}
