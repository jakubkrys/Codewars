package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        List<Integer> allInts = new ArrayList<>();
        for (int i = a; i <= b ; i++) {
            allInts.add(i);
        }

        int[] ints = new int[allInts.size()];
        for (int i = 0; i < allInts.size() ; i++) {
            ints[i] = allInts.get(i);
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(-8, 9)));
    }
}
