package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class Pipes {

    public static int[] pipeFix(int[] numbers) {
        
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = numbers[0]; i <= numbers[numbers.length-1] ; i++) {
            listNumbers.add(i);
        }

        int[] result = new int[listNumbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = listNumbers.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{-1, 1, 2, 3, 5, 6, 8, 9})));
    }
}