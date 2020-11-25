package Orelly;

public class StringApiRepeatAString {
    public static void main(String[] args) {

        //Imagine that you need to build a data table with padded whitespaces between key/values pairs to improve
        //its readability.

        System.out.println(renderInfo("CPU Usage: ", "5%"));
        System.out.println(renderInfo("Memory Usage: " , "9.14 MB"));
        System.out.println(renderInfo("Free disk: ", "96.5 GB"));
    }
    //This is the older way to repeat 'n' times a String.
    
    /*private static String renderInfo(String title, String value){
        StringBuilder info = new StringBuilder();
        info.append((title));
        int times = 25 - title.length() - value.length();

        for(int i = 1; i <= times; i++){
            info.append(" ");
        }
        info.append(value);
        return info.toString();
    }*/

    //Using the String.repeat method to repeats a String 'n' times. And simplify the code
    private static String renderInfo(String title, String value){
        return title + " ".repeat(25 - title.length() - value.length()) + value;
    }
}
