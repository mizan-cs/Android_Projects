package com.project.mizan.birthdaylist;

/**
 * Created by Mizan on 2/18/2017.
 */

public class DataFunction {

    private int id;
    private String name;
    private String days;

    DataFunction(String n,String d){
        name = n;
        days = d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
