package com.xiaohe66.apk.demo.study.view.autoCompleteTextView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.xiaohe66.apk.demo.R;

/**
 * Created by xiaohe
 * 17-08-18 018
 *
 * AutoCompleteTextView控件是一个在用户输入内容时自动下拉的列表
 * 列表可以显示用户输入内容的匹配的内容
 *
 * MultiAutoCompleteTextView控件是前者的升级版
 * 它可以同时输入多个内容，如邮件的收件人输入框
 * 它在使用时和前者大致相同，不过需要设置一个分隔符
 */
public class AutoCompleteTextViewTest extends Activity{

    private AutoCompleteTextView autoCompleteTextView;

    private MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_auto_com_text_view);

        autoCompleteTextViewInit();
        multiAutoCompleteTextViewInit();

    }

    private void multiAutoCompleteTextViewInit() {
        //1.获取控件
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.stu_multi_auto_com_text_view);
        //2.创建适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        //3.设置数据源
        adapter.addAll("one1","one2","one3","two1","two2");
        //4.让控件和适配器绑定
        multiAutoCompleteTextView.setAdapter(adapter);
        //5.设置分隔符，这里设置为逗号
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    private void autoCompleteTextViewInit() {

        //1.获取控件
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.stu_auto_com_text_view);
        //2.创建适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        //3.设置数据源
        adapter.addAll("one1","one2","one3","two1","two2");
        //4.让控件和适配器绑定
        autoCompleteTextView.setAdapter(adapter);
    }
}
