package com.dsz.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import static com.dsz.sqlite.SQLiteHelper.TABLE_NAME;
import static com.dsz.sqlite.SQLiteHelper.flag;
import static com.dsz.sqlite.SQLiteHelper.name;

/**
 * Created by Administrator on 2016/11/2.
 */

public class PersonDB {

    private Context context;
    public PersonDB(Context context){
        this.context = context;
    }
    public void addPerson(Person person){
        SQLiteHelper sqLiteHelper = new SQLiteHelper(context);
        SQLiteDatabase db = sqLiteHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(name,person.getName());
        values.put(flag,person.isFalg());
        db.insert(TABLE_NAME,null,values);
        db.close();
    }


    public Person getPerson(String names){
        SQLiteHelper sqLiteHelper = new SQLiteHelper(context);
        SQLiteDatabase db = sqLiteHelper.getWritableDatabase();
        Cursor cursor = db.query(TABLE_NAME,
                new String[]{name,flag},
                "name = ?",
                new String[]{names},
                null,
                null,
                null,
                null);
        Person person = null;
        if(cursor.moveToFirst()){
            boolean fal = cursor.getInt(1)>0;
            person = new Person(cursor.getString(0),fal);
        }
        return person;
    }
}
