package org.java4term.pr_6.prototype;

public class WhiteSheep implements Sheep {
    private String name;

    public WhiteSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new WhiteSheep(this.name);
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
