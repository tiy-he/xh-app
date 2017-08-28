package cn.xh.app.study.data.contentProvider;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.CommonDataKinds.StructuredName;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.RawContacts;

import cn.xh.app.R;

/**
 * Created by xiaohe
 * 17-08-26 026
 *
 * contentResolver的insert操作
 *
 * 本例以插入联系人为例进行示范
 */
public class InsertTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_empty_layout);

        //获取contentResolver对象
        ContentResolver contentResolver = getContentResolver();
        //创建ContentValues实例
        ContentValues values = new ContentValues();
        //获取insert的uri
        Uri uri = contentResolver.insert(RawContacts.CONTENT_URI,values);
        //得到唯一标识
        Long rawContactId = ContentUris.parseId(uri);


        //插入人名
        values.clear();
        values.put(StructuredName.RAW_CONTACT_ID,rawContactId);
        values.put(StructuredName.DISPLAY_NAME,"何少");
        values.put(StructuredName.MIMETYPE,StructuredName.CONTENT_ITEM_TYPE);
        uri = contentResolver.insert(Data.CONTENT_URI,values);

        //插入电话号码
        values.clear();
        values.put(Phone.RAW_CONTACT_ID,rawContactId);
        values.put(Phone.NUMBER,"15112341234");
        values.put(Phone.MIMETYPE,Phone.CONTENT_ITEM_TYPE);
        uri = contentResolver.insert(Data.CONTENT_URI,values);

    }
}
