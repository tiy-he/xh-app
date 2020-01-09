package com.xiaohe66.apk.demo.study.view.listView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiaohe66.apk.demo.R;

/**
 * Created by xiaohe
 * 17-08-28 028
 *
 * ListView，显示列表控件
 *
 * 适配器-->把复杂的数据填充到指定的视力上，主要有以下2种
 * 1.ArrayAdapter       数组适配器
 *      一般用于绑定比较单一的数据，如集合或数组
 * 2.SimpleAdapter      简单适配器
 *      绑定格式复杂的数据，只能是特定泛型的集合
 */
public class ListViewDemo extends Activity{
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_list_view);

        listView = (ListView) findViewById(R.id.stu_view_list_view_list1);



        //1.数组适配器，简单不多作解释
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new String[]{});

        //2.简单适配器
        /**
         * new SimpleAdapter()参数：
         * @param context   上下文，一般传this即可
         * @param data      数据源，List<? extends Map<String, ?>>类型
         * @param resource  布局文件资源id
         * @param from      数据源中Map的键
         * @param to        布局文件中的控件
         */
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,getData(),R.layout.stu_view_list_view_item,
                new String[]{"pic","text"},new int[]{R.id.stu_view_list_view_item_img,R.id.stu_view_list_view_item_text});

        //给ListView设置适配器
        //listView.setAdapter(arrayAdapter);//数组适配器
        listView.setAdapter(simpleAdapter);
    }

    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> data = new ArrayList<>();
        for(int i=0;i<10;i++){
            Map<String,Object> item = new HashMap<>();
            item.put("pic",R.drawable.img);
            item.put("text","item"+(i+1));
            data.add(item);
        }
        return data;
    }
}
