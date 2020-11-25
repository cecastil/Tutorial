package Orelly;

public class ReturningValueFromAMethod {
    public static void main(String[] args) {

        JavaMascot mascot = new JavaMascot();
        mascot.name = "Juggy";
        mascot.age = 50;
        System.out.println(mascot.getName() +" "+ mascot.getAge());
    }

    static class JavaMascot{
        String name;
        int age;

        String getName(){
            return name;
        }
        int getAge(){
            return age;
        }
    }

}
