package pl.jakubkrys.codewars.kyu6;

import java.util.*;

public class WhereIsMyParent {

    static String findChildren(final String text) {

        String result = "";
        String finalResult = "";

        List<String> textToSort = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            textToSort.add(i,(text.toLowerCase().substring(i,i+1)));
        }

        Collections.sort(textToSort);

        for (int i = 0; i < textToSort.size(); i++) {
            result += textToSort.get(i);
        }

        for (int i = 0; i < result.length(); i++) {
            if ((result.indexOf(result.substring(i,i+1)) == i)){
                finalResult += result.substring(i,i+1).toUpperCase();
            } else {
                finalResult += result.substring(i,i+1);
            }
        }

        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(findChildren("abBA"));
    }
}