package org.school;


public class module {
    private String name;
    private String id;
    private Student[] students;
    private String[] courses;
    private lecturer Lecturer;

    public module(String name, String id, Student[] students, String[] courses, lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.students = students;
        this.courses = courses;
        Lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public lecturer getLecturer() {
        return Lecturer;
    }

    public void setLecturer(lecturer lecturer) {
        Lecturer = lecturer;
    }
}
