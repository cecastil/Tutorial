package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class HighestAndLowest {
    public static void main(String[] args) {
        String number = ("8 3 -5 42 -1 0 0 -9 4 7 4 -4");

        String resolve = highAndLow(number);
        System.out.println(resolve);


    }

    public static String highAndLow (String numbers){
        List<Integer> intArray = new ArrayList<>();
        int count = 0;
        int size = numbers.length();
        //intArray.add();


        for(int x=0; x< size; x++){
            if( x%2 == 0){
                intArray.add(x);
            }
        }
        int highestNumber = intArray.get(0);
        for(int y=1; y< intArray.size(); y++){
            if (highestNumber < intArray.get(y)){
                highestNumber = intArray.get(y);
            }

        }
        int lowestNumber = intArray.get(0);
        for(int z=1; z<intArray.size(); z++){
            if (lowestNumber>intArray.get(z)){
                lowestNumber = intArray.get(z);
            }
        }



        return "cesar";

    }
}
