package Orelly;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortStringElementsFromAnArrayList {
    public static void main (String[] args){

        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("wolf");
        animals.add("Bear");
        animals.add("Polar bear");
        animals.add("Eagle");
        animals.add("Elephant");

        //Using sort method of collections class
        Collections.sort(animals);
        animals.forEach(System.out::println);

        Collections.reverse(animals);//reverse method does exactly what is saying.
        Collections.reverse(animals);

        System.out.println(Collections.min(animals));//min method return the element that comes first in alphabetical order
        System.out.println(Collections.max(animals));//max method return the elements that comes last in alphabetical order

        animals.forEach(System.out::println);

        //Using a comparator
        System.out.println("Using a comparator...");
        animals.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        animals.forEach(System.out::println);

        //Using lambda expression
        animals.sort((s1, s2) -> s1.length() - s2.length());
        animals.forEach(System.out::println);

        //Using reference method
        animals.sort(Comparator.comparingInt(String::length));
        animals.forEach(System.out::println);

        //If we wanna just sort the String elements to the lexicographic order...

        animals.sort(String::compareTo);
        animals.forEach(System.out::println);
    }
}
