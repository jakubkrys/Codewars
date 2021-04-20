package pl.jakubkrys.codewars.kyu7;

import java.util.*;

public class DecodeResistorColors {

    public static String decodeResistorColors(String bands) {

        String result = "";

        List<String> bandsCollection = new LinkedList<>(Arrays.asList(bands.split(" ")));

        Map<String, Integer> colours = new HashMap<>();
        colours.put("black", 0);
        colours.put("brown", 1);
        colours.put("red", 2);
        colours.put("orange", 3);
        colours.put("yellow", 4);
        colours.put("green", 5);
        colours.put("blue", 6);
        colours.put("violet", 7);
        colours.put("gray", 8);
        colours.put("white", 9);
        colours.put("silver", 10);
        colours.put("gold", 5);

        String cyfraOhmow = colours.get(bandsCollection.get(0)) +""+ colours.get(bandsCollection.get(1));
        double duzaCyfraOhmow = (Double.parseDouble(cyfraOhmow) * (Math.pow(10, (colours.get(bandsCollection.get(2))))));

        if (bandsCollection.size() < 4) {
            if (duzaCyfraOhmow < 1000) {
                result = ((int) duzaCyfraOhmow) + " ohms, 20%";
            } else if (duzaCyfraOhmow < 1000000) {
                if (duzaCyfraOhmow % 1000 != 0) {
                    result = (duzaCyfraOhmow / 1000) + "k ohms, 20%";
                } else {
                    result = ((int) duzaCyfraOhmow / 1000) + "k ohms, 20%";
                }
            } else {
                if (duzaCyfraOhmow % 1000000 != 0) {
                    result = (duzaCyfraOhmow / 1000000) + "M ohms, 20%";
                } else {
                    result = ((int) duzaCyfraOhmow / 1000000) + "M ohms, 20%";
                }
            }
        } else {
            if (duzaCyfraOhmow < 1000) {
                result = ((int) duzaCyfraOhmow) + " ohms, " + (colours.get(bandsCollection.get(3))) + "%";
            } else if (duzaCyfraOhmow < 1000000) {
                if (duzaCyfraOhmow % 1000 != 0) {
                    result = (duzaCyfraOhmow / 1000) + "k ohms, " + (colours.get(bandsCollection.get(3))) + "%";
                } else {
                    result = ((int) duzaCyfraOhmow / 1000) + "k ohms, " + (colours.get(bandsCollection.get(3))) + "%";
                }
            } else {
                if (duzaCyfraOhmow % 1000000 != 0) {
                    result = (duzaCyfraOhmow / 1000000) + "M ohms, " + (colours.get(bandsCollection.get(3))) + "%";
                } else {
                    result = ((int) duzaCyfraOhmow / 1000000) + "M ohms, " + (colours.get(bandsCollection.get(3))) + "%";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decodeResistorColors("blue gray brown"));
    }
}