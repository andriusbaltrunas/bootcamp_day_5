package oop.abstractExample;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class Cat extends Pet {
    @Override
    public String name() {
        return "Pukis";
    }

    @Override
    public String color() {
        return "baltas";
    }

    @Override
    public String type() {
        return "persas";
    }
}
