package ThinkLikeAProgrammer;

public class HalfOfASquare {
    public static void main(String[] args) {

        //Program that uses only two statements to produce a pattern of hash symbols
        int count =5;
        for(int x=0; x<5; x++){
            for (int y=0; y<count; y++)
            System.out.print("#");
            System.out.println("");
            count--;
        }
        System.out.println("");
        for(int x=0; x<5; x++){
            for (int y=0; y<5; y++)
                System.out.print("#");
            System.out.println("");

        }
        System.out.println("");
        for(int x=0; x<5; x++){
                System.out.print("#");
            System.out.println("");

        }
    }
}
