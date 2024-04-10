package org.java4term.pr_6.builder;

import lombok.ToString;

@ToString
public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private double height;
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder height(double height) {
            this.height = height;
            return this;
        }
        public Human build() {
            var human = new Human();
            human.firstName = this.firstName;
            human.lastName = this.lastName;
            human.age = this.age;
            human.height = this.height;
            return human;
        }
    }
}
