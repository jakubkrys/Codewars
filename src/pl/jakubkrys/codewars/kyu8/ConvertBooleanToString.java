package pl.jakubkrys.codewars.kyu8;

public class ConvertBooleanToString {
    public static String convert(boolean b) {

        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {

        System.out.println(convert(1 == 0));
    }
}
