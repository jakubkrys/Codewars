package pl.jakubkrys.codewars.kyu8;

import java.util.Arrays;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        for (int i = 0; i < humanYears; i++) {
            catYears = (i < 1? catYears+15 : (i < 2? catYears+9 : catYears+4));
            dogYears = (i < 1? dogYears+15 : (i < 2? dogYears+9 : dogYears+5));
        }
        return new int[]{humanYears,catYears,dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(15)));
    }
}