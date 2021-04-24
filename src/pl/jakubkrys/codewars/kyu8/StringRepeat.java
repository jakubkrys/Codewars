package pl.jakubkrys.codewars.kyu8;

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Hello"));
    }
}
