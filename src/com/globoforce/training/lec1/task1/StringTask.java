package com.globoforce.training.lec1.task1;

public class StringTask {
    public static void main(String args[]) {
        String str1 = "We make work HUMAN.";
        String str2 = "Unlock full potential. Celebrate positive moments.";
        String str3 = "Every day.";

        String nl = System.lineSeparator();
        String text = str1 + nl + str2 + nl + str3 + nl;

        System.out.println(text);
        System.out.println("Length of the second string is " + str2.length() + ".");
        System.out.println();

        System.out.println(text.toLowerCase());
        System.out.println(text.replace('e', 'E'));
    }
}
