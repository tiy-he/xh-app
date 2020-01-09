package com.xiaohe66.apk.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.study.StudyMain;
import com.xiaohe66.apk.demo.study.data.DataMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void go(Class<?> cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }

    /*public void toCalculatorMain(View view) {
        go(CalculatorMain.class);
    }*/

    public void toData(View view) {
        go(DataMain.class);
    }

    public void toStudy(View view) {
        go(StudyMain.class);
    }
}
