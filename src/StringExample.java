/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public class StringExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Andrius");
        if(2 > 5){
            sb.append(" a").append(" ").append(" ");
        }


        System.out.println(sb.toString());

        findLastLetter("Petras");

        System.out.println("aaaBaF".toUpperCase());
        System.out.println("BBaBgB".toLowerCase());
        System.out.println(" TRIM ".trim());
        System.out.println("abckasjfklsa".replaceAll("abc", "def"));

        String[] items = "abads ajskd ;akjksa asdkjask".split(" ");
        for (String a : items){
            System.out.println(a);
        }
    }


    private static void findLastLetter(String word){
        for(int i = word.length() -1; i >= 0; i--){
            if(word.charAt(i) == 'a'){
                System.out.println(i);
                break;
            }
        }
    }
}
