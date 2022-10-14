

public class Student {
    private String Name;
    private int Age;
    private String DOB; //Placeholder will change later
    private String username;
    private String[] courses;
    private String[] modules;

    public Student(String name, int age, String DOB, String username, String[] courses, String[] modules) {
        Name = name;
        Age = age;
        this.DOB = DOB;
        this.username = username;
        this.courses = courses;
        this.modules = modules;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getUsername() {
        return Name + Age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }



}
