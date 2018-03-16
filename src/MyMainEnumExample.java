/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class MyMainEnumExample {

    public static void main(String[] args) {
        System.out.println(Countries.LT.name());

        for (Countries c : Countries.values()){
            System.out.println(c.name() + " "+ c.getLocale());
        }

        Countries countries = Countries.valueOf("LT");

        System.out.println("GAVAU-> " + countries.getLocale());
    }
}
