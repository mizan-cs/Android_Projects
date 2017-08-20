package com.project.mizan.birthdaylist;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fName,fBirtday;
    Button saveButton,showButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fName = (EditText) findViewById(R.id.ID_Friend_Name);
        fBirtday = (EditText) findViewById(R.id.ID_Finend_Birthday);
        saveButton = (Button)findViewById(R.id.ID_Save_Button);
        showButton = (Button)findViewById(R.id.ID_Show_Button);

        final DataBase myDB = new DataBase(getApplicationContext());

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = fName.getText().toString();
                String bDay = fBirtday.getText().toString();

                DataFunction df = new DataFunction(name,bDay);

                myDB.addingDataToTable(df);
                Toast.makeText(getApplicationContext(),"Data Added Successfully!",Toast.LENGTH_LONG).show();
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),bDayofFrnds.class));
            }
        });

    }
}
