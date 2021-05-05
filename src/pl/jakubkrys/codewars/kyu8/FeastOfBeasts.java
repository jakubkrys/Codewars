package pl.jakubkrys.codewars.kyu8;

public class FeastOfBeasts {

    public static boolean feast(String beast, String dish) {

        return beast.substring(0,1).equals(dish.substring(0,1)) && beast.substring(beast.length()-1).equals(dish.substring(dish.length()-1));

    }

    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));
    }
}