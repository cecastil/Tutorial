package Orelly;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


public class addingElementsToAnArrayList {
    public static void main ( String [] args){

        List<String> cars = new ArrayList<>();
        cars.add("Porsche");
        cars.add("Ferrari");
        cars.add("Lamborghini");
        cars.add(1, "Aston Martin"); //Using add we can to add one element in the position that we wanna.

        for (String car:cars)
            System.out.println (car);
        //Using the remove() method, we can to eliminate one element in the list, using the element or the index.
        cars.remove("Ferrari");
        cars.forEach(System.out::println);

        cars.remove(1);
        cars.forEach(System.out::println);

        cars.set(0, "Skyline"); // Using set() method we can to add one element in the position that we want
        cars.forEach(System.out::println);

        System.out.println (cars.get(0)); // with get() method, we can to call one specific element that we want

        cars.clear(); //to eliminate all the elements of the arraylist
        cars.forEach(System.out::println);

        //To add all elements from one array to the other, we can use addAll method.
        //Additionally, notice that the List.of method return an immutable ist.

        List<String> italianCars = List.of("Lamborghini", "Ferrari", "Aston Martin");
        //italianCars.remove("Lamborghini"); //Here are a trick, The List.of returns an immutable List,
        //The list cannot be changed.

        List<String> globalCars = new ArrayList<>();
        globalCars.addAll(italianCars);
        globalCars.add("Porsche");
        globalCars.forEach(System.out::println);

        System.out.println ("CopyOnWriteArrayList Example");
        List<String> car = new CopyOnWriteArrayList<>();
        car.add("Porsche");
        car.add("Lamborghini");
        car.add("Aston Martin");
        car.add("Skyline");

        //The output from the for above is not the obvious. It will actually throw the ConcurrentModificationException
        //This happens because the behavior from an ArrayList is designed in a way to avoid concurrent modification
        //in the same List. If there are two processes or threads changing this same List, then the exception will
        //be throw. One solution for this problem is use the removeIf method to remove the elements, or use the
        //CopyOnWriteArrayList as an implementation from the List and then we can iterate over it and change as much
        //as we wish.

        for (String c:car){
            car.add("Rolls-Royce");
            car.remove(c);
        }

        car.forEach(System.out::println);

        //We could also use the filter method by making use os streams to filter only one element in the car list.
        System.out.println("Stream filter example");

        List<String> ca = new CopyOnWriteArrayList<>();
        ca.add("Porsche");
        ca.add("Lamborghini");
        ca.add("Aston Martin");
        ca.add("Skyline");

        List<String> selectcars = ca.stream()
                .filter(c -> ca.equals("Lamborghini"))
                .collect(Collectors.toList());


        ca.forEach(System.out::println);





    }
}
