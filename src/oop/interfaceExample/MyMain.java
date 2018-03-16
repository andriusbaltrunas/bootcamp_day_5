package oop.interfaceExample;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class MyMain {

    public static void main(String[] args) {
        Machine machine = new Bike();
        print(machine);
    }

    private static void print(Machine machine){
        System.out.println(machine.machineName() + " " + machine.machineType() + " "+ machine.machinePrice() + " " + machine.belekas());

    }
}
