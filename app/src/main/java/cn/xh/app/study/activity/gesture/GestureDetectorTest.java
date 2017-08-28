package cn.xh.app.study.activity.gesture;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

import cn.xh.app.R;
import cn.xh.app.common.ToastHelper;

/**
 * Created by xiaohe
 * 17-08-27 027
 *
 * 手势交互原理
 * 1.触屏一刹，会触发MotionEvent事件
 * 2.然后被OnTouchListener监听，在OnTouch()中获取MotionEvent对象
 * 3.GestureDetector转发MotionEvent对象至OnGestureListener接口
 * 4.OnGestureListener获得该对象后，进行信息处理
 *
 * Motion：
 * 1.用于封装手势、触摸笔、轨迹球等动作事件
 * 2.内部封装用于记录横轴和纵轴坐标的属性x和y
 *
 * GestureDetector：
 * 1.识别各种手势
 *
 * OnGestureListener：
 * 1.手势交互的监听接口，提供多个抽象方法
 * 2.根据GestureDetector的手势识别结果调用相应的方法
 *
 * GestureDetector的工作原理：
 * 1.当接收到用户触摸消息时，会将消息传给GestureDetector进行加工
 * 2.通过设置监听器获取GestureDetector处理后的手势
 *
 * GestureDetector提供了两个监听器
 * 1.OnGestureListener：处理单击事件
 * 2.OnDoubleTapListener：处理双击事件
 *
 */
public class GestureDetectorTest extends Activity{
    private View view;
    private GestureDetector myGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_act_gesture);

        //自己实现的处理手势结果的类
        myGestureDetector = new GestureDetector(this,new MyOnGestureListene());

        view = findViewById(R.id.stu_view_gesture_view);

        //给view设置OnTouchListener事件
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //转发MotionEvent到实例化时设置的OnGestureListener中
                myGestureDetector.onTouchEvent(event);
                return true;
            }
        });
    }

    /**
     * SimpleOnGestureListener类是简化的OnGestureListener实现类
     */
    private class MyOnGestureListene extends SimpleOnGestureListener{

        /**
         * 当手势结果是滑动时，会调用些方法
         *
         * @param e1        手势按下时触发的事件
         * @param e2        手势抬起时触发的事件
         * @param velocityX
         * @param velocityY
         * @return
         */
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if(e1.getX() - e2.getX() > 50){
                ToastHelper.showDefaultToast(GestureDetectorTest.this,"右到左");
            }else if(e2.getX() - e1.getX() > 50){
                ToastHelper.showDefaultToast(GestureDetectorTest.this,"左到右");
            }
            return super.onFling(e1, e2, velocityX, velocityY);
        }
    }
}
