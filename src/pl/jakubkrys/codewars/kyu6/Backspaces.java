package pl.jakubkrys.codewars.kyu6;

public class Backspaces {
    public static String cleanString(String s) {

        String result = s;

        while (result.contains("#")){
            result = result.substring(0,result.indexOf("#")-1)+result.substring(result.indexOf("#")+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cleanString("abc####d##c#"));
    }
}
