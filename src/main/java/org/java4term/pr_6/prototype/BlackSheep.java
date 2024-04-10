package org.java4term.pr_6.prototype;

public class BlackSheep implements Sheep{
    private String name;

    public BlackSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new BlackSheep(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
