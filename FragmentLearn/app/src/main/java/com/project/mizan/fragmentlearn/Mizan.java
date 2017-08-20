package com.project.mizan.fragmentlearn;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Mizan extends android.app.Fragment {

    EditText n1,n2;
    Button plus;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mizan, container, false);

        n1 =(EditText)view.findViewById(R.id.ID_number1);
        n2 = (EditText)view.findViewById(R.id.ID_number2);
        plus = (Button)view.findViewById(R.id.ID_plus);
        result =(TextView)view.findViewById(R.id.ID_answare1);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nm1,nm2,ans=0;
                 nm1= Integer.getInteger(n1.getText().toString());
                nm2= Integer.getInteger(n2.getText().toString());
                ans=nm1+nm2;
                result.setText(ans);
                Toast.makeText(getActivity(),"Click on Mizan Drigment",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
