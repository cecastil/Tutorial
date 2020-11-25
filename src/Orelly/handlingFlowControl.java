package Orelly;

public class handlingFlowControl {
     public static void main (String [] args){
        int counter = 0;
        //When we use && operator, we need to the condition will be false
        if ( counter++ > 0 && counter++ == 2){
            counter++;
        }
        counter++;
        //When we use the || condition, we need to the condition will be true
        if ( counter++ == 2 || --counter == 2){
            counter--;
        }
    System.out.println("The value of counter is "+counter);

        String character = "Homer";

        //In the Switch we need to use the 'break' keyword, because withing the break,
         //all the cases will be executed.
        switch (character){
            case "Homer":
                System.out.println ("The Simpsons");
                character = "Cartman";
            break;
            case "Cartman":
                System.out.println ("South Park");
                break;
            case "Heiserberg":
                System.out.println ("Breaking Bad");
                break;
            default:
            System.out.println ("None of the options");
        }
    }

}
