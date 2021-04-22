package pl.jakubkrys.codewars.kyu5;

import java.util.*;

public class EncodeResistorColors {
    public static String encodeResistorColors(String ohmsString) {

        String[] ohmsStringTable = ohmsString.split(" ");
        String ohmsValue = ohmsStringTable[0];
        String result = "";
        int ohmsDoubleValue;
        int index;
        int zeroIndex = 0;

        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(0,"black");
        numbers.put(1,"brown");
        numbers.put(2,"red");
        numbers.put(3,"orange");
        numbers.put(4,"yellow");
        numbers.put(5,"green");
        numbers.put(6,"blue");
        numbers.put(7,"violet");
        numbers.put(8,"gray");
        numbers.put(9,"white");
        numbers.put(10,"gold");

        String[] ohmsValueTable = ohmsValue.split("");
        if (ohmsValueTable[ohmsValueTable.length-1].equals("k")){
            ohmsDoubleValue = (int) ((Double.parseDouble(ohmsValue.substring(0,ohmsValue.length()-1)))*1000);
        } else if (ohmsValueTable[ohmsValueTable.length-1].equals("M")){
            ohmsDoubleValue = (int) ((Double.parseDouble(ohmsValue.substring(0,ohmsValue.length()-1)))*1000000);
        } else {
            ohmsDoubleValue = (int) Double.parseDouble(ohmsValue);
        }

        if (String.valueOf(ohmsDoubleValue).length() < 3){
            for (int i = 0; i < 2; i++) {
                index = Integer.parseInt(String.valueOf(ohmsDoubleValue).substring(i,i+1));
                result += numbers.get(index)+" ";
            }
            result += numbers.get(0)+" ";
        } else {
            for (int i = 0; i < 2; i++) {
                index = Integer.parseInt(String.valueOf(ohmsDoubleValue).substring(i,i+1));
                result += numbers.get(index)+" ";
            }

            for (int i = 2; i < String.valueOf((int)ohmsDoubleValue).length(); i++) {
                zeroIndex++;
            }
            result += numbers.get(zeroIndex)+" ";
        }

        result += numbers.get(10);
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(encodeResistorColors("88M ohms"));
//        System.out.println(encodeResistorColors("490M ohms"));
//        System.out.println(encodeResistorColors("700 ohms"));
//        System.out.println(encodeResistorColors("950 ohms"));
        System.out.println(encodeResistorColors("4.1M ohms"));
    }
}