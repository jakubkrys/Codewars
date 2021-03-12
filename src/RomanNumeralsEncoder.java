public class RomanNumeralsEncoder {

    //        1999-9 i zapisujesz
//        1990-90 i zapisujesz
//        1900-900 i zapisujesz
//        1000 i zapisujesz


    public static String solution(int n) {

        int j;
        int d;
        int s;
        int t;
        String romanNumber = "";

        if(n > 0 && n < 10){
            switch(n){
                case 1:
                    romanNumber = "I";
                    break;
                case 2:
                    romanNumber = "II";
                    break;
                case 3:
                    romanNumber = "III";
                    break;
                case 4:
                    romanNumber = "IV";
                    break;
                case 5:
                    romanNumber = "V";
                    break;
                case 6:
                    romanNumber = "VI";
                    break;
                case 7:
                    romanNumber = "VII";
                    break;
                case 8:
                    romanNumber = "VIII";
                    break;
                case 9:
                    romanNumber = "IX";
                    break;
            }
        } else if (n >= 10 && n < 100){
            String integer = Integer.toString(n); // zamiana int na String
            String firstDigit = integer.substring(0,1); // przypisanie pierwszej cyfry do zmiennej
            d = Integer.decode(firstDigit);
            switch(d*10){
                case 10:
                    romanNumber += "X";
                    break;
                case 20:
                    romanNumber += "XX";
                    break;
                case 30:
                    romanNumber += "XXX";
                    break;
                case 40:
                    romanNumber += "XL";
                    break;
                case 50:
                    romanNumber += "L";
                    break;
                case 60:
                    romanNumber += "LX";
                    break;
                case 70:
                    romanNumber += "LXX";
                    break;
                case 80:
                    romanNumber += "LXXX";
                    break;
                case 90:
                    romanNumber += "XC";
                    break;
            }
            String lastDigit = integer.substring(1); // przypisanie ostatniej cyfry do zmiennej
            j = Integer.decode(lastDigit);
            switch(j){
                case 1:
                    romanNumber += "I";
                    break;
                case 2:
                    romanNumber += "II";
                    break;
                case 3:
                    romanNumber += "III";
                    break;
                case 4:
                    romanNumber += "IV";
                    break;
                case 5:
                    romanNumber += "V";
                    break;
                case 6:
                    romanNumber += "VI";
                    break;
                case 7:
                    romanNumber += "VII";
                    break;
                case 8:
                    romanNumber += "VIII";
                    break;
                case 9:
                    romanNumber += "IX";
                    break;
            }
        } else if (n >= 100 && n < 1000){
            String integer = Integer.toString(n); // zamiana int na String
            String firstDigit = integer.substring(0); // przypisanie pierwszej cyfry do zmiennej
            String secondDigit = integer.substring(1); // przypisanie drugiej cyfry do zmiennej
            String lastDigit = integer.substring(integer.length()); // przypisanie ostatniej cyfry do zmiennej
        } else if (n >= 1000){
            String integer = Integer.toString(n); // zamiana int na String
            String firstDigit = integer.substring(0); // przypisanie pierwszej cyfry do zmiennej
            String secondDigit = integer.substring(1); // przypisanie drugiej cyfry do zmiennej
            String thirdDigit = integer.substring(2); // przypisanie drugiej cyfry do zmiennej
            String lastDigit = integer.substring(integer.length()); // przypisanie ostatniej cyfry do zmiennej
        }
        return romanNumber;
    }

    public static void main (String[]args){
        System.out.println(solution(99));
    }
}
