package oop;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class MySecondMain {
    public static void main(String[] args) {
        Student st = new Student(8, "Andrius", "Baltrunas");

        System.out.println(st.getAge() + " " + st.getName()  + " " + st.getSurname());
    }
}
