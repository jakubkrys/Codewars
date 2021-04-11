package pl.jakubkrys.codewars.kyu6;

public class HighestScoringWord {

    public static String high(String s) {
        String[] words = s.split(" ");
        int maxSum = 0;
        String maxWord = "";

        for (int i = 0; i < words.length; i++) {
            byte[] numbers = words[i].getBytes();
            int sum = 0;
            for (Byte b:numbers) {
                sum += (b-96);
                }
            if (sum > maxSum){
                maxSum = sum;
                maxWord = words[i];
            }
        }
        return maxWord;
    }

    public static void main(String[] args) {
        System.out.println(high("take me to semynak"));
    }
}