package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i]%i==0){
                result.add(array[i]);
            }
        }

        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }

        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68})));
    }
}