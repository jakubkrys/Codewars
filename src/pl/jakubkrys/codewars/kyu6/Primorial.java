package pl.jakubkrys.codewars.kyu6;

public class Primorial {
    public static String numPrimorial(int n) {

        int primeNumbersIterator = 0;
        long primorial = 1L;

        for (int number = 2; primeNumbersIterator < n; number++) {
            if (number == 2) {
                primorial *= 2;
                primeNumbersIterator++;
            } else if (number == 3) {
                primorial *= 3;
                primeNumbersIterator++;
            } else if (number == 5) {
                primorial *= 5;
                primeNumbersIterator++;
            } else if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
                primorial *= number;
                primeNumbersIterator++;
            }
        }
        return Long.toString(primorial);
    }

    public static void main(String[] args) {
        System.out.println(numPrimorial(15));
    }
}