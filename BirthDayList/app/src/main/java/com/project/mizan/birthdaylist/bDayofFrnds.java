package com.project.mizan.birthdaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class bDayofFrnds extends AppCompatActivity {
    TextView showData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_dayof_frnds);

        showData = (TextView)findViewById(R.id.ID_BirthdayShow);

        DataBase db = new DataBase(getApplicationContext());

        String[] data = db.myData();
        Toast.makeText(getApplicationContext(),"Found "+data.length,Toast.LENGTH_LONG).show();

    }
}


