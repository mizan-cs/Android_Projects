package com.mizan.gpi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Developer extends AppCompatActivity {

    TextView dText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
         dText =(TextView)findViewById(R.id.ID_DeveloperName);

        dText.setText("Mizanur Rahmna");
        dText.setAnimation(AnimationUtils.loadAnimation(Developer.this,android.R.anim.slide_in_left));
    }
}
