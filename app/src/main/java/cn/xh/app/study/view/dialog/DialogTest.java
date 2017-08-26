package cn.xh.app.study.view.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import cn.xh.app.R;
import cn.xh.app.common.ToastHelper;

/**
 * Created by xiaohe
 * 17-08-21 021
 *
 * 各类对话框的实现的过程无太大差异，以下为主要方法：
 * 1.setTitle()-----------------设置标题
 * 2.setIcon()------------------设置标题图片
 * 3.setMsg()-------------------设置提示信息
 * 4.setPositiveButton()--------设置按钮
 * 5.setNeutralButton()---------设置按钮
 * 6.setSingleChoiceItems()-----设置单项选择框
 * 7.setMultiChoiceItems()------设置多项选择框
 */
public class DialogTest extends Activity{

    private String[] items = new String[]{"选项1", "选择2","选择3","选择4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_dialog);
    }

    public void confirmDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("标题");
        builder.setIcon(R.drawable.img);//设置标题图片
        builder.setMessage("提示信息");
        //setPositiveButton方法setNeutralButton方法，分别是确认对话框的两个按钮
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ToastHelper.showDefaultToast(DialogTest.this,"点击了确定");
            }
        });
        builder.setNeutralButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ToastHelper.showDefaultToast(DialogTest.this,"点击了取消");
            }
        });
        builder.show();
    }

    public void radioDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        /**
         * 该方法设置单项选择框，参数说明：
         * 1.待选择项，数组
         * 2.已选中多少个，一般填0即可
         * 3.点击事件
         */
        builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            /**
             * 弹出层的点击事件
             * @param dialog
             * @param which 该值时当前点击的待选择项数组的下标
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ToastHelper.showDefaultToast(DialogTest.this,items[which]);
            }
        });
        builder.setTitle("单项选择");
        builder.show();
    }

    /**
     * 多项选择对话框
     * 使用方式和单项选择差不多，将setSingleChoiceItems改成setMultiChoiceItems即可
     * @param view
     */
    public void checkBoxDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        /**
         * 参数1.选项数组
         * 参数2.选项是否被选中，和参数1对应，传null表示所有选项都不选中
         * 参数3.点击事件
         */
        builder.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            /**
             * 点击事件实现
             * @param dialog
             * @param which 点击了选项中的哪一个，该值为选项的下标
             * @param isChecked 为true时表示选中状态，为false时为未选中
             */
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                String str = isChecked ? "选中了"+items[which] : "取消了" + items[which];
                ToastHelper.showDefaultToast(DialogTest.this,str);
            }
        });

        builder.setTitle("多项选择");
        builder.show();
    }

    /**
     * 列表对话框，主要用于显示一些信息集合
     * 使用setItems方法，将数组传进去即可
     * @param view
     */
    public void listDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ToastHelper.showDefaultToast(DialogTest.this,items[which]);
            }
        });
        builder.setTitle("多项选择");
        builder.show();
    }

    /**
     * 自定义对话框，和其它对话框一样使用，主要是setView()方法，给对话框设置自定义的布局和内容
     * @param view
     */
    public void diyDialog(View view) {
        //1.创建dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //2.获取布局
        LayoutInflater layoutInflater = LayoutInflater.from(DialogTest.this);
        View layout = layoutInflater.inflate(R.layout.stu_toast_layout,null);
        //3.设置自定义布局
        builder.setView(layout);
        builder.setTitle("自定义对话框");
        builder.show();
    }
}
