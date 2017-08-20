package com.project.mizan.databaseproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mizan on 8/30/2016.
 */
public class mySQLite extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "myDetabase.db";
    private static final String TABLE_NAME = "myTable";
    private static final String COLUMN1 = "ID";
    private static final String COLUMN2 = "FIRSTNAME";
    private static final String COLUMN3 = "LASTNAME";
    private static final String COLUMN4 = "EMAIL";


    public mySQLite(Context context) {
        super(context, DATABASE_NAME, null, 5);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USER_TABLE= "CREATE TABLE " + TABLE_NAME + "("
                + COLUMN1 + " INTEGER PRIMARY KEY," + COLUMN2 + " TEXT," + COLUMN3 + "TEXT,"
                + COLUMN4 + " TEXT" + ");";
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME);
        onCreate(db);
    }

    public boolean addToTable(String id,String fName, String lName, String eMail){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN1,id);
        contentValues.put(COLUMN2,fName);
        contentValues.put(COLUMN3,lName);
        contentValues.put(COLUMN4,eMail);

       long cheak = sqLiteDatabase.insert(TABLE_NAME,null,contentValues);

        if(cheak == -1){
            return false;
        }else{
            return true;
        }
    }
}
