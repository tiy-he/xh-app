package cn.xh.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.xh.app.project.calculator.CalculatorMain;
import cn.xh.app.study.StudyMain;

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
    public void toView(View view) {
        go(StudyMain.class);
    }

    public void toCalculatorMain(View view) {
        go(CalculatorMain.class);
    }
}
