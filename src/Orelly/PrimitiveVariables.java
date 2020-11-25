package Orelly;

public class PrimitiveVariables {
    public static void main ( String[] args){
        boolean isLincolnTall = true;
        boolean isNapoleonTall = false;
        char firstNameLetter = 'L';
        short lincolnAge = 56;
        double lincolnHeight = 193D;
        System.out.println (isLincolnTall && isNapoleonTall);
        System.out.println (firstNameLetter + lincolnAge + lincolnHeight);

        //This ir a casting implicit, this type of casting isn't recommended, because we will can to loose
        //information.
        short shortNumber = 5;
        int intNumber = shortNumber;
        System.out.println(intNumber);

        int inNumber = 7;
        short shorTNumber = (short) inNumber;
        System.out.println (shorTNumber);
    }
}
