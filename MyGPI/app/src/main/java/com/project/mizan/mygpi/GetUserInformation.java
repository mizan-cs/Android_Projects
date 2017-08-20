package com.project.mizan.mygpi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class GetUserInformation extends AppCompatActivity {

    ArrayAdapter<CharSequence> deptAdapter;
    ArrayAdapter<CharSequence> semesterAdapter;
    ArrayAdapter<CharSequence> shiftAdapter;
    //------------------------------------
    String name;
    String dept;
    String semester;
    String shift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_user_information);

        final Spinner userDept = (Spinner)findViewById(R.id.ID_UserDept);
        Spinner userSemester = (Spinner)findViewById(R.id.ID_UserSamester);
        Spinner userShift = (Spinner)findViewById(R.id.ID_UserShift);


        SharedPreferences userInformation = getSharedPreferences("UserInformation", Context.MODE_PRIVATE);
        final SharedPreferences.Editor userEditor = userInformation.edit();

            //-------Get User Name Input
            EditText userName = (EditText) findViewById(R.id.ID_UserNameText);
            name = userName.getText().toString();
            //--------------------------------------------------------------------------

            //--------------Get User Department from Spinner------------

            deptAdapter = ArrayAdapter.createFromResource(this, R.array.user_dept_list, android.R.layout.simple_spinner_item);
            deptAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            userDept.setAdapter(deptAdapter);
            userDept.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    //Toast.makeText(GetUserInformation.this,position+"is selected",Toast.LENGTH_SHORT).show();

                    switch (position) {
                        case 0:
                            dept = "CmT";
                            break;
                        case 1:
                            dept = "EnT";
                            break;
                        case 2:
                            dept = "FT";
                            break;
                        case 3:
                            dept = "ET";
                            break;
                        case 4:
                            dept = "RAT";
                            break;
                        default:
                            dept = "no dept";
                            break;
                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
//---------------------------------------------------------------------------------------------------

            //----------------------Get user Semester Input from Spinner

            semesterAdapter = ArrayAdapter.createFromResource(this, R.array.user_samerster_name, android.R.layout.simple_spinner_item);
            semesterAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            userSemester.setAdapter(semesterAdapter);
            userSemester.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    //  Toast.makeText(GetUserInformation.this,parent.getItemAtPosition(position)+" is Select",Toast.LENGTH_SHORT).show();
                    switch (position) {
                        case 0:
                            semester = "1st-Semester";
                            break;
                        case 1:
                            semester = "3rd-Semester";
                            break;
                        case 2:
                            semester = "5th-Semester";
                            break;
                        case 3:
                            semester = "6th-Semester";
                            break;
                        default:
                            semester = "No Semester";
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            //------------------------------------------------------------------------------------------------

            //----------------get User Shift------------------------------------------------------------------

            shiftAdapter = ArrayAdapter.createFromResource(this, R.array.user_shift_name, android.R.layout.simple_spinner_item);
            shiftAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            userShift.setAdapter(shiftAdapter);
            userShift.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // Toast.makeText(GetUserInformation.this,parent.getItemAtPosition(position)+" is Selected",Toast.LENGTH_SHORT).show();
                    switch (position) {
                        case 0:
                            shift = "1st-Shift";
                            break;
                        case 1:
                            shift = "2nd-Shift";
                            break;
                        default:
                            shift = "No Shift";
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            //---------------------------------------------------------------------------------------------------------

            //------------------Save user Data-------------------------------------------------------
            Button userSubmit = (Button) findViewById(R.id.ID_UserSubmitButton);
            userSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    userEditor.putString("UserName", name);
                    userEditor.putString("UserDept", dept);
                    userEditor.putString("UserSemester", semester);
                    userEditor.putString("UserShift", shift);
                    userEditor.apply();
                    Intent goMain = new Intent(GetUserInformation.this,MainActivity.class);
                    startActivity(goMain);
                }
            });


//----------------Temp Buuton to Cheak this activity code--------------------
//            Button showInfo;
//            showInfo = (Button) findViewById(R.id.ID_ShowUserInfoButton);
//            showInfo.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    SharedPreferences userInformation = getSharedPreferences("UserInformation", Context.MODE_PRIVATE);
//                    String n = userInformation.getString("UserName", "");
//                    String d = userInformation.getString("UserDept", "");
//                    String sem = userInformation.getString("UserSemester", "");
//                    String shift = userInformation.getString("UserShift", "");
//
//                    Toast.makeText(GetUserInformation.this, "First Value " + n, Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GetUserInformation.this, "Second Value " + d, Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GetUserInformation.this, "Third Value " + sem, Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GetUserInformation.this, "Fourth Value " + shift, Toast.LENGTH_SHORT).show();
//                }
//            });

    }
}
