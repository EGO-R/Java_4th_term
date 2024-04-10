package org.java4term.pr_6.builder;

public class HumanRunner {
    public static void main(String[] args) {
        var human = Human.builder()
                .firstName("Ryan")
                .lastName("Gosling")
                .age(43)
                .height(1.84)
                .build();

        System.out.println(human);
    }
}
