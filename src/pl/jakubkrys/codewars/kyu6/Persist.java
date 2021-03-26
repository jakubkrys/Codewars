package pl.jakubkrys.codewars.kyu6;

public class Persist {
    public static int persistence(long n) {
        String m = Long.toString(n);
        int index = 0;
        int result = 1;

        while (m.length() > 1) {
            for (int i = 0; i < m.length(); i++) {
                result *= Integer.parseInt(m.substring(i, i + 1));
            }
            m = Integer.toString(result);
            index++;
            result = 1;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }
}
