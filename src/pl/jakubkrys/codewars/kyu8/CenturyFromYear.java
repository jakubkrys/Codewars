package pl.jakubkrys.codewars.kyu8;

public class CenturyFromYear {

    public static int century(int number) {
        int div;
        if (number%100 != 0){
            div = (number/100)+1;
        } else {
            div = number/100;
        }
        return div;
    }

    public static void main(String[] args){
        System.out.println(century(1801));
    }
}
