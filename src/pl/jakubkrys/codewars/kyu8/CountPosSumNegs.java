package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class CountPosSumNegs {

    public static int[] countPositivesSumNegatives(int[] input) {

        int positives = 0;
        int negatives = 0;
        try {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    positives++;
                } else {
                    negatives += input[i];
                }
            }

            if (input.length != 0) {
                return new int[]{positives, negatives}; //return an array with count of positives and sum of negatives
            } else {
                return new int[]{};
            }
        } catch (NullPointerException e) {
            return new int[]{};
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
    }
}