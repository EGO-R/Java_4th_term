package org.java4term.pr_2;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
@Builder
public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;



}
