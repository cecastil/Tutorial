package Test;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> empty = Optional.of("hello");
        //Optional<Object> empty = Optional.ofNullable(null);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        String orElse = empty
                .map(String::toUpperCase)
                //.orElseGet(() -> {
                  //  return "world";
               // });
                .orElse("World");
        System.out.println(orElse);

        empty.ifPresentOrElse(System.out::println, () -> System.out.println("World"));

        Person person = new Person("james", "James@gmail.com");

        //String email = person
          //      .getEmail()
            //    .map(String::toLowerCase)
              //  .orElse("email not provide");

        //System.out.println(email);

        if (person.getEmail().isPresent()){
            String email = person.getEmail().get();
            System.out.println(email.toLowerCase());
        }else {
            System.out.println("email no provide");
        }
    }
}

class Person{
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
