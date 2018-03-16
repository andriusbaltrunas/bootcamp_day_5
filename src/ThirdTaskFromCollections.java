import java.util.LinkedList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class ThirdTaskFromCollections {

    public static void main(String[] args) {
        LinkedList<String> name = createNewList();

        name.forEach(System.out::println);

        System.out.println("----------papildytas-------------------");

        name.addFirst("Maryte");
        name.addLast("Jonukas");

        name.forEach(System.out::println);
    }

    private static LinkedList<String> createNewList(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Andrius");
        names.add("Jonas");
        names.add("Petras");
        names.add("Pranas");
        names.add("Jokubas");
        return names;
    }
}
