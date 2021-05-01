package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class MixedSum {

    public static int sum(List<?> mixed) {
        int result = 0;
        for (int i = 0; i < mixed.size(); i++) {
            try {
                result += (Integer)mixed.get(i);
            } catch (ClassCastException e) {
                result += Integer.parseInt((String) mixed.get(i));
            }
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }
}
