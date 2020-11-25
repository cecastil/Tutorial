package Test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {

        ArrayList<Integer> serial = new ArrayList<>();
        for(int x=0; x<10; x++){
            serial.add(x);
        }
        ArrayList<String> names = new ArrayList<>();
            names.add("Cesar");
            names.add("anahi");
            names.add("Samuel");
            names.add("Carlos");
            names.add("Victoria");
            names.add("Juan");
            names.add("Teresita");


        List<String> namestream = names.stream()
                .map(c -> c.replaceFirst("C","A"))
                .collect(Collectors.toList());


            List<String> names1 = names.stream()
                    .filter(x -> x.startsWith("C"))
                    .collect(Collectors.toList());

            System.out.println("Without changes");
            names.forEach(System.out::println);
            System.out.println("With filter");
            names1.forEach(System.out::println);
            System.out.println("With map");
            namestream.forEach(System.out::println);
    }
}
