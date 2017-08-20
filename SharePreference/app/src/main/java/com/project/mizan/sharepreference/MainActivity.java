package com.project.mizan.sharepreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner deptList;
    ArrayAdapter<CharSequence> deptListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deptList = (Spinner) findViewById(R.id.ID_dept_name_select);


        deptListAdapter = ArrayAdapter.createFromResource(this,R.array.dept_list,android.R.layout.simple_spinner_item);
        deptListAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        deptList.setAdapter(deptListAdapter);

        deptList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" Selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
