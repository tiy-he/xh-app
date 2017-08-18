package cn.xh.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.xh.app.study.StudyMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

    }

    public void toView(View view) {
        Intent intent = new Intent();
        intent.setClass(this, StudyMain.class);
        startActivity(intent);
    }
}
