package pl.jakubkrys.codewars.kyu8;

public class GetNthEvenNumber {

    public static int nthEven(int n) {
        return 2 * n - 2;
    }

    public static void main(String[] args) {
        System.out.println(nthEven(1000));
    }
}
