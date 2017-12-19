package com.globoforce.training.lec1.task2;

public class ArrayTask {
    public static void main(String args[]) {
        char[] gfCharArray = {'G', 'l', 'o', 'b', 'o', 'f', 'o', 'r', 'c', 'e'};
        String gfStr = new String(gfCharArray);
        System.out.println("Char array is: " + gfStr);
        System.out.println("Char array length is: " + gfCharArray.length);

        // b->$ replacement (variant1)
        gfCharArray[3] = '$';
        gfStr = new String(gfCharArray);
        System.out.println(gfStr.toCharArray());

        // b->$ replacement (variant2)
        gfStr = gfStr.replace('b', '$');
        System.out.println("Changed string is: " + gfStr);
    }
}

