package pl.jakubkrys.codewars.kyu8;

public class AllStarCodeChallenge18 {

    public static int strCount(String str, char letter) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==letter){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(strCount("Rabarbara",'a'));
    }
}