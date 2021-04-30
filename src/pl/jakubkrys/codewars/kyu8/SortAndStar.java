package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class SortAndStar {
    public static String twoSort(String[] s) {
        String result = "";

        Set<String> words = new TreeSet<>();
        for (int i = 0; i < s.length; i++) {
            words.add(s[i]);
        }

        String[] smallWord = Collections.min(words).split("");
        for (int i = 0; i < smallWord.length; i++) {
            if (i == smallWord.length -1){
                result += smallWord[i];
            } else {
                result += smallWord[i]+"***";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }
}
