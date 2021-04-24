package pl.jakubkrys.codewars.kyu8;

import java.util.Arrays;

public class FirstNElements {

    public static int[] take(int[] arr, int n) {
        if (arr.length < 1){
            return new int[0];
        } else if (n >= arr.length){
            return Arrays.copyOfRange(arr,0,arr.length);
        } else {
            return Arrays.copyOfRange(arr,0,n);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));
    }
}