package com.project.mizan.birthdaylist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import static java.security.AccessController.getContext;

/**
 * Created by Mizan on 2/18/2017.
 */

public class DataBase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mydb";
    private static final String TABLE_NAME = "mytab";

    private static final String TAB_ID = "id";
    private static final String TAB_NAME = "name";
    private static final String TAB_DAYS = "days";

    public DataBase(Context c){
        super(c,DATABASE_NAME,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String s = "CREATE TABLE "+TABLE_NAME+" ( "+TAB_ID+" INTEGER PRIMARY KEY, "+TAB_NAME+" TEXT, "+TAB_DAYS+" TEXT)";
        db.execSQL(s);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //--------Adding Data to Database-----------
    void addingDataToTable(DataFunction dt){
        SQLiteDatabase sqd = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_NAME,dt.getName());
        cv.put(TAB_DAYS,dt.getDays());

        sqd.insert(TAB_NAME,null,cv);
        sqd.close();

    }

    //--------Showing Data-------------
    String[] myData(){
        SQLiteDatabase sqd = this.getReadableDatabase();

        String q = "SELECT * FROM "+TABLE_NAME;

        Cursor c = sqd.rawQuery(q,null);

        String[] recivedData = new String[c.getCount()];

        if(c.moveToFirst()){
            int counter = 0;
            do{
                recivedData[counter] = c.getString(c.getColumnIndex(TAB_NAME+""));
                counter++;
            }while(c.moveToNext());
        }
        return recivedData;
    }

}
