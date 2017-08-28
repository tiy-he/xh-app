package cn.xh.app.study.data.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import cn.xh.app.common.L;

/**
 * Created by xiaohe
 * 17-08-27 027
 *
 * 广播接收者
 *
 */
public class BroadcastReceiver4 extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("msg");
        L.d("广播接收者4号收到消息："+msg);
    }
}
