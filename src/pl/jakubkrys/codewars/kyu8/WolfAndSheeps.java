package pl.jakubkrys.codewars.kyu8;

public class WolfAndSheeps {

    public static String warnTheSheep(String[] array) {

        int sheepNumber = array.length - 1;
        String result = "";

        for (int i = 0; i < array.length; i++){
            if (array[array.length-1] == "wolf"){
                result += "Pls go away and stop eating my sheep";
                break;
            } else if (array[i] == "wolf"){
                result += "Oi! Sheep number "+sheepNumber+"! You are about to be eaten by a wolf!";
            } else {
                sheepNumber--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}