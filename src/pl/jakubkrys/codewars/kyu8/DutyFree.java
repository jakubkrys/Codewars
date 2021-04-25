package pl.jakubkrys.codewars.kyu8;

public class DutyFree {

    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int)(hol/(normPrice-(normPrice*(1-(double)discount/100))));
    }

    public static void main(String[] args) {
        System.out.println(dutyFree(24,35,3000));
    }
}