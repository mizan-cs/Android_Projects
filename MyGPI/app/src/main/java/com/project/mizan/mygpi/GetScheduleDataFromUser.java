package com.project.mizan.mygpi;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.FragmentTransaction;
import android.widget.Toast;

public class GetScheduleDataFromUser extends AppCompatActivity {
    EditText scTitle,scDriscription,scSelectDate;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_schedule_data_from_user);
        scTitle = (EditText)findViewById(R.id.ID_ScheduleEditTitle);
        scDriscription = (EditText)findViewById(R.id.ID_ScheduleEditDriscrption);
        save = (Button)findViewById(R.id.ID_ScheduleSave);
        scSelectDate = (EditText)findViewById(R.id.ID_ScheduleEditTime);


    }

    public void onStart(){
        super.onStart();
        scSelectDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    DateDialog dialog = new DateDialog(v);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    dialog.show(ft,"DatePicker");

                }
            }
        });
    }
}
