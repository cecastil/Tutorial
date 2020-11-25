package School;

import java.util.*;
import java.util.stream.Collectors;

public class ClassSchool {
    public static void main(String[] args) {

        List<Person> student = getPeople();

        //Imperative approach
       // List<Person> female = new ArrayList<>();
        //for(Person person : student){
          //  if(Person.getGender().equals(Gender.FAMALE)){
            //    female.add(person);
            //}
        //}
        //female.forEach(System.out::println);

        //Declarative approach

        //Filter
        List<Person> females = student.stream()
                .filter(Person -> Person.getGender().equals(Gender.FAMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        //Sorted
        List<Person> sortedStudent = student.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList());
        sortedStudent.forEach(System.out::println);

        //allMatch
        Boolean allMatchStudent = student.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allMatchStudent);

        //anyMatch
        Boolean anyMatchStudent = student.stream()
                .anyMatch(person -> person.getAge() > 5);
        System.out.println(anyMatchStudent);

        //noneMatch
        Boolean noneMatchStudent = student.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        System.out.println(noneMatchStudent);

        //Max
        student.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        //Min
        student.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        //Group
        Map<Gender, List<Person>> groupingByGender = student.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupingByGender.forEach((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
            System.out.println();
        });

        Optional<String> oldestFemaleAge = student.stream()
                .filter(person -> person.getGender().equals(Gender.FAMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleAge.ifPresent(System.out::println);


    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FAMALE),
                new Person("Helen White", 57, Gender.FAMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.FAMALE),
                new Person("Anna Cook", 7, Gender.FAMALE),
                new Person("Zelda Brown", 120, Gender.FAMALE)
        );

    }
}
