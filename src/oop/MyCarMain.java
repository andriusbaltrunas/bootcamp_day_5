package oop;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class MyCarMain {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.kebuloTipas() + " " + car.maxSpeed() + " " + car.spalva());

        Car c = new Bmw();
        System.out.println(c.kebuloTipas() + " " + c.maxSpeed() + " " + c.spalva());
       // c.kaina();

        Car audi = new Audi();
        System.out.println(audi.kebuloTipas() + " " + audi.maxSpeed() + " "+ audi.spalva());
    }
}
