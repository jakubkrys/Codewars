package pl.jakubkrys.codewars.kyu8;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i,i+1).equals(string.substring(i,i+1).toUpperCase())){
               result += string.substring(i,i+1).toLowerCase();
            } else {
                result += string.substring(i,i+1).toUpperCase();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("AdSjPoTrDwQa"));
    }
}