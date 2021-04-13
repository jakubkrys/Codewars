package pl.jakubkrys.codewars.kyu7;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] table = numbers.split(" ");
        for (int i = 0; i < table.length-1; i++) {
            for (int j = 0; j < table.length-1; j++) {
                if (Integer.parseInt(table[j]) < Integer.parseInt(table[j+1])) {
                    String tmp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = tmp;
                }
            }
        }
        return table[0]+" "+table[table.length-1];
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
