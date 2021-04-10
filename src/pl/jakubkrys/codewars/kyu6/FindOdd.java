package pl.jakubkrys.codewars.kyu6;

import java.util.*;

public class FindOdd {

    public static int findIt(int[] a) {
        List<Integer> arrayList = new ArrayList<>();
        int oddInteger = 0;

        for (Integer integer:a) {
            arrayList.add(integer);
        }

        for (Integer integer: arrayList){
            if (Collections.frequency(arrayList,integer)%2 != 0) {
                oddInteger = integer;
            }
        }
        return oddInteger;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }
}
