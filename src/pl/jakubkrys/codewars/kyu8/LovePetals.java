package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class LovePetals {
    public static String howMuchILoveYou(int nb_petals) {

        Map <Integer,String> answers = new HashMap<>();
        answers.put(1,"I love you");
        answers.put(2,"a little");
        answers.put(3,"a lot");
        answers.put(4,"passionately");
        answers.put(5,"madly");
        answers.put(6,"not at all");

        while (nb_petals > 6){
            nb_petals = nb_petals - 6;
        }

        return answers.get(nb_petals);
    }

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(1));
    }
}
