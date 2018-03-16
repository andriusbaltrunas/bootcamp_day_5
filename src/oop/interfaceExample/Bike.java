package oop.interfaceExample;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class Bike implements Machine {
    @Override
    public String machineName() {
        return "Desniukas";
    }

    @Override
    public int machinePrice() {
        return 150;
    }

    @Override
    public String machineType() {
        return "Dviratukas";
    }
}
