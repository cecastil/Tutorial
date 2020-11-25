package Orelly;

public class creatingAConstructor {
    public static void main ( String[] args){


        JavaMascot mascot = new JavaMascot("Astronaut Duke", 25);
        mascot.printState();
    }
    static class JavaMascot{
        String name;
        int age;

        JavaMascot (String name, int age){
            this.name = name;
            this.age = age;
        }
        void printState(){
            System.out.println ( "The name is " + name + " and the age is " + age);
        }
    }


}
