package pl.jakubkrys.codewars.kyu4;

import java.util.*;

public class Mixing {
    public static String mix(String s1, String s2) {
        String[] s1Split = s1.split("");
        String[] s2Split = s2.split("");
        String result = "";
        String finalResult = "";

        List<String> list1 = new ArrayList<>(Arrays.asList(s1Split));
        List<String> list2 = new ArrayList<>(Arrays.asList(s2Split));

        for (int i = 97; i <= 122; i++) {
            char l = (char)i;
            String letter = Character.toString(l);
            if(((Collections.frequency(list1, letter)) > (Collections.frequency(list2, letter))) && (Collections.frequency(list1, letter)) > 1){
                result += "1:"+ multipleLetterFromList1(list1, letter)+"/";
            } else if (((Collections.frequency(list1, letter)) < (Collections.frequency(list2, letter))) && (Collections.frequency(list2, letter)) > 1){
                result += "2:"+ multipleLetterFromList2(list2, letter)+"/";
            } else if (((Collections.frequency(list1, letter)) == (Collections.frequency(list2, letter)))&& (Collections.frequency(list1, letter)) > 1){
                result += "=:"+(multipleLetterFromList1(list1, letter))+"/";
            }
        }

        String[] resultTable = result.split("/");
        for (int j = 0; j < resultTable.length; j++) {
            for (int i = 0; i < resultTable.length-1; i++) {
                if (resultTable[i].length() < resultTable[i+1].length()){
                    String tmp = resultTable[i];
                    resultTable[i] = resultTable[i+1];
                    resultTable[i+1] = tmp;
                } else if (resultTable[i].length() == resultTable[i+1].length() && resultTable[i].substring(0,1).contains("=") && !resultTable[i+1].substring(0,1).contains("=")){
                    String tmp = resultTable[i];
                    resultTable[i] = resultTable[i+1];
                    resultTable[i+1] = tmp;
                } else if (resultTable[i].length() == resultTable[i+1].length() && resultTable[i].substring(0,1).contains("2") && resultTable[i+1].substring(0,1).contains("1")){
                    String tmp = resultTable[i];
                    resultTable[i] = resultTable[i+1];
                    resultTable[i+1] = tmp;
                }
            }
        }

        for (int i = 0; i < resultTable.length; i++) {
            if (i < resultTable.length -1){
                finalResult += resultTable[i]+"/";
            } else {
                finalResult += resultTable[i];
            }
        }

        return finalResult;
    }

    private static String multipleLetterFromList2(List<String> list2, String letter) {
        String multipleLetter = "";
        for (int i = 0; i < (Collections.frequency(list2, letter)); i++) {
            multipleLetter += letter;
        }
        return multipleLetter;
    }

    private static String multipleLetterFromList1(List<String> list1, String letter) {
        String multipleLetter = "";
        for (int i = 0; i < (Collections.frequency(list1, letter)); i++) {
            multipleLetter += letter;
        }
        return multipleLetter;
    }

    public static void main(String[] args) {
        System.out.println(mix("my&friend&Paul has heavy hats! &","my friend John has many many friends &"));
    }
}