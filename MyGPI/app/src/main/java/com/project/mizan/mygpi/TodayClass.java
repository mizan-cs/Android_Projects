package com.project.mizan.mygpi;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mizan on 8/31/2016.
 */
public class TodayClass extends Fragment {
    TextView userDept,userSemester,userShift,today;
    ListView classList;

    public TodayClass() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_today_class, container, false);

        userDept = (TextView)view.findViewById(R.id.ID_UserDeptName);
        userSemester = (TextView)view.findViewById(R.id.ID_UserSemesterName);
        userShift = (TextView)view.findViewById(R.id.ID_UserShiftName);
        today = (TextView)view.findViewById(R.id.ID_TodayCalander);
        classList = (ListView)view.findViewById(R.id.ID_TodayClassList);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);

        SharedPreferences userInformation = this.getActivity().getSharedPreferences("UserInformation", Context.MODE_PRIVATE);
        String userDeptName = userInformation.getString("UserDept","");
        String userSemesterName = userInformation.getString("UserSemester","");
        String userShiftName = userInformation.getString("UserShift","");

//        Toast.makeText(getActivity(),userDeptName,Toast.LENGTH_LONG).show();
//        Toast.makeText(getActivity(),userSemesterName,Toast.LENGTH_LONG).show();
//        Toast.makeText(getActivity(),userShiftName,Toast.LENGTH_LONG).show();

        userDept.setText(userDeptName);
        userSemester.setText(userSemesterName);
        userShift.setText(userShiftName);
        today.setText(dayOfTheWeek);



        //----------------------CmT 1st semester, 1st Shift Start----------------------------------------------------------------

        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester1st_Shift1st_Saturday_Time = {"8.45-11.00(2h15m)","11.00-11.45(45m)","11.45-12.30(45m)","12.30-1.15(45m)"};
            String[] Computer_Semester1st_Shift1st_Saturday_Subject = {"Computer Applaction","Physics","English-1","Electrical Electronics Fundamantal"};
            String[] Computer_Semester1st_Shift1st_Saturday_Techer = {"Palash biswas","Principal Sir","MD.Salauddin","Nasir"};
            String[] Computer_Semester1st_Shift1st_Saturday_Room = {"Software Lab","R-301","R-301","R-301"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift1st_Saturday_Room,Computer_Semester1st_Shift1st_Saturday_Techer,Computer_Semester1st_Shift1st_Saturday_Subject,Computer_Semester1st_Shift1st_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester1st_Shift1st_sunday_Time = {"8.00-10.15(2h15m)","10.15-11.45(1h30m)"};
            String[] Computer_Semester1st_Shift1st_Sunday_Subject = {"Bangla","Math-1"};
            String[] Computer_Semester1st_Shift1st_Sunday_Techer = {"Mashiur Rahman","Smita mistry"};
            String[] Computer_Semester1st_Shift1st_Sunday_Room = {"R-301","R-301"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift1st_Sunday_Room,Computer_Semester1st_Shift1st_Sunday_Techer,Computer_Semester1st_Shift1st_Sunday_Subject,Computer_Semester1st_Shift1st_sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester1st_Shift1st_Monday_Time = {"8.45-9.30(45m)","9.30-10.15(45m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester1st_Shift1st_Monday_Subject = {"Bangla","Electrical Electronics Fundamantal","Physics","Computer Application"};
            String[] Computer_Semester1st_Shift1st_Monday_Techer = {"Mashiur Rahman","Nasir","Principal Sir","palash biswas"};
            String[] Computer_Semester1st_Shift1st_Monday_Room = {"R-301","R-301","R-301","Software Lab"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift1st_Monday_Room,Computer_Semester1st_Shift1st_Monday_Techer,Computer_Semester1st_Shift1st_Monday_Subject,Computer_Semester1st_Shift1st_Monday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester1st_Shift1st_Tuesday_Time ={"8.00-10-15(2h15m)","10.15-11.45(1h30m)","11.45-12.30(45m)"};
            String[] Computer_Semester1st_Shift1st_Tuesday_Subject ={"Electrical Electronics Fundamantal","Math-1","Bangla"};
            String[] Computer_Semester1st_Shift1st_Tuesday_Techer ={"Nasir","Smita Mistry","Mashiur Rahman"};
            String[] Computer_Semester1st_Shift1st_Tuesday_Room ={"Ent Lab","R-301","R-301"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift1st_Tuesday_Room,Computer_Semester1st_Shift1st_Tuesday_Techer,Computer_Semester1st_Shift1st_Tuesday_Subject,Computer_Semester1st_Shift1st_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester1st_Shift1st_Wednesday_Time = {"8.00-10.15(2h45m)","10.15-11.00(45m)","11.00-11.45(45m)","11.45-1.15(1h30m)"};
            String[] Computer_Semester1st_Shift1st_Wednesday_Subject = {"C-WP","Electical Electronics Fundamantal","Physics","Math-1"};
            String[] Computer_Semester1st_Shift1st_Wednesday_Techer = {"Mainul Islam","Nasir","Principal Sir","Smitha Mistry"};
            String[] Computer_Semester1st_Shift1st_Wednesday_Room = {"Softwere Lab-2","R-301","R-301","R-301"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift1st_Wednesday_Room,Computer_Semester1st_Shift1st_Wednesday_Techer,Computer_Semester1st_Shift1st_Wednesday_Subject,Computer_Semester1st_Shift1st_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester1st_Shift1st_Thursday_Time ={"8.00-8.45(45m)","8.45-11.00(2h15m)"};
            String[] Computer_Semester1st_Shift1st_Thursday_Subject ={"English-1","Physics"};
            String[] Computer_Semester1st_Shift1st_Thursday_Techer ={"MD.Salauddin","Principal Sir"};
            String[] Computer_Semester1st_Shift1st_Thursday_Room ={"R-301","Physics Lab"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift1st_Thursday_Room,Computer_Semester1st_Shift1st_Thursday_Techer,Computer_Semester1st_Shift1st_Thursday_Subject,Computer_Semester1st_Shift1st_Thursday_Time);
            classList.setAdapter(todayClass);
        }
        //-------------------------CmT 1st semester,1st Shift end---------------------------------

//----------------CmT 1st semester,2nd Shift Start----------------------------------
        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester1st_Shift12nd_Saturday_Time = {"2.15-4.30(2h15)","4.30-5.15(45m)","5.15-6.00(45m)","6.00-6.45(45)"};
            String[] Computer_Semester1st_Shift12nd_Saturday_Subject = {"Computer application","Physics-1","English-1","Electrical Electronics Fundamantal"};
            String[] Computer_Semester1st_Shift12nd_Saturday_Techer = {"Palash Biswas","Principal Sir","MD.Salauddin","Nasir"};
            String[] Computer_Semester1st_Shift12nd_Saturday_Room = {"Software Lab","R-301","R-301","R-301"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift12nd_Saturday_Room,Computer_Semester1st_Shift12nd_Saturday_Techer,Computer_Semester1st_Shift12nd_Saturday_Subject,Computer_Semester1st_Shift12nd_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester1st_Shift12nd_Sunday_Time = {"2.15-3.45(1h30m)","3.45-5.15(1h30m)"};
            String[] Computer_Semester1st_Shift12nd_Sunday_Subject = {"Bangla","Math-1"};
            String[] Computer_Semester1st_Shift12nd_Sunday_Techer = {"Mashiur Rahman","Smita Mistry"};
            String[] Computer_Semester1st_Shift12nd_Sunday_Room = {"R-301","R-301"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift12nd_Sunday_Room,Computer_Semester1st_Shift12nd_Sunday_Techer,Computer_Semester1st_Shift12nd_Sunday_Subject,Computer_Semester1st_Shift12nd_Sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester1st_Shift12nd_Mondayday_Time = {"2.15-3.00(45m)","3.00-3.45(45m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester1st_Shift12nd_Monday_Subject = {"Bangla","Electrical Electronics Fundamantal","Physics-1","Computer Application"};
            String[] Computer_Semester1st_Shift12nd_Monday_Techer = {"Mashiur Rahman","Nasir","Principal Sir","Palash Biswas"};
            String[] Computer_Semester1st_Shift12nd_Monday_Room = {"R-301","R-301","R-301","Software Lab"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift12nd_Monday_Room,Computer_Semester1st_Shift12nd_Monday_Techer,Computer_Semester1st_Shift12nd_Monday_Subject,Computer_Semester1st_Shift12nd_Mondayday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester1st_Shift12nd_Tuesday_Time = {"2.15-3.45(1h30m)","3.45-5.15(1h30m)","5.15-6.00(45m)"};
            String[] Computer_Semester2nd_Shift12nd_Tuesday_Subject = {"Electrical Electronics Fundamantal","math-1","Bangla"};
            String[] Computer_Semester2nd_Shift12nd_Tuesday_Techer = {"Nasir","Smita Mistry","Mashiur Rahman"};
            String[] Computer_Semester2nd_Shift12nd_Tuesday_Room = {"Ent Lab","R-301","R-301"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester2nd_Shift12nd_Tuesday_Room,Computer_Semester2nd_Shift12nd_Tuesday_Techer,Computer_Semester2nd_Shift12nd_Tuesday_Subject,Computer_Semester1st_Shift12nd_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester1st_Shift12nd_Wednesday_Time = {"2.15-3.45(1h30m)","3.45-4.30(45m)","4.30-5.15(45m)","5.15-6.45(1h30m)"};
            String[] Computer_Semester1st_Shift12nd_Wednesday_Subject = {"C-wp","Electrical Electronics Fundamantal","Physics","Mmath-1"};
            String[] Computer_Semester1st_Shift12nd_Wednesday_Techer = {"Mainul Islam","Nasir","Principal Sir","Smita Mistry"};
            String[] Computer_Semester1st_Shift12nd_Wednesday_Room = {"Network Lab","R-301","R-301","R-301"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift12nd_Wednesday_Room,Computer_Semester1st_Shift12nd_Wednesday_Techer,Computer_Semester1st_Shift12nd_Wednesday_Subject,Computer_Semester1st_Shift12nd_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("1st-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester1st_Shift12nd_Thursday_Time = {"1.30-2.15(45m)","2.15-4.30(2h15m)"};
            String[] Computer_Semester1st_Shift12nd_Thursday_Subject = {"English-1","Physics"};
            String[] Computer_Semester1st_Shift12nd_Thursday_Techer = {"MD.Salauddin","Principal Sir"};
            String[] Computer_Semester1st_Shift12nd_Thursday_Room = {"R-301","Physics Lab"};



            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester1st_Shift12nd_Thursday_Room,Computer_Semester1st_Shift12nd_Thursday_Techer,Computer_Semester1st_Shift12nd_Thursday_Subject,Computer_Semester1st_Shift12nd_Thursday_Time);
            classList.setAdapter(todayClass);
        }
//
////                -----------------------CmT 1st semester, 2nd Shift End--------------------------------------------------------------
//
////-------------------------------CmT 3rd Semester, 1st Shift Code Here-------------------------------------------------

        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester3rd_Shift1st_Saturday_Time = {"8.00-8.45(45m)","8.45-10.15(1h30m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester3rd_Shift1st_Saturday_Subject = {"Digital Electronics","Math-3","Industrial Electronics","Computer Application-2"};
            String[] Computer_Semester3rd_Shift1st_Saturday_Techer = {"Mohiuddin Mamun","Smita Mistry","Nasir","Binoy Jyoti Chakma"};
            String[] Computer_Semester3rd_Shift1st_Saturday_Room = {"R-302","R-302","R-302","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift1st_Saturday_Room,Computer_Semester3rd_Shift1st_Saturday_Techer,Computer_Semester3rd_Shift1st_Saturday_Subject,Computer_Semester3rd_Shift1st_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester3rd_Shift1st_Sunday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-11.45(45m)","11.45-12.30(45m)","12.30-1.15(45m)"};
            String[] Computer_Semester3rd_Shift1st_Sunday_Subject = {"Industrial Electronics","Programming Language-1","Social Science-1","Digital Electronics-1"};
            String[] Computer_Semester3rd_Shift1st_Sunday_Techer = {"Nasir","Palash Biswas","Shadhat Hussain","Mohiuddin Mamun"};
            String[] Computer_Semester3rd_Shift1st_Sunday_Room = {"Digital Lab","R-302","R-302","R-302"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift1st_Sunday_Room,Computer_Semester3rd_Shift1st_Sunday_Techer,Computer_Semester3rd_Shift1st_Sunday_Subject,Computer_Semester3rd_Shift1st_Sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester3rd_Shift1st_Mondayday_Time = {"8.45-11.00(2h15m)","11.00-11.45(45m)","11.45-1.15(1h30m)"};
            String[] Computer_Semester3rd_Shift1st_Monday_Subject = {"Computer Application-2","Physics-2","Math-3"};
            String[] Computer_Semester3rd_Shift1st_Monday_Techer = {"Binoy Jyoti Chakma","Binoy Jyoti Chakma","Smita Mistry"};
            String[] Computer_Semester3rd_Shift1st_Monday_Room = {"Software Lab","R-302","R-302"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift1st_Monday_Room,Computer_Semester3rd_Shift1st_Monday_Techer,Computer_Semester3rd_Shift1st_Monday_Subject,Computer_Semester3rd_Shift1st_Mondayday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester3rd_Shift1st_Tuesday_Time = {"8.00-9.30(1h30m)","9.30-10.15(45m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester3rd_Shift1st_Tuesday_Subject = {"Math-3","Programming Language-1","Digital Electronics-1","Physics-2"};
            String[] Computer_Semester3rd_Shift1st_Tuesday_Techer = {"Smita Mistry","Palash Biswas","Mohiuddin Mamun","Binoy Jyoti Chakma"};
            String[] Computer_Semester3rd_Shift1st_Tuesday_Room = {"R-302","R-302","R-302","Physics Lab"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift1st_Tuesday_Room,Computer_Semester3rd_Shift1st_Tuesday_Techer,Computer_Semester3rd_Shift1st_Tuesday_Subject,Computer_Semester3rd_Shift1st_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester3rd_Shift1st_Wednesday_Time = {"9.30-10.15(45m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester3rd_Shift1st_Wednesday_Subject = {"Industrial Electronics","Physics-2","Programming Language-1"};
            String[] Computer_Semester3rd_Shift1st_Wednesday_Techer = {"Nasir","Binoy Jyoti Chakma","Palash Biswas"};
            String[] Computer_Semester3rd_Shift1st_Wednesday_Room = {"R-302","R-302","Software Lab"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift1st_Wednesday_Room,Computer_Semester3rd_Shift1st_Wednesday_Techer,Computer_Semester3rd_Shift1st_Wednesday_Subject,Computer_Semester3rd_Shift1st_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester3rd_Shift1st_Thursday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-11.45(45m)"};
            String[] Computer_Semester3rd_Shift1st_Thursday_Subject = {"Digital Electronics-1","Social Science-1","Physics-2"};
            String[] Computer_Semester3rd_Shift1st_Thursday_Techer = {"Mohiuddin Mamun","Shadhat Hussain","Binoy Jyoti Chakma"};
            String[] Computer_Semester3rd_Shift1st_Thursday_Room = {"Ent Lab","R-302","R-302"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift1st_Thursday_Room,Computer_Semester3rd_Shift1st_Thursday_Techer,Computer_Semester3rd_Shift1st_Thursday_Subject,Computer_Semester3rd_Shift1st_Thursday_Time);
            classList.setAdapter(todayClass);
        }
//        //---------------------CmT 3rd Semester, 1st Shift End Here--------------------------------------------------------------------
//
////-----------------------------CmT 3rd semester, 2nd Shift Start here--------------------------------------------------------------

        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("2nd-Shift")){

            String[] Computer_Semester3rd_Shift2nd_Saturday_Time = {"1.30-2.15(45m)","2.15-3.45(1h30m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester3rd_Shift2nd_Saturday_Subject = {"Digital Electronics","Math-3","Industrial Electronics","Computer Application-2"};
            String[] Computer_Semester3rd_Shift2nd_Saturday_Techer = {"Mohiuddin Mamun","Smita Mistry","Nasir","Binoy Jyoti Chakma"};
            String[] Computer_Semester3rd_Shift2nd_Saturday_Room = {"R-302","R-302","R-302","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift2nd_Saturday_Room,Computer_Semester3rd_Shift2nd_Saturday_Techer,Computer_Semester3rd_Shift2nd_Saturday_Subject,Computer_Semester3rd_Shift2nd_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester3rd_Shift2nd_Sunday_Time = {"1.30-3.45(2h15m)","3.45-4.30(45m)","4.30-5.15(45m)","5.15-6.00(45m)","6.00-6.45(45m)"};
            String[] Computer_Semester3rd_Shift2nd_Sunday_Subject = {"Industrial Electronics","Programming Language-1","Social Science-1","Digital Electronics-1"};
            String[] Computer_Semester3rd_Shift2nd_Sunday_Techer = {"Nasir","Palash Biswas","Shadhat Hussain","Mohiuddin Mamun"};
            String[] Computer_Semester3rd_Shift2nd_Sunday_Room = {"Digital Lab","R-302","R-302","R-302"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift2nd_Sunday_Room,Computer_Semester3rd_Shift2nd_Sunday_Techer,Computer_Semester3rd_Shift2nd_Sunday_Subject,Computer_Semester3rd_Shift2nd_Sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester3rd_Shift2nd_Mondayday_Time = {"2.15-4.30(2h15m)","4.30-5.15(45m)","5.15-6.45(1h3om)"};
            String[] Computer_Semester3rd_Shift2nd_Monday_Subject = {"Computer Application-2","Physics-2","Math-3"};
            String[] Computer_Semester3rd_Shift2nd_Monday_Techer = {"Binoy Jyoti Chakma","Binoy Jyoti Chakma","Smita Mistry"};
            String[] Computer_Semester3rd_Shift2nd_Monday_Room = {"Software Lab-2","R-302","R-302"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift2nd_Monday_Room,Computer_Semester3rd_Shift2nd_Monday_Techer,Computer_Semester3rd_Shift2nd_Monday_Subject,Computer_Semester3rd_Shift2nd_Mondayday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester3rd_Shift2nd_Tuesday_Time = {"1.30-3.00(1h30m)","3.00-3.45(45m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester3rd_Shift2nd_Tuesday_Subject = {"Math-3","Programming Language-1","Digital Electronics-1","Physics-2"};
            String[] Computer_Semester3rd_Shift2nd_Tuesday_Techer = {"Smita Mistry","Palash Biswas","Mohiuddin Mamun","Binoy Jyoti Chakma"};
            String[] Computer_Semester3rd_Shift2nd_Tuesday_Room = {"R-302","R-302","R-302","Physics Lab"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift2nd_Tuesday_Room,Computer_Semester3rd_Shift2nd_Tuesday_Techer,Computer_Semester3rd_Shift2nd_Tuesday_Subject,Computer_Semester3rd_Shift2nd_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester3rd_Shift2nd_Wednesday_Time = {"3.00-3.45(45m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester3rd_Shift2nd_Wednesday_Subject = {"Industrial Electronics","Physics-2","Programming Language-1"};
            String[] Computer_Semester3rd_Shift2nd_Wednesday_Techer = {"Nasir","Binoy Jyoti Chakma","Palash Biswas"};
            String[] Computer_Semester3rd_Shift2nd_Wednesday_Room = {"R-302","R-302","Software Lab-1"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift2nd_Wednesday_Room,Computer_Semester3rd_Shift2nd_Wednesday_Techer,Computer_Semester3rd_Shift2nd_Wednesday_Subject,Computer_Semester3rd_Shift2nd_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("3rd-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester3rd_Shift2nd_Thursday_Time = {"1.30-3.45(2h15m)","3.45-4.30(45m)","4.30-5.15(45m)"};
            String[] Computer_Semester3rd_Shift2nd_Thursday_Subject = {"Digital Electronics-1","Social Science-1","Physics-2"};
            String[] Computer_Semester3rd_Shift2nd_Thursday_Techer = {"Mohiuddin Mamun","Shadhat Hussain","Binoy Jyoti Chakma"};
            String[] Computer_Semester3rd_Shift2nd_Thursday_Room = {"Ent Lab","R-302","R-302"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester3rd_Shift2nd_Thursday_Room,Computer_Semester3rd_Shift2nd_Thursday_Techer,Computer_Semester3rd_Shift2nd_Thursday_Subject,Computer_Semester3rd_Shift2nd_Thursday_Time);
            classList.setAdapter(todayClass);
        }
//        //----------------------------CmT 3rdSemester/2nd Shift End----------------------------------------------------------------------------------------------------
//        //-------------------------------CmT 5th Semester, 1st Shift Code Here-------------------------------------------------
        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester5th_Shift1st_Saturday_Time = {"8.00-8.45(45m)","8.45-9.30(45m)","9.30.00-10.15(45m)","10.15-11.00(45)","11.00-1.15(2h15m)"};
            String[] Computer_Semester5th_Shift1st_Saturday_Subject = {"Programming Language-3","Bookkipping & Accounting","Environment Management","Webdesign","Programming Language-3"};
            String[] Computer_Semester5th_Shift1st_Saturday_Techer = {"Zakir Hossain","Mashiur Rahman","MD.Salauddin","Mohiuddin Mamun","Zakir hossain"};
            String[] Computer_Semester5th_Shift1st_Saturday_Room = {"R-303","R-303","R-303","R-303","Software Lab-1"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift1st_Saturday_Room,Computer_Semester5th_Shift1st_Saturday_Techer,Computer_Semester5th_Shift1st_Saturday_Subject,Computer_Semester5th_Shift1st_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester5th_Shift1st_Sunday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester5th_Shift1st_Sunday_Subject = {"Prrogramming Language-3","Architecture","Database Management System"};
            String[] Computer_Semester5th_Shift1st_Sunday_Techer = {"Zakir Hossain","Mainul Islam","Palash Biswas"};
            String[] Computer_Semester5th_Shift1st_Sunday_Room = {"Software Lab-1","R-303","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift1st_Sunday_Room,Computer_Semester5th_Shift1st_Sunday_Techer,Computer_Semester5th_Shift1st_Sunday_Subject,Computer_Semester5th_Shift1st_Sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester5th_Shift1st_Mondayday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester5th_Shift1st_Monday_Subject = {"Architecture","Webdesign","Programming Language-3"};
            String[] Computer_Semester5th_Shift1st_Monday_Techer = {"Mainul islam","Mohiuddin Mamun","Zakir Hossain"};
            String[] Computer_Semester5th_Shift1st_Monday_Room = {"H/W Lab","R-303","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift1st_Monday_Room,Computer_Semester5th_Shift1st_Monday_Techer,Computer_Semester5th_Shift1st_Monday_Subject,Computer_Semester5th_Shift1st_Mondayday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester5th_Shift1st_Tuesday_Time = {"8.45-9.30(45m)","9.30-10.15(45m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester5th_Shift1st_Tuesday_Subject = {"Database management","Bookkipping & Accounting","Architecture","Zakir Hossain"};
            String[] Computer_Semester5th_Shift1st_Tuesday_Techer = {"Palash Biswas","Mashiur Rahman","Mainul Islam","Zakir Hossain"};
            String[] Computer_Semester5th_Shift1st_Tuesday_Room = {"R-303","R-303","R-303","Software Lab-1"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift1st_Tuesday_Room,Computer_Semester5th_Shift1st_Tuesday_Techer,Computer_Semester5th_Shift1st_Tuesday_Subject,Computer_Semester5th_Shift1st_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester5th_Shift1st_Wednesday_Time = {"8.00-8.45(45m)","8.45-9.30(45m)","9.30-10.15(45m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester5th_Shift1st_Wednesday_Subject = {"Environ Management","Database Manegement","Programming Language-3","Architecture","Webdesign"};
            String[] Computer_Semester5th_Shift1st_Wednesday_Techer = {"MD Salauddin","Palash Biswas","Zakir Hossain","Mainul Islam","Mohiuddin Mamun"};
            String[] Computer_Semester5th_Shift1st_Wednesday_Room = {"R-303","R-303","R-303","R-303","Software Lab-2"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift1st_Wednesday_Room,Computer_Semester5th_Shift1st_Wednesday_Techer,Computer_Semester5th_Shift1st_Wednesday_Subject,Computer_Semester5th_Shift1st_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester5th_Shift1st_Thursday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)"};
            String[] Computer_Semester5th_Shift1st_Thursday_Subject = {"Database Management","Webdesign"};
            String[] Computer_Semester5th_Shift1st_Thursday_Techer = {"Palash Biswas","Zakir Hossain"};
            String[] Computer_Semester5th_Shift1st_Thursday_Room = {"Software Lab-1","R-303"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift1st_Thursday_Room,Computer_Semester5th_Shift1st_Thursday_Techer,Computer_Semester5th_Shift1st_Thursday_Subject,Computer_Semester5th_Shift1st_Thursday_Time);
            classList.setAdapter(todayClass);
        }
        //---------------------CmT 5th Semester, 1st Shift End Here--------------------------------------------------------------------

//-----------------------------CmT 5th semester, 2nd Shift Start here--------------------------------------------------------------

        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("2nd-Shift")){

            String[] Computer_Semester5th_Shift2nd_Saturday_Time = {"1.30-2.15(45m)","2.15-3.00(45m)","3.00-3.45(45m)","3.45-4.30(45)","4.30-6.45(2h15m)"};
            String[] Computer_Semester5th_Shift2nd_Saturday_Subject = {"Programming Language-3","Bookkipping & Accounting","Environment Management","Webdesign","Programming Language-3"};
            String[] Computer_Semester5th_Shift2nd_Saturday_Techer = {"Zakir Hossain","Mashiur Rahman","MD.Salauddin","Mohiuddin Mamun","Zakir hossain"};
            String[] Computer_Semester5th_Shift2nd_Saturday_Room = {"R-303","R-303","R-303","R-303","Software Lab-1"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift2nd_Saturday_Room,Computer_Semester5th_Shift2nd_Saturday_Techer,Computer_Semester5th_Shift2nd_Saturday_Subject,Computer_Semester5th_Shift2nd_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester5th_Shift2nd_Sunday_Time = {"1.30-3.45(2h15m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester5th_Shift2nd_Sunday_Subject = {"Prrogramming Language-3","Architecture","Database Management System"};
            String[] Computer_Semester5th_Shift2nd_Sunday_Techer = {"Zakir Hossain","Mainul Islam","Palash Biswas"};
            String[] Computer_Semester5th_Shift2nd_Sunday_Room = {"Software Lab-1","R-303","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift2nd_Sunday_Room,Computer_Semester5th_Shift2nd_Sunday_Techer,Computer_Semester5th_Shift2nd_Sunday_Subject,Computer_Semester5th_Shift2nd_Sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester5th_Shift2nd_Mondayday_Time = {"1.30-3.45(2h15m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester5th_Shift2nd_Monday_Subject = {"Architecture","Webdesign","Programming Language-3"};
            String[] Computer_Semester5th_Shift2nd_Monday_Techer = {"Mainul islam","Mohiuddin Mamun","Zakir Hossain"};
            String[] Computer_Semester5th_Shift2nd_Monday_Room = {"H/W Lab","R-303","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift2nd_Monday_Room,Computer_Semester5th_Shift2nd_Monday_Techer,Computer_Semester5th_Shift2nd_Monday_Subject,Computer_Semester5th_Shift2nd_Mondayday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester5th_Shift2nd_Tuesday_Time = {"2.15-3.00(45m)","3.00-3.45(45m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester5th_Shift2nd_Tuesday_Subject = {"Database management","Bookkipping & Accounting","Architecture","Zakir Hossain"};
            String[] Computer_Semester5th_Shift2nd_Tuesday_Techer = {"Palash Biswas","Mashiur Rahman","Mainul Islam","Zakir Hossain"};
            String[] Computer_Semester5th_Shift2nd_Tuesday_Room = {"R-303","R-303","R-303","Software Lab-1"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift2nd_Tuesday_Room,Computer_Semester5th_Shift2nd_Tuesday_Techer,Computer_Semester5th_Shift2nd_Tuesday_Subject,Computer_Semester5th_Shift2nd_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("2nd-Shift")){

            String[] Computer_Semester5th_Shift2nd_Wednesday_Time = {"1.30-2.15(45m)","2.15-3.00(45m)","3.00-3.45(45m)","3.45-4.30(45m)","4.30-6.45(2h15m)"};
            String[] Computer_Semester5th_Shift2nd_Wednesday_Subject = {"Environ Management","Database Manegement","Programming Language-3","Architecture","Webdesign"};
            String[] Computer_Semester5th_Shift2nd_Wednesday_Techer = {"MD Salauddin","Palash Biswas","Zakir Hossain","Mainul Islam","Mohiuddin Mamun"};
            String[] Computer_Semester5th_Shift2nd_Wednesday_Room = {"R-303","R-303","R-303","R-303","Software Lab-2"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift2nd_Wednesday_Room,Computer_Semester5th_Shift2nd_Wednesday_Techer,Computer_Semester5th_Shift2nd_Wednesday_Subject,Computer_Semester5th_Shift2nd_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("5th-Semester")&&userShiftName.equals("2nd-Shift")){
            String[] Computer_Semester5th_Shift2nd_Thursday_Time = {"1.30-3.45(2h15m)","3.45-4.30(45m)"};
            String[] Computer_Semester5th_Shift2nd_Thursday_Subject = {"Database Management","Webdesign"};
            String[] Computer_Semester5th_Shift2nd_Thursday_Techer = {"Palash Biswas","Zakir Hossain"};
            String[] Computer_Semester5th_Shift2nd_Thursday_Room = {"Software Lab-1","R-303"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester5th_Shift2nd_Thursday_Room,Computer_Semester5th_Shift2nd_Thursday_Techer,Computer_Semester5th_Shift2nd_Thursday_Subject,Computer_Semester5th_Shift2nd_Thursday_Time);
            classList.setAdapter(todayClass);
        }
//        ----------------------------CmT 5thSemester/2nd Shift End----------------------------------------------------------------------------------------------------
//
//-------------------------------CmT 6th Semester, 1st Shift Code Here-------------------------------------------------
        if(dayOfTheWeek.equals("Saturday")&&userDeptName.equals("CmT")&&userSemesterName.equals("6th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester6th_Shift1st_Saturday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-11.45(45m)"};
            String[] Computer_Semester6th_Shift1st_Saturday_Subject = {"6663","6662","6661"};
            String[] Computer_Semester6th_Shift1st_Saturday_Techer = {"Mainul Islam","Binoy Jyoti Chakma","Mohiuddin Mamun"};
            String[] Computer_Semester6th_Shift1st_Saturday_Room = {"Software Lab-2","R-H/W","R-H/W"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester6th_Shift1st_Saturday_Room,Computer_Semester6th_Shift1st_Saturday_Techer,Computer_Semester6th_Shift1st_Saturday_Subject,Computer_Semester6th_Shift1st_Saturday_Time);
            classList.setAdapter(todayClass);
        }

        if(dayOfTheWeek.equals("Sunday")&&userDeptName.equals("CmT")&&userSemesterName.equals("6th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester6th_Shift1st_sunday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-11.45(45m)","11.45-12.30(45m)"};
            String[] Computer_Semester6th_Shift1st_Sunday_Subject = {"8563","6664","6663","6662"};
            String[] Computer_Semester6th_Shift1st_Sunday_Techer = {"Palash Biswas","Zakir Hossain","Mainul Islam","Binoy Jyoti Chakma"};
            String[] Computer_Semester6th_Shift1st_Sunday_Room = {"R-H/W Lab","R-H/W","R-H/W","R-H/W"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester6th_Shift1st_Sunday_Room,Computer_Semester6th_Shift1st_Sunday_Techer,Computer_Semester6th_Shift1st_Sunday_Subject,Computer_Semester6th_Shift1st_sunday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Monday")&&userDeptName.equals("CmT")&&userSemesterName.equals("6th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester6th_Shift1st_Monday_Time = {"8.00-8.45(45m)","8.45-9.30(45m)","9.30-10.15(45m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester6th_Shift1st_Monday_Subject = {"6662","6661","5841","6663","6665"};
            String[] Computer_Semester6th_Shift1st_Monday_Techer = {"Binoy Jyoti Chakma","Mohiuddin Mamun","MD.Salauddin","Mainul Islam","Mohiuddin Mamun"};
            String[] Computer_Semester6th_Shift1st_Monday_Room = {"R-H/W","R-H/W","R-H/W","R-H/W","R-H/W Lab"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester6th_Shift1st_Monday_Room,Computer_Semester6th_Shift1st_Monday_Techer,Computer_Semester6th_Shift1st_Monday_Subject,Computer_Semester6th_Shift1st_Monday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Tuesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("6th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester6th_Shift1st_Tuesday_Time ={"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester6th_Shift1st_Tuesday_Subject ={"6661","6664","8563"};
            String[] Computer_Semester6th_Shift1st_Tuesday_Techer ={"Mohiuddin Mamun","Zakir Hossain","Palash Biswas"};
            String[] Computer_Semester6th_Shift1st_Tuesday_Room ={"R-H/W Lab","R-H/W","Software Lab-2"};

            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester6th_Shift1st_Tuesday_Room,Computer_Semester6th_Shift1st_Tuesday_Techer,Computer_Semester6th_Shift1st_Tuesday_Subject,Computer_Semester6th_Shift1st_Tuesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Wednesday")&&userDeptName.equals("CmT")&&userSemesterName.equals("6th-Semester")&&userShiftName.equals("1st-Shift")){
            String[] Computer_Semester6th_Shift1st_Wednesday_Time = {"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester6th_Shift1st_Wednesday_Subject = {"6662","6661","6663"};
            String[] Computer_Semester6th_Shift1st_Wednesday_Techer = {"Binoy Jyoti Chakma","Mohiuddin Mamun","Mainul Islam"};
            String[] Computer_Semester6th_Shift1st_Wednesday_Room = {"R-H/W Lab","R-H/W","R-H/W Lab"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester6th_Shift1st_Wednesday_Room,Computer_Semester6th_Shift1st_Wednesday_Techer,Computer_Semester6th_Shift1st_Wednesday_Subject,Computer_Semester6th_Shift1st_Wednesday_Time);
            classList.setAdapter(todayClass);
        }
        if(dayOfTheWeek.equals("Thursday")&&userDeptName.equals("CmT")&&userSemesterName.equals("6th-Semester")&&userShiftName.equals("1st-Shift")){

            String[] Computer_Semester6th_Shift1st_Thursday_Time ={"8.00-10.15(2h15m)","10.15-11.00(45m)","11.00-1.15(2h15m)"};
            String[] Computer_Semester6th_Shift1st_Thursday_Subject ={"6664","5841","6665"};
            String[] Computer_Semester6th_Shift1st_Thursday_Techer ={"Zakir Hossain","MD.Salauddin","Mohiuddin Mamun"};
            String[] Computer_Semester6th_Shift1st_Thursday_Room ={"R-H/W Lab","R-H/W","R-H/W Lab"};


            TodayClassListAdapter todayClass = new TodayClassListAdapter(getActivity(),Computer_Semester6th_Shift1st_Thursday_Room,Computer_Semester6th_Shift1st_Thursday_Techer,Computer_Semester6th_Shift1st_Thursday_Subject,Computer_Semester6th_Shift1st_Thursday_Time);
            classList.setAdapter(todayClass);
        }
//        ---------------------CmT 6th Semester, 1st Shift End Here--------------------------------------------------------------------


        return view;
    }
}
