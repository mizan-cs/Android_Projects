package com.project.mizan.mygpi;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by Mizan on 8/28/2016.
 */
public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    EditText dateText;

    public DateDialog(View view){
        dateText = (EditText)view;
    }

    public Dialog onCreateDialog(Bundle saveInstanceState){
        final Calendar c =  Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day =c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this,year,month,day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        String date = day+"/"+(month+1)+"/"+year;
        dateText.setText(date);
        Intent intent = new Intent();
        intent.putExtra("user-day",day);
        intent.putExtra("user-month",month);
        intent.putExtra("user-year",year);
    }
}
