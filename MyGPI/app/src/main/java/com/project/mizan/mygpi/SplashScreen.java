package com.project.mizan.mygpi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences sharedPreferences;
        sharedPreferences = getSharedPreferences("ShaPreferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        boolean  firstTime=sharedPreferences.getBoolean("first", true);
        if(firstTime) {
            editor.putBoolean("first",false);
            //For commit the changes, Use either editor.commit(); or  editor.apply();.
            editor.commit();
            Intent intent = new Intent(SplashScreen.this, GetUserInformation.class);
            startActivity(intent);
        } else {
            TextView stext = (TextView) findViewById(R.id.splash_text);
            stext.setText("Hello\nGPI");
            Toast.makeText(SplashScreen.this,"Loading...",Toast.LENGTH_SHORT).show();
            stext.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left));

            Thread sthread = new Thread() {
                @Override
                public void run() {
                    super.run();
                    try {
                        sleep(1500);
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };

            sthread.start();
        }
    }
}
