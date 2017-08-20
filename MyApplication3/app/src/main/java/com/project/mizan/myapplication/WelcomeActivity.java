package com.project.mizan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView welcomeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcomeText = (TextView) findViewById(R.id.ID_WelcomeText);
        welcomeText.setText("Welcome\n"+getIntent().getStringExtra("USER_NAME"));
    }
}
