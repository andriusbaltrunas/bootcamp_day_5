package oop.interfaceExample;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public interface Machine {

    public String machineName();

    public int machinePrice();

    String machineType();

    default String belekas(){
        return "cha default methos is called";
    }
}
