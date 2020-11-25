package Orelly;

public class multipleVariablesWithArrays {
    public static void main (String[] args){

        int[] numbers = new int[5];

        double[] number = new double [3];
        number[0] = 1.0;
        number[1] = 2.0;
        number[2] = 3.0;

        System.out.println (number[0] + number[1] + number[2]);

        long[] num = new long[3];
        num [0] = 1L; // The letter L means that we are making a number explicitly as the long type
        num [1] = 2;
        num [2] = 3L;
        //If we try to assign one value into the array with bigger index that the array has, the compiler get us a
        //RuntimeException, because the index that we wanna is as bigger that the index of the array.
        System.out.println (num[0] + num[1] + num[2]);

        int[] anyArray = new int [3];
        anyArray [0] = 2;
        anyArray [1] = 4;
        anyArray [2] = 6;

        int[] otherArray = anyArray; //we are copy the direction of the variable in the memory heap, in such away that
        //the anyArray and otherArray take the same variables, if one changing the information, the other can to use
        // or see the modification.

        ArrayChallenge arrayChallenge = new ArrayChallenge();
        arrayChallenge.doSum(anyArray);
        arrayChallenge.doSum(otherArray); //we invoke two times the same method doSum into the same direction
        //memory heap, thus, we make change two times the same variable.

        for (int x= 0; x < anyArray.length; x++) {
            System.out.print(anyArray[x]);
        }
        }

        }




    class ArrayChallenge{
        void doSum(int[] anyArray){
            for( int i = 0; i < anyArray.length; i++){
                anyArray[i] = anyArray[i] + 2;
            }
        }
    }

