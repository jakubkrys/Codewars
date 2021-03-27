package pl.jakubkrys.codewars.kyu6;

public class PlayingWithDigits {

    public static long digPow(int n, int p) {
        int index = 0;
        int k = 0;

        while (index < (Integer.toString(n)).length()){
            k += Math.pow((Integer.parseInt((Integer.toString(n)).substring(index,index+1))), p++);
            index++;
        }

        if (k%n != 0){
            return -1;
        } else {
            return k/n;
        }
    }

    public static void main(String[] args) {
        System.out.println(digPow(46288,3));
    }
}
