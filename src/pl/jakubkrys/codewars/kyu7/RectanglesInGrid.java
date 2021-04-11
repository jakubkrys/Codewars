package pl.jakubkrys.codewars.kyu7;

public class RectanglesInGrid {

    public static int numberOfRectangles(int m, int n) {

        int sumOfRectangles = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sumOfRectangles += i * j;
            }
        }

        return sumOfRectangles;
    }

    public static void main(String[] args) {
        System.out.println(numberOfRectangles(5, 5));
    }
}
