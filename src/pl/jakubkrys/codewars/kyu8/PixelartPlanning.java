package pl.jakubkrys.codewars.kyu8;

public class PixelartPlanning {

    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength%pixelSize == 0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(4050,27));
    }
}
