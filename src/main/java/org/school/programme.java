package org.school;

import org.joda.time.DateTime;
import org.school.module;

public class programme {
    private String name;
    private module[] modules;
    private Student[] students;


    private DateTime s_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public module[] getModules() {
        return modules;
    }

    public void setModules(module[] modules) {
        this.modules = modules;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public DateTime getS_date() {
        return s_date;
    }

    public void setS_date(DateTime s_date) {
        this.s_date = s_date;
    }

    public DateTime getE_date() {
        return e_date;
    }

    public void setE_date(DateTime e_date) {
        this.e_date = e_date;
    }

    private DateTime e_date;
}
