package oop;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class Bmw extends Car {

    @Override
    public int maxSpeed() {
        return 120;
    }

    @Override
    public String spalva() {
        return "raudona";
    }

    @Override
    public String kebuloTipas() {
        return "universalas";
    }

    public void kaina(){
        System.out.println("Baisiai daug 1K");
    }
}
