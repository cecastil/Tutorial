package Orelly;

import org.w3c.dom.xpath.XPathResult;

import java.util.Optional;
public class CheckWhetherAValueIsEmptyInOptional {
    public static void main(String[] args) {

        String payDay = null;

        System.out.println("Is value 'null' present? " + Optional.ofNullable(payDay).isPresent());

        System.out.println("Is value 'null' not present? " + !Optional.ofNullable(payDay).isPresent());

        System.out.println("Is value 'null' empty? " + Optional.ofNullable(payDay).isEmpty());

        payDay = "Monday";

        System.out.println("Is value 'Monday' not present? " + !Optional.ofNullable(payDay).isPresent());

        System.out.println("Is value 'Monday' empty? " + Optional.ofNullable(payDay).isEmpty());



    }
}
