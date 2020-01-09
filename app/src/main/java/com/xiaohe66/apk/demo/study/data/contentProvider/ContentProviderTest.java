package com.xiaohe66.apk.demo.study.data.contentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.Nullable;

/**
 * Created by xiaohe
 * 17-08-26 026
 *
 * 组件，数据提供者
 *
 * 使用该组件，需要在androidManifest.xml中注册：
 *             <provider
                     android:authorities="cn.xh.app.study.data.contentProvider.ContentProviderTest"
                     android:name=".study.data.contentProvider.ContentProviderTest">
                </provider>
 * </p>
 */
public class ContentProviderTest extends ContentProvider{

    /**
     * 创建ContentProvider后调用
     * @return
     */
    @Override
    public boolean onCreate() {
        return false;
    }

    /**
     * 查询
     * @param uri           统一资源定位符
     * @param projection    查询指定列，string数组，传入null表示默认
     * @param selection     查询语句
     * @param selectionArgs 查询参数，和selection中的？对应
     * @param sortOrder     排序，传入null表示默认
     * @return
     */
    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    /**
     * 返回当前uri的mime类型
     *
     * 若该uri对应的数据可以包括多条记录，那么mime类型字符串就是以vnd.android.dir开头
     * 反之，则该mime类型字符串就是以vnd.android.cursor.item开头
     * @param uri
     * @return
     */
    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    /**
     * 根据uri删除selection对应的数据
     * @param uri
     * @param selection
     * @param selectionArgs
     * @return
     */
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    /**
     * 根据uri修改selection指定的数据
     * @param uri
     * @param values
     * @param selection
     * @param selectionArgs
     * @return
     */
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
