package pl.jakubkrys.codewars.kyu8;

public class WillYouMakeIT {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= mpg*fuelLeft;
    }

    public static void main(String[] args) {
        System.out.println(zeroFuel(100,50,1));
    }
}
