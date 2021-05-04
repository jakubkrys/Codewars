package pl.jakubkrys.codewars.kyu8;

public class MinMax {

    public static int min(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static int max(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(min(new int[]{4,6,2,1,9,63,-134,566}));
        System.out.println(max(new int[]{4,6,2,1,9,63,-134,566}));
    }
}
