package com.project.mizan.mygpi;


import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherList extends Fragment {
    ListView list;
    TeacherListViewAdapter adapter;
    EditText editSearch;

    String[] teacherName;
    String[] teacherJob;

    ArrayList<CollegeTeacher> arrayList = new ArrayList<CollegeTeacher>();

    public TeacherList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teacher_list, container, false);

        //Here Final Code to Show Teacher List with Search
        // Generate sample data
        teacherName = new String[]{"Md. Mohiuddin","Palash Biswas","Binoy Jyoti Chakma","Md. Mainul Islam","Zakir Hossain","Mokter Hossan","Md.Rafiqul Islam",
                "Tapan Mallik","Nasrin Akter Soma","Nasir","Md. Enamul Howlader","Md. Mainul Haque","Pallab Roy Chowdhury","S.M Jahangir Alam",
                "Swapan Krishna Halder","Md. Shahjalal","Nasema Khanom","Mst. Mehbub -A- Zannat",
                "Mohammad Iqbal Hossain Bhuiyan","Md. Mehedi Hasan","Md Atiqur Rahman","Zakia Sultana","Md. Motahar Hossen","Md. Abdus Salam","Babul Mallik","Md. Sayedul Islam",
                "Mashiur Rahman","SK  Shadhat Hussain","Smita Mistry","Md. Zahirul Islam","Mohammad Salah Uddin","Md. Faruk Hossen","Joyonti Sikder"};

        teacherJob = new String[]{"Junior Instructor(CmT)","Junior Instructor(CmT)","Instructor (CmT)","Junior Instructor(CmT)","Instructor(CmT)","Craft Instructor(CmT)","Craft Instructor(CmT)",
                "Instructor (EnT)","Junior Instructor (EnT)","Junior Instructor (EnT)","Junior Instructor (EnT)","Instructor (EnT)","CraftInstructor(EnT)","Craft Instructor(EnT)",
                "Instructor(FT) & Head of department","Instructor(FT)","Junior Instructor(FT)","Craft Instructor(FT)",
                "Instructor(RAT)","Instructor(RAT)","Junior Instructor(RAT)","Junior Instructor(RAT)","Junior Instructor(RAT)","Instructor(RAT)","Carft Instructor(RAT)","Carft Instructor(RAT)",
                "Junior Instructor(Non-Tech)Bangla","Physical Education Instructor","Instructor(Non-Tech) Mathematics","Instructor(Non-Tech) Chemistry","Junior Instructor(Non-Tech) English","Junior Instructor(Non-Tech)Mathematics","Lab Assistant(Non-Tech)"};

        list = (ListView)view.findViewById(R.id.ID_AllDeptTeacherListView);

        for(int i=0; i<teacherName.length;i++){
            CollegeTeacher ct = new CollegeTeacher(teacherName[i],teacherJob[i]);
            arrayList.add(ct);
        }
        // Pass results to TeacherListViewAdapter Class
        adapter = new TeacherListViewAdapter(getActivity(),arrayList);

