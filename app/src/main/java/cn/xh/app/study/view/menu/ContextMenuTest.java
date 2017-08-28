package cn.xh.app.study.view.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cn.xh.app.R;
import cn.xh.app.common.ToastHelper;

/**
 * Created by xiaohe
 * 17-08-23 023
 *
 * 上下文菜单
 * 当在页面上长按的时候出现的菜单，称之为上下文菜单
 * 每一个view都可以设置一个上下文菜单
 *
 * 菜单的选项可以通过代码或xml布局添加
 *
 * 对于需要设置上下文菜单的view，需要使用registerForContextMenu()方法进行注册
 */
public class ContextMenuTest extends Activity{
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_context_menu);
        showListView();
    }

    private void showListView() {
        listView = (ListView) findViewById(R.id.stu_context_menu_list_view);

        String[] items = new String[]{"1","2","3","4","5"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(arrayAdapter);

        //注册上下文菜单
        this.registerForContextMenu(listView);
    }

    /**
     * 重写该方法，实现上下文菜单创建
     * @param menu
     * @param v
     * @param menuInfo
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("标题");
        menu.setHeaderIcon(R.drawable.img);//设置标题图片
        menu.add(1,1,1,"选项1");
        menu.add(1,2,1,"选项2");
        menu.add(1,3,1,"选项3");
        menu.add(1,4,1,"选项4");

        //除了代码添加菜单，也可以通过加载xml设置菜单
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.stu_view_menu,menu);//加载xml布局
    }

    /**
     * 重写该方法，实现上下文菜单点击事件
     * @param item
     * @return
     */
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case 1:
                ToastHelper.showDefaultToast(this,"点击了选项1");
                break;
            case 2:
                ToastHelper.showDefaultToast(this,"点击了选项2");
                break;
            case 3:
                ToastHelper.showDefaultToast(this,"点击了选项3");
                break;
            case 4:
                ToastHelper.showDefaultToast(this,"点击了选项4");
                break;
            default:
                ToastHelper.showDefaultToast(this,"未知");
        }

        return super.onContextItemSelected(item);
    }
}
