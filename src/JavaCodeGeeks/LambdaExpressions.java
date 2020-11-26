package JavaCodeGeeks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {
    public static void main(String[] args) {

        Student s1 = new Student(123,"Cesar");

        Student s2 = new Student(321,"Samuel");

        List<Student> students = getStudent();

        Comparator<Student> byId = Comparator.comparing(Student::getId);
        System.out.println(byId);

        //Anonymous class
        //Runnable runnable = new Runnable() {
        //  @Override
        //public void run() {
        //  System.out.println("Anonymous class implementation");
        //}
        //};

        //Lambda Expression

        //Runnable runnable = () -> System.out.println("Lambda Expression implementation");

        RunnableInstance runnableInstance = new RunnableInstance();
        runnableInstance.doSomething(() -> System.out.println("Lambda Expression implementation")); //Without runnable...

        //Parallel programming with Lambda Expression

        List<String> names = students.stream()
                .map(s -> s.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        names.forEach(System.out::println);

        //Counting Odd IDs

        long count = 0;
        for(Student s: students){
            if (s.getId() % 2 == 1){
                count++;
            }
        }
        System.out.println(count);

        //With Lambda Expression

        long counts = students.stream()
                .filter(s -> s.getId() % 2 ==1)
                .count();
        System.out.println(counts);

    }



    public static class Student{
        private int id;
        private String name;
        public Student (int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    //
    //Lambda Expression vs Anonymous Class
    //

    public static class RunnableInstance{
        public  void doSomething (Runnable runnable){
            runnable.run();
        }
    }

    private static List<Student> getStudent(){
        return List.of(
                new Student(159,"Isaac"),
                new Student(456, "Luis"),
                new Student(852, "Rocio"),
                new Student(951,"Anaheim"),
                new Student(753, "Rodrigo"),
                new Student(357, "Samuel"),
                new Student(654, "Elizabeth")
        );
    }


}
