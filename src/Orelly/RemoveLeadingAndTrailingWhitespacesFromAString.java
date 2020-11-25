package Orelly;

public class RemoveLeadingAndTrailingWhitespacesFromAString {
    public static void main(String[] args) {
        String nameFormField = "    Java Duke    ";

        //Using the methods created in the end of the class, before the Java 11
        System.out.println("String stripped of Whitespaces: '" + strip(nameFormField) +"'");

        System.out.println("String stripped of leading whitespaces: '" + stripLeading(nameFormField) +"'");

        System.out.println("String stripped of trailing whitespaces: '" + stripTrailing(nameFormField) +"'");

        //Using the methods come in Java 11
        System.out.println("String stripped of Whitespaces: '" + nameFormField.strip() +"'");

        System.out.println("String stripped of leading whitespaces: '" + nameFormField.stripLeading() +"'");

        System.out.println("String stripped of trailing whitespaces: '" + nameFormField.stripTrailing() +"'");

    }
    private static String strip(String s){
        return s.replaceAll("^\\S+|\\S+$", "");
    }
    private static String stripLeading(String s){
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0 && sb.charAt(0) ==' '){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    private static String stripTrailing(String s){
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' '){
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();

    }
}
