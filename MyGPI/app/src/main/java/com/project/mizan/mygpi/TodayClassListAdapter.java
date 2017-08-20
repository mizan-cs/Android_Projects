package com.project.mizan.mygpi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mizan on 8/23/2016.
 */
public class TodayClassListAdapter extends BaseAdapter {

    String[] classTime;
    String[] className;
    String[] classRoom;
    String[] classTeacheer;
    Context ct;
    private static LayoutInflater inflater = null;

    //------------Constructor Method------------


    public TodayClassListAdapter(Context ct, String[] classRoom, String[] classTeacheer, String[] className, String[] classTime) {
        this.ct = ct;
        this.classRoom = classRoom;
        this.classTeacheer = classTeacheer;
        this.className = className;
        this.classTime = classTime;
        inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return className.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class myHolder{
        TextView classTime;
        TextView className;
        TextView roomName;
        Button teacherName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        myHolder myh = new myHolder();
        View myview;

        myview = inflater.inflate(R.layout.today_class_list_layout,null);

        myh.classTime = (TextView) myview.findViewById(R.id.ID_1ClassTime);
        myh.className = (TextView) myview.findViewById(R.id.ID_1ClassName);
        myh.roomName = (TextView) myview.findViewById(R.id.ID_1ClassRoom);
        myh.teacherName = (Button) myview.findViewById(R.id.ID_1ClassTeacher);

        myh.classTime.setText(classTime[position]);
        myh.className.setText(className[position]);
        myh.roomName.setText(classRoom[position]);
        myh.teacherName.setText(classTeacheer[position]);


        return myview;
    }
}
