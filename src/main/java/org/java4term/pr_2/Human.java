package org.java4term.pr_2;

import lombok.*;

import java.time.LocalDate;
@Builder
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;



}
