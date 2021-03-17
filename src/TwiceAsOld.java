public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){
        int diff = (dadYears-(sonYears*2));
        int TwiceAsOld = Math.abs(diff);

        return TwiceAsOld;
    }

    public static void main (String[] args){
        System.out.println(TwiceAsOld.TwiceAsOld(30, 25));
    }
}
