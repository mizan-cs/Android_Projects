package com.project.mizan.mygpi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutGPI extends Fragment {

    TextView aboutGPI,aboutCmTText,aboutEnTText,aboutRATText,aboutFTText;

    public AboutGPI() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_gpi, container, false);
//        aboutGPI = (TextView)view.findViewById(R.id.ID_AboutGPI_Text);
//        aboutGPI.setText("");
//
//        aboutCmTText =(TextView)view.findViewById(R.id.ID_AboutCmTText);
//        aboutCmTText.setText("");
//
//        aboutEnTText = (TextView)view.findViewById(R.id.ID_AboutEnTText);
//        aboutEnTText.setText("What is Electronics Engineering technology? Diploma in Electronics Engineering fully details information you can know this site. go to this link and know Electronics Engineering information.");
//
//        aboutRATText = (TextView)view.findViewById(R.id.ID_AboutRATText);
//        aboutRATText.setText("Refrigeration and air condition technology is a new and effective technology. but it is a very effective engineering technology for every world . you can know about more refrigeration and air condition technology information here. Now a days It’s Important More and Most");
//
//        aboutFTText = (TextView)view.findViewById(R.id.ID_AboutFTText);
//        aboutFTText.setText("Food Engineering technology is the best effective engineering on the world. you can also know about Food Diploma in Engineering information here. Without food preserve it will be west.");


        return view;
    }

}
