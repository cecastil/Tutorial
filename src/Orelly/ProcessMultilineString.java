package Orelly;
import java.util.ArrayList;

public class ProcessMultilineString {
    public static void main(String[] args) {
        String testString = "This\nis\na\ntest";
       // System.out.println(testString + "\n");
        System.out.println(collectLines(testString));

    }

   // private static List<String> collectLines (String s, String separator){
     //   String[] items = s.split(separator);
       // return Arrays.asList(items);
    //}

    //In the original exercise include an List class, but this declaration invoke an error.
    private static ArrayList collectLines(String s){
        ArrayList<String> lines = new ArrayList<>();
        s.lines().forEach(line -> lines.add(line));
        return lines;
    }
}
