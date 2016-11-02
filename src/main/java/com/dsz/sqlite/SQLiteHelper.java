package com.dsz.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/11/2.
 */

public class SQLiteHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "mytable";
    public static String TABLE_NAME = "person";
    public static String name = "name";
    public static String flag = "flag";

    private String SQL = "CREATE TABLE "+TABLE_NAME+" ("+ name + " VARCHAR(10), "+flag+" BOOLEAN);";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
