package pl.jakubkrys.codewars.kyu8;

import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        String divideable = "";

        for (int i = 0; i <numbers.length; i++){
            if (numbers[i]%divider == 0){
                divideable += String.valueOf(numbers[i])+",";
            }
        }
        String[] divideableString = divideable.split(",");
        int[] divideableTable = new int[divideableString.length];
        for (int i = 0; i < divideableTable.length; i++) {
            divideableTable[i] = Integer.parseInt(divideableString[i]);
        }
        System.out.println(Arrays.toString(divideableTable));
        return divideableTable;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{82, 7, 32, 52, 96, 2, 5, 84, 56, 0, 98, 8, 14, 78, 72, 66, 83, 63, 87, 5, 26, 87, 67, 50, 61, 77, 29, 52, 29, 98, 45, 59, 3, 61, 74, 10, 51, 81, 29, 19, 31, 4, 35, 35, 37, 70, 98, 51, 51, 93, 72, 17, 56, 9, 3, 97, 76, 35, 5, 85, 56, 88, 48, 79, 68, 28, 51, 54, 74, 4, 3, 31, 27, 1, 12, 15, 54, 71, 48, 14, 9, 2, 90, 91, 57, 33, 97, 23, 86, 49, 52, 32, 27, 0, 98, 27, 88, 47, 35, 34}, 2)));
    }
}