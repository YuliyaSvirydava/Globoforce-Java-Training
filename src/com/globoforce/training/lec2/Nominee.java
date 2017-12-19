package com.globoforce.training.lec2;

public class Nominee {
    private String name;

    static {
        System.out.println("Loading of " + Nominee.class.getName() + " is completed.");
    }

    public Nominee(String name) {
        this.name = name;
    }

    public void receiveAward(Award award) {
        System.out.println("Nominee " + name + " has received an award of " + award.getValue() + ".");
    }
}
