package oop.abstractExample;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public abstract class Pet {

    public abstract String name();

    public abstract String color();

    public abstract String type();

    public void eat(){
        System.out.println("ir dar kiek");
    }
}
