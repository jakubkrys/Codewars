package pl.jakubkrys.codewars.kyu8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String result = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (Integer.parseInt(numberString.substring(i,i+1)) < 5){
                result += "0";
            } else {
                result += "1";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("923859236482868572234015005450312316684032123"));
    }
}