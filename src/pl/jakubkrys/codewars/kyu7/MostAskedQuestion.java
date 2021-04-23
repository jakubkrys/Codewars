package pl.jakubkrys.codewars.kyu7;

public class MostAskedQuestion {
    public static boolean detect (String comment){
//        String[] commentTab = comment.split(" ");
//        String result = "";
//        for(int i = 0; i < 3; i++){
//            result += commentTab[i]+" ";
//        }
//        return result.equals("Can someone explain ");

        return comment.contains("Can someone explain ");
    }

    public static void main(String[] args) {
        System.out.println(detect("Can someone explain to me what this kata is about?"));
    }
}
