package Orelly;

public class loop {
    public static void main (String [] args){
        for ( int x=5; x>=0; x-- ){
            System.out.println (x);
        }
        int counter = 0;
        while(counter<=2){
            counter = counter+1;
            System.out.println (counter);
        }
        do{
            System.out.println (counter);
        }while (counter <=2);
    }
}
