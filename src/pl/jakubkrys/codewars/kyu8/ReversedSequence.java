package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class ReversedSequence {

    public static int[] reverse(int n){

        int[] result = new int[n];
        int index = n;
        for (int i = 0; i < n ; i++) {
            result[i] = index;
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(50)));
    }
}