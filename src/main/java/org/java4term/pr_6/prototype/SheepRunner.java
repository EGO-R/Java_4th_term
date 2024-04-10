package org.java4term.pr_6.prototype;

public class SheepRunner {
    public static void main(String[] args) {
        Sheep blackSheep = new BlackSheep("Darkness");
        Sheep whiteSheep = new WhiteSheep("Light");

        var clonedBlackSheep = blackSheep.clone();
        var clonedWhiteSheep = whiteSheep.clone();

        clonedBlackSheep.setName("NewDarkness");
        clonedWhiteSheep.setName("NewLight");
    }
}
