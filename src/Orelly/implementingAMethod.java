package Orelly;

public class implementingAMethod {
    public static void main ( String [] args){

        class JavaMascot {
            String name;
            void printName(){
                System.out.println ("The challenger need to print Juggy, but I prefer "+name);
            }
        }

        JavaMascot mascot = new JavaMascot();
        mascot.name = "cesar";
        mascot.printName();
    }
}
