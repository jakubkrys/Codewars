package pl.jakubkrys.codewars.kyu6;

import java.util.Arrays;

public class Xbonacci {
    public static double[] xbonacci(double[] signature, int n) {
        double[] newXbonacci = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < signature.length){
                newXbonacci[i] = signature[i];
            } else {
                for (int j = 1; j <= signature.length; j++) {
                    newXbonacci[i] += newXbonacci[i-j];
                }
            }
        }
        return newXbonacci;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(xbonacci(new double[]{0,0,0,0,1}, 10)));
    }
}
