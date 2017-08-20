package com.project.mizan.mygpi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Mizan on 8/27/2016.
 */
public class TeacherListViewAdapter extends BaseAdapter {

    //Declere Variable
    Context mContext;
    LayoutInflater inflater;
    private List<CollegeTeacher> collegeTeacherList = null;
    private ArrayList<CollegeTeacher>arrayList;

    public TeacherListViewAdapter(Context context, List<CollegeTeacher>collegeTeacherList){
        mContext = context;
        this.collegeTeacherList = collegeTeacherList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<CollegeTeacher>();
        this.arrayList.addAll(collegeTeacherList);
    }

    public class ViewHolder{
        TextView tName;
        TextView tJob;
    }

    @Override
    public int getCount() {
        return collegeTeacherList.size();
    }

    @Override
    public Object getItem(int position) {
        return collegeTeacherList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.all_dept_teacher_list_layout,null);
            //Locat the TextView in all_dept_teacher_list_layout
            holder.tName = (TextView)convertView.findViewById(R.id.ID_TeacherNameList);
            holder.tJob = (TextView)convertView.findViewById(R.id.ID_TeacherJobList);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.tName.setText(collegeTeacherList.get(position).getTeacherName());
        holder.tJob.setText(collegeTeacherList.get(position).getTeacherJob());


//        //Listen for List View Item Click
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Send single item click data to SingleItemView Class
//                //Intent intent = new Intent(mContext, SingleItemView.class);
//            }
//        });

        // Listen for ListView Item Click
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext,"Clicked on "+collegeTeacherList.get(position).getTeacherName(),Toast.LENGTH_LONG).show();
//            }
//        });

        return convertView;
    }

    //Filter Class
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        collegeTeacherList.clear();
        if(charText.length() == 0){
            collegeTeacherList.addAll(arrayList);
        }else{
            for(CollegeTeacher ct:arrayList){
                if(ct.getTeacherName().toLowerCase(Locale.getDefault()).contains(charText)){
                    collegeTeacherList.add(ct);
                }
            }
        }
        notifyDataSetChanged();
    }
}
