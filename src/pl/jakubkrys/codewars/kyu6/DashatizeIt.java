package pl.jakubkrys.codewars.kyu6;

public class DashatizeIt {

    public static String dashatize(int num) {

        String result = "";
        String stringTab = "";

        if (String.valueOf(num).charAt(0) == '-'){
            stringTab = String.valueOf(num).substring(1);
        } else {
            stringTab = String.valueOf(num);
        }

        String[] numTab = stringTab.split("");

        for (int i = 0; i < numTab.length; i++) {
            if (i < 1) {
                result += numTab[i];
            } else {
                if ((Integer.parseInt(numTab[i]) % 2) != 0 || (Integer.parseInt(numTab[i]) % 2) == 0 && (Integer.parseInt(numTab[i-1]) % 2) != 0) {
                    result += "-"+numTab[i];
                } else {
                    result += numTab[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(dashatize(Integer.MIN_VALUE));
    }
}