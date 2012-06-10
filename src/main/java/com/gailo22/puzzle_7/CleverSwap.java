package com.gailo22.puzzle_7;

public class CleverSwap {
    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y); //x = 0; y = 1984
    }
}
