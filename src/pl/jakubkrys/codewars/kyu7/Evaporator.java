package pl.jakubkrys.codewars.kyu7;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {

        double thresholdValue = content * (threshold / 100);
        int index = 0;

        while (content > thresholdValue) {
            content -= content * (evap_per_day / 100);
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 10));
    }
}