import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class FirstTaskFromCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Jonas");
        names.add("Antanas");
        names.add("Aloyzas");
        names.add("Petras");
        names.add("Antanas");

        //Collections.sort(names); jei reikia surykiuoti pagal alfbeta

        for (String name : names) {
            if (name.length() >= 6) {
                System.out.println(name);
            } else {
                System.out.println("Vardas per trumpas pasikeisk");
            }
        }

        // nuo java 8
        /*names.forEach(name -> {
            if (name.length() >= 6) {
                System.out.println(name);
            }else {
                System.out.println("Vardas per truimpas");
            }
        });*/

        System.out.println("Primas vardas -> " +getFirstElement(names));

        System.out.println("Paskutinias vardas-> " + getLastElement(names));
    }

    private static String getFirstElement(List<String> names){
        String firstName = names.get(0);
        return firstName;
    }

    private static String getLastElement(List<String> names){
        String lastName = names.get(names.size() - 1 );
        return lastName;
    }
}
