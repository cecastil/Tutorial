package Orelly;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DefineFilteringNegationForPredicate {
    public static void main(String[] args) {

        List<String> months =
                List.of("January", "February", "March");
        List<String> filteredMonths = months.stream()
                .filter(Predicate.not(month -> month.startsWith("M")))
                .collect(Collectors.toList());

        System.out.println("Original months: " + months);
        System.out.println("Any months not starting with the letter 'M': " + filteredMonths);

    }
}
