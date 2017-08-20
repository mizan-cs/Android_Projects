package com.project.mizan.mygpi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllClassRutine extends Fragment {
    Button tapButton;

    public AllClassRutine() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view =  inflater.inflate(R.layout.fragment_all_class_rutine, container, false);

        tapButton = (Button) view.findViewById(R.id.ID_tap_here_button);

        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent userInfo = new Intent(getContext(),GetUserInformation.class);
                startActivity(userInfo);
            }
        });

        return view;
    }

}
