package pl.jakubkrys.codewars.kyu8;

public class Watermelon {
    public static boolean divide(int weight) {
        return (weight > 2 && weight%2 == 0);
    }

    public static void main(String[] args) {
        System.out.println(divide(98));
    }
}