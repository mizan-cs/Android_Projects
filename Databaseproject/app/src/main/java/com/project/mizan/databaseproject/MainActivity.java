package com.project.mizan.databaseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button save;

    mySQLite my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.userID);
        e2 = (EditText)findViewById(R.id.userFirstname);
        e3 = (EditText)findViewById(R.id.userSecondName);
        e4 = (EditText)findViewById(R.id.userEmail);
        save = (Button)findViewById(R.id.SaveButton);

        my = new mySQLite(this);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean cheak = my.addToTable(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString());
                if(cheak == true){
                    Toast.makeText(MainActivity.this,"Save",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();
                }

            }


        });


    }
}
