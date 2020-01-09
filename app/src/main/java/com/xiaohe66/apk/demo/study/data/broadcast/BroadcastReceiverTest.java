package com.xiaohe66.apk.demo.study.data.broadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaohe66.apk.demo.R;

/**
 * Created by xiaohe
 * 17-08-27 027
 *
 * Broadcast，广播
 * 广播是应用程序之间传递信息的一种机制
 *
 * BroadcastReceiver是为开发者提供的一个类
 * 其中封装了大多数相关的方法，作为开发者，只需要掌握该类的使用即可
 *
 * 广播的分类：
 * 1.普通广播：所有监听该广播的接收者都可以监听该广播
 * 2.有序广播：按接收者的优先级接收广播，优先级在Intent-filter中的priority声明，值在-1000到1000之间
 *            值越大，优先级越高。可以终止广播的继续发送，也可以修改内容。
 * 3.异步广播：不能将处理结果传给下一个接收者，无法终止广播。
 *
 * 终止广播的发送   -->    .abortBroadcast();
 *
 * 使用方法
 *
 * 发送：
 * 1.把信息封装到Intent对象中
 * 2.调用广播方法将Intent对象以广播的形式发送出去，如
 *      .sendBroadcast()
 *      .sendOrderBroadcast()
 *      .sendStickyBroadcast()
 *
 * 接收：
 * 当Intent对象发送出去后，所有已经注册的BroadcastReceiver会检查注册时的IntentFilter是否与之匹配
 * 若匹配则调用OnReceive()方法。
 * 所以，当我们需要定义一个BroadcastReceiver的时候，就需要重写其中的OnReceive()方法
 *
 *
 * 注意事项：
 * 1.BroadcastReceiver生命周期大概只有5秒
 * 2.BroadcastReceiver里不能做耗时操作，应该通过Intent发送给service，让service做耗时操作
 * 3.不能使用子线程
 */
public class BroadcastReceiverTest extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_data_broadcast);
    }

    /**
     * 普通广播，有以下特点
     * 1.同优先级的接收者收到消息的顺序是无序的
     * 2.不同优先级的接收者，优先级高的先接收到
     *
     * @param view
     */
    public void common(View view) {
        Intent intent = new Intent();
        //设置action，与需要接收广播的接收者注册的过滤器一致
        intent.setAction("BC_ONE");
        //消息内容
        intent.putExtra("msg","普通广播消息");
        //发送广播
        sendBroadcast(intent);
    }
}
