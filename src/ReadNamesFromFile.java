import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class ReadNamesFromFile {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader("vardai.txt"))){
            String line;
            while ((line = bf.readLine()) != null){
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);
    }
}
