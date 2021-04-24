package pl.jakubkrys.codewars.kyu8;

public class KeepUpTheHoop {
    public static String hoopCount(int n){
        return (n >= 10? "Great, now move on to tricks" : "Keep at it until you get it");
    }

    public static void main(String[] args) {
        System.out.println(hoopCount(7));
    }
}