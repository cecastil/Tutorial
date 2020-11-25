import javax.swing.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.stream.*;

public class Main {
    public static void main (String[] args){
        //LinkedList is similar to ArrayList, both are list, and have the same methods. One difference between
        //is that LinkedList can to remove the first, middle and final element.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0, 2);
        list.add(1, 15);
        list.add(2, 6);
        list.add(3, 1);
        list.add(4, 23);
        list.add(5, 20);
        list.add(6, 25);
        list.add(7, 9);
        list.add(8, 13);
        list.add(9, 18);
    //This is a ForEach, used to print all elements of the list
        for (Integer x:list) {
            System.out.println(x);
        }
        System.out.println("");
    //The stream is a one powerful tool, below you can watch two methods of stream, sorted (for numbers, strings)
        //and forEach (loops)
        Stream s1= list.stream();
        s1.sorted().forEach(x->System.out.println(x));

        System.out.println("");

        //With this small method I become the LinkedList into Array
        int [] array = new int[list.toArray().length];

        for(int x=0; x<list.toArray().length; x++){
            array[x]= list.get(x);
        }

        for (Integer i:array) {
            System.out.println(i);
        }
        System.out.println("");
        int highest= Method.findHighestNumber(array);

        System.out.println("The highest number is "+highest);

        System.out.println("");
        int smallest= Method.findSmallestNumber(array);

        System.out.println("The smallest number is "+smallest);






    }
}
