import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class SecondTaskFromCollections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(54);
        numbers.add(324);
        numbers.add(23);
        numbers.add(1);
        numbers.add(56);
        numbers.add(46);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(5);

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        int i = 1;
        while (iterator.hasNext()){
            iterator.next();
            if(i % 2 == 0){
                iterator.remove();
            }
            i++;
        }



        System.out.println(numbers);

    }
}
