package com.xiaohe66.apk.demo.study.data.contentProvider;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-26 026
 *
 * 数据读取
 * ContentResolver类所有的方法的参数都与ContentProvider类对应
 *
 * 本类以读取本地联系人为例，作一个数据读取的示范
 */
public class ContentResolverTest extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_empty_layout);
        //获取contentResolver对象
        ContentResolver contentResolver = getContentResolver();

        //联系人uri
        Uri uri = Contacts.CONTENT_URI;
        //联系人id，和联系人名称
        String[] projection = new String[]{Contacts._ID,Contacts.DISPLAY_NAME};

        //查询，该方法的参数说明可以查看同包下的ContentProviderTest.java中的query方法的注释
        Cursor cursor = contentResolver.query(uri,projection,null,null,null);
        //数据遍历
        if(cursor != null){
            while(cursor.moveToNext()){
                int id = cursor.getInt(cursor.getColumnIndex(Contacts._ID));
                String name = cursor.getString(cursor.getColumnIndex(Contacts.DISPLAY_NAME));

                L.d(id+":"+name);
                //查出联系人的id，才能通过id查询联系人的电话号码和其它相关信息
                Cursor cursor1 = contentResolver.query(Phone.CONTENT_URI,new String[]{Phone.NUMBER,Phone.TYPE},Phone._ID+"="+id,null,null);
                if(cursor1 != null){
                    while(cursor1.moveToNext()){
                        int type = cursor1.getInt(cursor1.getColumnIndex(Phone.TYPE));
                        String phoneNumber = cursor1.getString(cursor1.getColumnIndex(Phone.NUMBER));

                        if(type == Phone.TYPE_HOME){
                            L.d("家庭电话:"+phoneNumber);
                        }else{
                            L.d("手机号:"+phoneNumber);
                        }
                    }
                    cursor1.close();
                }
            }
            cursor.close();
        }
    }
}
