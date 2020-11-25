package Orelly;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertACollectionIntoAnArray {
    public static void main(String[] args) {

        ArrayList<String> monthCollection = new ArrayList<>();

        monthCollection.add("January");
        monthCollection.add("February");
        monthCollection.add("March");
        monthCollection.forEach(System.out::println);

        String[] monthArray = monthCollection.toArray(String[]::new);
        System.out.println(Arrays.toString(monthArray));

        System.out.println("Type (before): " + monthCollection.getClass());
        System.out.println("size (before): " + monthCollection.size());
        System.out.println("Type (after): " + monthArray.getClass());
        System.out.println("Type (after): " + monthArray.length);
    }
}
