package Orelly;

public class manipulatingAnInstance {
    public static void main ( String[] args){

        class JavaMascot{
            String name;
            int age;
        }
        JavaMascot mascot = new JavaMascot();
        mascot.age = 50;
        mascot.name = "cesar";
        // We are pointing the same instance with different variables, because we are store the information in the
        // same location of the memory heap.
        JavaMascot anothermascot = mascot;

        JavaMascot samemascot = anothermascot;

        System.out.println (anothermascot.name + mascot.name + samemascot.name);

    }
}
