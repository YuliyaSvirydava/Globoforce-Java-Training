package com.globoforce.training.lec2;

public class Award {
    private final int value;

    static {
        System.out.println("Loading of " + Award.class.getName() + " is completed.");
    }

    public Award(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
