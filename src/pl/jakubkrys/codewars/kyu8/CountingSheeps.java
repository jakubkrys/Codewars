package pl.jakubkrys.codewars.kyu8;

public class CountingSheeps {

    public int countSheeps(Boolean[] arrayOfSheeps) {

        int counter = 0;

        try{
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i]){
                    counter++;
                }
            }
        } catch (NullPointerException e){

        }
        return counter;
    }
}
