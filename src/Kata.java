import java.util.Arrays;

public class Kata {

    public static int[] digitize(long n) {

        String m = String.valueOf(n);
        int[] b = new int[m.length()];
        int index = m.length();
        for (int i = 0; i < m.length(); i++) {
                b[i] = Integer.parseInt(m.substring(index-1,index));
                index--;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(123456789)));
    }
}