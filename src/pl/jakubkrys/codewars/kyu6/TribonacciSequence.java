package pl.jakubkrys.codewars.kyu6;

import java.util.Arrays;

public class TribonacciSequence {
    public static double[] tribonacci(double[] s, int n) {
        double[] newTribonacci = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < s.length){
                newTribonacci[i] = s[i];
            } else {
                for (int j = 1; j <= s.length; j++) {
                    newTribonacci[i] += newTribonacci[i-j];
                }
            }
        }
        return newTribonacci;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{0,0,0,0,1}, 10)));
    }
}
