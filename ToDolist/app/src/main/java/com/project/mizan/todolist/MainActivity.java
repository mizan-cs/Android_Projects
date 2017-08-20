package com.project.mizan.todolist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id,name,email;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final SQlight_bd myDatabase = new SQlight_bd(this);


        id = (EditText)findViewById(R.id.ID_IDName);
        name = (EditText)findViewById(R.id.ID_UserName);
        email = (EditText)findViewById(R.id.ID_UserEmail);
        save = (Button)findViewById(R.id.ID_SaveButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean cheaker = myDatabase.addToTable(id.getText().toString(),name.getText().toString(),email.getText().toString());
                if(cheaker == true){
                    Toast.makeText(MainActivity.this,"Successfully Saved",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"This Id is alrady used",Toast.LENGTH_LONG).show();
                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
