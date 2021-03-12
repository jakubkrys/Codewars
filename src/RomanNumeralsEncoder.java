public class RomanNumeralsEncoder {

    public static String solution(int n) {

        int j;
        int d;
        int s;
        int t;
        String romanNumber = "";

        if (n > 0 && n < 10) {
            switch (n) {
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
        } else if (n >= 10 && n < 100) {
            String integer = Integer.toString(n); // zamiana int na String
            String firstDigit = integer.substring(0, 1); // przypisanie pierwszej cyfry do zmiennej
            d = Integer.decode(firstDigit);
            switch (d * 10) {
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
                case 0:
                    break;
            }
            String lastDigit = integer.substring(1); // przypisanie ostatniej cyfry do zmiennej
            j = Integer.decode(lastDigit);
            switch (j) {
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
                case 0:
                    break;
            }
        } else if (n >= 100 && n < 1000) {
            String integer = Integer.toString(n); // zamiana int na String
            String firstDigit = integer.substring(0, 1); // przypisanie pierwszej cyfry do zmiennej
            s = Integer.decode(firstDigit);
            switch (s * 100) {
                case 100:
                    romanNumber += "C";
                    break;
                case 200:
                    romanNumber += "CC";
                    break;
                case 300:
                    romanNumber += "CCC";
                    break;
                case 400:
                    romanNumber += "CD";
                    break;
                case 500:
                    romanNumber += "D";
                    break;
                case 600:
                    romanNumber += "DC";
                    break;
                case 700:
                    romanNumber += "DCC";
                    break;
                case 800:
                    romanNumber += "DCCC";
                    break;
                case 900:
                    romanNumber += "CM";
                    break;
                case 0:
                    break;
            }
            String secondDigit = integer.substring(1, 2); // przypisanie drugiej cyfry do zmiennej
            d = Integer.decode(secondDigit);
            switch (d * 10) {
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
                case 0:
                    break;
            }
            String lastDigit = integer.substring(2); // przypisanie ostatniej cyfry do zmiennej
            j = Integer.decode(lastDigit);
            switch (j) {
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
                case 0:
                    break;
            }
        } else if (n >= 1000) {
            String integer = Integer.toString(n); // zamiana int na String
            String firstDigit = integer.substring(0, 1); // przypisanie pierwszej cyfry do zmiennej
            t = Integer.decode(firstDigit);
            switch (t * 1000) {
                case 1000:
                    romanNumber += "M";
                    break;
                case 2000:
                    romanNumber += "MM";
                    break;
                case 3000:
                    romanNumber += "MMM";
                    break;
                case 4000:
                    romanNumber += "|XL|";
                    break;
                case 5000:
                    romanNumber += "|L|";
                    break;
                case 6000:
                    romanNumber += "|LX|";
                    break;
                case 7000:
                    romanNumber += "|LXX|";
                    break;
                case 8000:
                    romanNumber += "|LXXX|";
                    break;
                case 9000:
                    romanNumber += "|XC|";
                    break;
                case 0:
                    break;
            }
            String secondDigit = integer.substring(1, 2); // przypisanie drugiej cyfry do zmiennej
            s = Integer.decode(secondDigit);
            switch (s * 100) {
                case 100:
                    romanNumber += "C";
                    break;
                case 200:
                    romanNumber += "CC";
                    break;
                case 300:
                    romanNumber += "CCC";
                    break;
                case 400:
                    romanNumber += "CD";
                    break;
                case 500:
                    romanNumber += "D";
                    break;
                case 600:
                    romanNumber += "DC";
                    break;
                case 700:
                    romanNumber += "DCC";
                    break;
                case 800:
                    romanNumber += "DCCC";
                    break;
                case 900:
                    romanNumber += "CM";
                    break;
                case 0:
                    break;
            }
            String thirdDigit = integer.substring(2, 3); // przypisanie drugiej cyfry do zmiennej
            d = Integer.decode(thirdDigit);
            switch (d * 10) {
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
                case 0:
                    break;
            }
            String lastDigit = integer.substring(3); // przypisanie ostatniej cyfry do zmiennej
            j = Integer.decode(lastDigit);
            switch (j) {
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
                case 0:
                    break;
            }
        }
        return romanNumber;
    }

    public static void main(String[] args) {
        System.out.println(solution(3888));
    }
}
