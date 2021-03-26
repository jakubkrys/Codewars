package pl.jakubkrys.codewars.kyu6;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        byte[] b = text.toUpperCase().getBytes();
        int index = 0;
        int finalIndex = 0;

        for (int i = 32; i <= 126; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == i){
                    index++;
                }
            }
            if (index > 1){
                finalIndex++;
            }
            index = 0;
        }

        return finalIndex;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abba11223344"));
    }
}