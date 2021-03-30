package pl.jakubkrys.codewars.kyu6;

public class Carboat {

    public static String howmuch(int m, int n) {

        String result = "";

        if (m > n){
            int tmp = m;
            m = n;
            n = tmp;
        }

        for (int fortune = m; fortune <= n ; fortune++) {
            if ((fortune == ((7*((fortune-2)/7))+2)) && (fortune == ((9*((fortune-1)/9))+1))){
                result += "[M: "+fortune+" B: "+((fortune-2)/7)+" C: "+((fortune-1)/9)+"]";
            }
        }
        return "["+result+"]";
    }

    public static void main(String[] args) {
        System.out.println(howmuch(10000, 9950));
    }
}