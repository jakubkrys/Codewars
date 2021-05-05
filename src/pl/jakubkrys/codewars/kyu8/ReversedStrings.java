package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class ReversedStrings {

    public static String solution(String str) {
        List<String> strList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            strList.add(str.substring(i,i+1));
        }
        Collections.reverse(strList);
        StringBuilder result = new StringBuilder();

        for (String s : strList) {
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
}