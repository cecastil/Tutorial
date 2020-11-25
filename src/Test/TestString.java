package Test;

public class TestString {
    public static void main(String[] args) {

        String name = "Cesar";
        String name1 = "Anahi";
        System.out.println(name);

        System.out.println("my name is ".concat("Cesar"));

        if(name.startsWith("C")) {
            System.out.println("The name is: " + name);
        }else if (name.startsWith("c")){
            name.replace("cesar","Cesar");
            System.out.println("The name was replacement "+name);
        }

        Boolean t = name.endsWith("r");
        boolean r = name.contentEquals("ces");
        boolean s = name.contains("er");
        boolean m = name.matches("cesar");
        boolean re = name.regionMatches(true,0,name1, 2,0);
        String  res = name.replaceFirst("ana", "Ces");
        System.out.println("The name endswith s? "+ t +" The name contains ar? " + r);


        System.out.println(s);
        System.out.println(m);
        System.out.println(re);
        System.out.println(res);
    }
}
