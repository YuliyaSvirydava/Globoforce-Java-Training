package com.globoforce.training.lec2;

public class Nominator {
    private String name;

    static {
        System.out.println("Loading of " + Nominator.class.getName() + " is completed.");
    }

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Nominee nominee, Award award) {
        nominee.receiveAward(award);
    }
}
