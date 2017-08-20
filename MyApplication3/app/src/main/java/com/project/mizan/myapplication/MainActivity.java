package com.project.mizan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button okButton;
    EditText userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okButton = (Button) findViewById(R.id.ID_OkButton);
        userName = (EditText) findViewById(R.id.ID_UserName);


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                intent.putExtra("USER_NAME",userName.getText().toString());
                startActivity(intent);
            }
        });
    }
}
