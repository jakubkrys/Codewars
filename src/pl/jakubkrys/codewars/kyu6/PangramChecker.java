package pl.jakubkrys.codewars.kyu6;

public class PangramChecker {

    public static boolean check(String sentence){
        byte[] sentenceToTable = sentence.toUpperCase().getBytes();
        int index = 0;

        // counting
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < sentenceToTable.length; j++) {
                if (sentenceToTable[j] == i) {
                    index++;
                    break;
                }
            }
        }
        return index == 26;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }
}