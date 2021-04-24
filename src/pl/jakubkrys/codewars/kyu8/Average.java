package pl.jakubkrys.codewars.kyu8;

import java.util.Arrays;

public class Average {
    public static double find_average(int[] array){
        return (Arrays.stream(array).sum())/(double)array.length;
    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15}));
    }
}