package pl.jakubkrys.codewars.kyu8;

public class Paperwork {

    public static int paperWork(int n, int m) {
        return (n > 0 && m > 0? (n*m) : 0);
    }

    public static void main(String[] args) {
        System.out.println(paperWork(5, 5));
    }
}