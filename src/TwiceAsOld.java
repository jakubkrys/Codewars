public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){

        return Math.abs(dadYears-(sonYears*2));
    }

    public static void main (String[] args){
        System.out.println(TwiceAsOld.TwiceAsOld(70, 25));
    }
}
