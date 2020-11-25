package JavaCodeGeeks;

import java.util.Comparator;

public class LambdaExpressions {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId(123);
        s1.setName("Cesar");

        Student s2 = new Student();
        s2.setId(321);
        s2.setName("Sam");

        Comparator<Student> byId = Comparator.comparing(Student::getId);
        System.out.println(byId);

    }



    public static class Student{
        private int id;
        private String name;

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

}
