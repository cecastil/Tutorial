import java.util.LinkedList;

public class Method {

    //When we want to create a method, it is necessary to created inside to a class, remember the definition of method
//A method is a set of instructions that are associated with a class
static int findHighestNumber(int [] array){
    int highestNumber = array [0];
    for (int x=0; x< array.length; x++){
        if (highestNumber<array[x]){
            highestNumber=array[x];
        }
    }
return highestNumber;
}

    static int findSmallestNumber(int[] array) {
        int smallestNumber = array[0];
        for (int x = 0; x < array.length; x++) {
            if (smallestNumber > array[x]) {
                smallestNumber = array[x];
            }
        }
        return smallestNumber;
    }
}
