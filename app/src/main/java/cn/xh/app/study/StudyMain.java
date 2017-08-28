package cn.xh.app.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.xh.app.R;
import cn.xh.app.study.activity.ActivityMain;
import cn.xh.app.study.view.ViewMain;

/**
 * Created by xiaohe
 * 17-08-28 028
 */
public class StudyMain extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_main);
    }

    private void go(Class cls){
        startActivity(new Intent(this,cls));
    }

    public void toView(View view) {
        go(ViewMain.class);
    }

    public void toAct(View view) {
        go(ActivityMain.class);
    }
}