//         Binds the Adapter to the ListView
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String teacherName = arrayList.get(position).getTeacherName();

                //if CmT teacher name click
                if (teacherName.equals("Md. Mohiuddin")){
                    //Toast.makeText(getActivity(),"Clicked on "+teacherName,Toast.LENGTH_LONG).show();
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.mohiuddin_sir);
                    goTeacherView.putExtra("teacher-education","BSc in Computer Science and Engineering & (T.E.),IUT,OIC");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Computer Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","01921-109194");
                    goTeacherView.putExtra("teacher-email","Email : m.mamun118@yahoo.com\nm.mohiuddin118@gmail.com");
                    startActivity(goTeacherView);
                }
                if(teacherName.equals("Palash Biswas")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.palash_biswas_sir);
                    goTeacherView.putExtra("teacher-education","Diploma in Computer Science and Engineering");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Computer Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1925062485");
                    goTeacherView.putExtra("teacher-email","Email : palashbiswas123@yahoo.com");
                    startActivity(goTeacherView);
                }
                if(teacherName.equals("Binoy Jyoti Chakma")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.binoy_jyoti_chakma_sir);
                    goTeacherView.putExtra("teacher-education","BSc in Computer Science and Engineering");
                    goTeacherView.putExtra("teacher-designation","Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Computer Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","01912-063481");
                    goTeacherView.putExtra("teacher-email","Email : binoy.jyoti123@gmail.com");
                    startActivity(goTeacherView);
                }
                if(teacherName.equals("Md. Mainul Islam")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.mainul_islam_sir);
                    goTeacherView.putExtra("teacher-education","BSc in Computer Science and Engineering");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Computer Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","01923-587445");
                    goTeacherView.putExtra("teacher-email","Email : mainulislammunna1991@gmail.com");
                    startActivity(goTeacherView);
                }
                if(teacherName.equals("Zakir Hossain")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.zakir_hossain_sir);
                    goTeacherView.putExtra("teacher-education","B.Sc in Information & Communication Engineering");
                    goTeacherView.putExtra("teacher-designation","Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Computer Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1724432471");
                    goTeacherView.putExtra("teacher-email","Email : zakir.ict.iu@gmail.com");
                    startActivity(goTeacherView);
                }
                /*if(teacherName.equals("Mokter Hossan")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }if(teacherName.equals("Md.Rafiqul Islam")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }*/

                //if EnT teacher Name Click
                if(teacherName.equals("Tapan Mallik")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.tapan_mallik_sir);
                    goTeacherView.putExtra("teacher-education","BSc Engg. (EEE),DUET");
                    goTeacherView.putExtra("teacher-designation","Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Electronics Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1724455455");
                    goTeacherView.putExtra("teacher-email","Email : tapanmallik06@yahoo.com");
                    startActivity(goTeacherView);
                }
               /* if(teacherName.equals("Nasrin Akter Soma")){
                    Toast.makeText(getActivity(),teacherName+" Information not found",Toast.LENGTH_SHORT).show();
                }*/
                if(teacherName.equals("Nasir")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.nasir_sir);
                    goTeacherView.putExtra("teacher-education","BSc in Engineering(EEE)");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Electronics Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1951 617948");
                    goTeacherView.putExtra("teacher-email","Email : nasirhossain930@gmail.com");
                    startActivity(goTeacherView);
                }
                if(teacherName.equals("Md. Enamul Howlader")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.enamul_howlader_sir);
                    goTeacherView.putExtra("teacher-education"," ");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Electronics Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1982 638350");
                    goTeacherView.putExtra("teacher-email","Email : enamul.tsc@gmail.com");
                    startActivity(goTeacherView);
                }
                if(teacherName.equals("Md. Mainul Haque")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.mainul_haque_sir);
                    goTeacherView.putExtra("teacher-education","BS.c in ETE(RUET)");
                    goTeacherView.putExtra("teacher-designation","Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Electronics Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1738 978083");
                    goTeacherView.putExtra("teacher-email","Email : mainulruet@yahoo.com");
                    startActivity(goTeacherView);
                }
                /*if(teacherName.equals("Pallab Roy Chowdhury")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }
                if(teacherName.equals("S.M Jahangir Alam")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }*/

                //if Food teacher name click
                if(teacherName.equals("Swapan Krishna Halder")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.swapan_krishna_halder_sir);
                    goTeacherView.putExtra("teacher-education","MSc in Food Engineering and Technology");
                    goTeacherView.putExtra("teacher-designation","Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Food Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1716 643806");
                    goTeacherView.putExtra("teacher-email","Email : swapan.krishna75@gmail.com");
                    startActivity(goTeacherView);
                }
                /*if(teacherName.equals("Md. Shahjalal")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }*/
                if(teacherName.equals("Nasema Khanom")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.nasema_khanom_mam);
                    goTeacherView.putExtra("teacher-education"," ");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Food Technology\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1758 108687");
                    goTeacherView.putExtra("teacher-email","nasima9811@gmail.com");
                    startActivity(goTeacherView);
                }
                /*if(teacherName.equals("Mst. Mehbub -A- Zannat")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }*/

                // if Non-Tech Teacher name click
                if(teacherName.equals("Mashiur Rahman")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.mashiur_rahman_sir);
                    goTeacherView.putExtra("teacher-education","BA(Hons),MA(Bangla)DU B.Ed(First class)");
                    goTeacherView.putExtra("teacher-designation","Junior Instructor(Non-Tech)Bangla");
                    goTeacherView.putExtra("teacher-job","Gopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","01915-878406");
                    goTeacherView.putExtra("teacher-email","Email : mashiurrahmansohel@gmail.com");
                }
                if(teacherName.equals("SK  Shadhat Hussain")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.shadhat_hussain_sir);
                    goTeacherView.putExtra("teacher-education","");
                    goTeacherView.putExtra("teacher-designation","Physical Education Instructor(Non-Tech)");
                    goTeacherView.putExtra("teacher-job","Non-Tech\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","880 1720 568850");
                    goTeacherView.putExtra("teacher-email","Email : shadat.gpi@gmail.com");
                }
                if(teacherName.equals("Smita Mistry")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.smita_mistry_mam);
                    goTeacherView.putExtra("teacher-education","BSc in Mathematics(KU) MSc in Applied Mathematics");
                    goTeacherView.putExtra("teacher-designation","Instructor(Non-Tech) Mathematics");
                    goTeacherView.putExtra("teacher-job","Department of Mathematics\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1727 296139");
                    goTeacherView.putExtra("teacher-email","Email : smitamath05@gmail.com");
                }
                if(teacherName.equals("Md. Zahirul Islam")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.zahirul_islam_sir);
                    goTeacherView.putExtra("teacher-education","BSc(chemistry),MSc(chemistry)");
                    goTeacherView.putExtra("teacher-designation","Instructor(Non-Tech)");
                    goTeacherView.putExtra("teacher-job","Department of Physics & chemistry\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1723 731355");
                    goTeacherView.putExtra("teacher-email","Email : zahirul_01@yahoo.com");
                }
                if(teacherName.equals("Mohammad Salah Uddin")){
                    Intent goTeacherView = new Intent(getActivity(),TeacherView.class);
                    goTeacherView.putExtra("teacher-name",teacherName);
                    goTeacherView.putExtra("teacher-image",R.drawable.mohammad_salah_uddin_sir);
                    goTeacherView.putExtra("teacher-education","BA(Hons),MA(English)BEd(First Class)");
                    goTeacherView.putExtra("teacher-designation",":  Junior Instructor(Non-Tech)English");
                    goTeacherView.putExtra("teacher-job","Department of English\nGopalgonj polytechnic Institute");
                    goTeacherView.putExtra("teacher-mobile","+880 1920 959293");
                    goTeacherView.putExtra("teacher-email","Email : salahu700@gmail.com");
                }
                /*if(teacherName.equals("Md. Faruk Hossen")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }
                if(teacherName.equals("Joyonti Sikder")){
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getActivity(),teacherName+" information not found",Toast.LENGTH_SHORT).show();
                }*/


            }
        });

        editSearch = (EditText)view.findViewById(R.id.ID_TeacherNameSearch);

        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String text = editSearch.getText().toString().toLowerCase(Locale.getDefault());
                adapter.filter(text);

            }
        });

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getActivity(),"hello ",Toast.LENGTH_SHORT).show();
//            }
//        });



        return view;
    }



}
