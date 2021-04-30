package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Set<Integer> ints = new TreeSet<>();
        for(int i = 0; i < args.length; i++){
            ints.add(args[i]);
        }

        return Collections.min(ints);
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78,56,232,12,11,43}));
    }
}
