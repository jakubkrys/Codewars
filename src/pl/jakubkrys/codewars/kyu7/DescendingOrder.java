package pl.jakubkrys.codewars.kyu7;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        char[] numTab = Integer.toString(num).toCharArray();

        for (int i = 0; i < numTab.length - 1; i++) {
            for (int j = 0; j < numTab.length - 1; j++) {
                if (numTab[j] < numTab[j + 1]) {
                    char tmp = numTab[j];
                    numTab[j] = numTab[j + 1];
                    numTab[j + 1] = tmp;
                }
            }
        }
        return Integer.parseInt(String.copyValueOf(numTab));
    }


    public static void main(String[] args) {
        System.out.println(sortDesc(12345));
    }
}