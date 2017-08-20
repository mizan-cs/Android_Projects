package com.project.mizan.todolist;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mizan on 8/30/2016.
 */
public class SQlight_bd extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "myDatabase.db";
    private static final String TABLE_NAME = "userInfo";
    private static final String COL1 = "id";
    private static final String COL2 = "name";
    private static final String COL3 = "email";


    public SQlight_bd(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query;
        query = "CREATE TABLE "+TABLE_NAME+"(" +COL1+ " INTEGER PRIMARY KEY, "+COL2+" TEXT, "+COL3+" TEXT "+ ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME);
        onCreate(db);

    }

    public boolean addToTable(String id,String name, String email){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1,id);
        contentValues.put(COL2,name);
        contentValues.put(COL3,email);
        long cheaker = sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        if (cheaker == -1){
            return false;
        }else {
            return true;
        }

    }
}
