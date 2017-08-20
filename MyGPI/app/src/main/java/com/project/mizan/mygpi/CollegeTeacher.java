package com.project.mizan.mygpi;

/**
 * Created by Mizan on 8/27/2016.
 */
public class CollegeTeacher {
    private String teacherName;
    private String teacherJob;

    public CollegeTeacher(String teacherName, String teacherJob) {
        this.teacherName = teacherName;
        this.teacherJob = teacherJob;
    }

    public CollegeTeacher() {}

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherJob() {
        return teacherJob;
    }
}
