package com.xiaohe66.apk.demo.study.activity.gesture;

import android.app.Activity;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;
import android.os.Bundle;

import java.util.ArrayList;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.ToastHelper;

/**
 * Created by xiaohe
 * 17-08-27 027
 *
 * 使用GestureOverlayView对手势进行识别会相对较为复杂，主要步骤
 * 1.使用Gesture Builder生成手势文件(可以使用android虚拟机中的Gesture Builder程序生成)
 * 2.将生成的手势文件加入项目中
 * 3.在需要使用手势识别的地方加载手势文件
 * 4.匹配、识别
 */
public class GestureOverlayViewTest extends Activity{
    private GestureOverlayView gestureOverlayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_act_gesture);

        gestureOverlayView = (GestureOverlayView) findViewById(R.id.stu_view_gesture_overlay_view);

        //1.加载手势
        final GestureLibrary gestureLibrary = GestureLibraries.fromRawResource(this,R.raw.gestures);
        gestureLibrary.load();

        //2.添加监听器
        gestureOverlayView.addOnGesturePerformedListener(new OnGesturePerformedListener() {
            @Override
            public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {
                ArrayList<Prediction> predictionArrayList = gestureLibrary.recognize(gesture);

                Prediction prediction = predictionArrayList.get(0);
                //score为手势的识别度，取值大概在0-10之间
                if(prediction.score > 5.0){
                    if("back".equals(prediction.name)){
                        ToastHelper.showDefaultToast(GestureOverlayViewTest.this,"back手势");
                    }
                }else{
                    ToastHelper.showDefaultToast(GestureOverlayViewTest.this,"不存在该手势");
                }
            }
        });

    }
}
