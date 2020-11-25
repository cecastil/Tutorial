package Orelly;

public class localVariableScope {
    public static void main ( String[] args ){
        int localDuke = 1;


        for (int i=0; i <= 11; i++){

            if ( i < localDuke ){
                System.out.println ( i );
                localDuke++;
            }
        }
    }
}
