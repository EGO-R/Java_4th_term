package org.java4term.pr_2;

import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Stream;

public class HumanRunner {
    public static void main(String[] args) {
        double result = Stream.of(new Human(1, "Charles", "Darwin", LocalDate.of(1809, 2, 12), 75),
                        new Human(30, "Edwin", "Hubble", LocalDate.of(1889, 11, 20), 75),
                        new Human(40, "Stephen", "Hawking", LocalDate.of(1942, 1, 8), 75))

                .peek(human -> System.out.println("\nCreating:"))
                .peek(System.out::println)

                .filter(human -> human.getAge() > 20)

                .peek(human -> System.out.println("\nFiltering:"))
                .peek(System.out::println)

                .sorted(Comparator.comparingInt(h -> h.getFirstName().charAt(h.getFirstName().length() - 1)))

                .peek(human -> System.out.println("\nSorting:"))
                .peek(System.out::println)

                .mapToInt(Human::getAge)

                .peek(human -> System.out.println("\nGetting ages:"))
                .peek(System.out::println)

                .map(age -> age += 3)

                .peek(human -> System.out.println("\nIncreasing ages:"))
                .peek(System.out::println)

                .summaryStatistics()
                .getAverage();

        System.out.println("Result: " + result);
    }
}
