package oop;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class Student {
    private int age;
    private String name;
    private String surname;

    public Student(){
        System.out.println("Defaultinis konstruktorius");
    }

    public Student(int age){
        this();
        this.age = age;
    }

    public Student(int age, String name, String surname) {
        this(age);
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
