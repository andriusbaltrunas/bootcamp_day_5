package oop.abstractExample;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class MyMain {

    public static void main(String[] args) {
        Pet cat = new Cat();

        System.out.println(cat.color() + " " + cat.name() + " " + cat.type());
        cat.eat();
    }
}
