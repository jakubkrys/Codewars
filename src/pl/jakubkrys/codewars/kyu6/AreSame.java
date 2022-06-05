package pl.jakubkrys.codewars.kyu6;

import java.util.*;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        int tmp = 0;

        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) Math.pow(a[i], 2);
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length-1; j++) {
                    if (a[j] > a[j+1]){
                        tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }
            }

            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b.length-1; j++) {
                    if (b[j] > b[j+1]){
                        tmp = b[j];
                        b[j] = b[j+1];
                        b[j+1] = tmp;
                    }
                }
            }

            return Arrays.equals(a, b);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a,b));
    }
}