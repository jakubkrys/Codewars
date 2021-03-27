package pl.jakubkrys.codewars.kyu6;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(26354));
    }

    public static int countBits(int n){
        return Integer.bitCount(n);
    }
}
