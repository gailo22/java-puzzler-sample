package com.gailo22.puzzle_1;

public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1; // cannot handle int negative value
        // fixed:
        // return i %2 !=0;
        // return (i & 1) != 0;
    }

    public static void main(String[] args) {
    	System.out.println(isOdd(-3)); // false
    }
}
