package HackerRank;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int  sockMerchant(int[] art) {
        int cont = 0;

        for (int x = 1; x < art.length; x++) {
                if (art[x - 1] == art[x]) {
                        cont++;
                }


        }


        // Predicate<Integer> fil = i -> i%2 ==0;
        //Integer list = Arrays.stream(Arrays.stream(art)
        //       .toArray())
        //       .collect(Collectors.filtering(fil));
        return cont;
    }


        public static void main (String[]args){
            //Method to obtain a pair

            int[] art = {1, 1, 4, 3,1, 4, 5, 1, 1};

            for (int x=0; x<art.length; x++){
                System.out.println(art[x]);
            }
            int pair = sockMerchant(art);
            System.out.println("The number of pairs is: " + pair);


        }
    }


