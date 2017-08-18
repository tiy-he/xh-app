package cn.xh.app.study.activity.viewSkip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.xh.app.R;

/**
 * Created by xiaohe
 * 17-08-18 018
 */
public class ViewSkipGoal extends Activity{

    private Button btn;
    private String data = "这是第2个页面的信息";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_act_view_skip_goal);

        btn = (Button) findViewById(R.id.stu_act_view_skip_goal_back);
        btn.setOnClickListener(new View.OnClickListener() {

            //点击时给原页面返回信息
            @Override
            public void onClick(View v) {
                //封装好返回的信息
                Intent intent = new Intent();
                intent.putExtra("data",data);
                //返回信息
                setResult(2,intent);
                //关闭当前页面
                finish();
            }
        });
    }
}
