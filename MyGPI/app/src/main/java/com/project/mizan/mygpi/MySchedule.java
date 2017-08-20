package com.project.mizan.mygpi;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MySchedule extends Fragment {

    Button newButton, editButton, deletebutton;
    ListView sciduleList;
    ArrayList<String> arrayList = new ArrayList<String>();

    public MySchedule() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_schedule, container, false);

        newButton = (Button) view.findViewById(R.id.ID_ScheduleAddButton);
        sciduleList = (ListView) view.findViewById(R.id.ID_ScheduleListView);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent setSchedule = new Intent(getActivity(), GetScheduleDataFromUser.class);
                startActivity(setSchedule);
            }
        });

        return view;

    }

}
