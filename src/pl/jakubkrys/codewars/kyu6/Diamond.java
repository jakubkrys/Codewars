package pl.jakubkrys.codewars.kyu6;

public class Diamond {

    public static String print(int n) {

        StringBuilder sbResult = new StringBuilder();
        String result = "";
        int initSpaceAmount = (n/2);
        int initStarsAmount = 1;

        if (n%2 == 0 || n < 0){
            result = null;
        } else {
            for (int i = 0; i < (n/2)+1; i++) {
                setOfSpacesAndStars(sbResult, initSpaceAmount, initStarsAmount);
                initSpaceAmount--;
                initStarsAmount = initStarsAmount+2;
            }

            initSpaceAmount = 1;
            initStarsAmount = (n-2); // 7

            for (int i = n/2; i > 0; i--) {
                setOfSpacesAndStars(sbResult, initSpaceAmount, initStarsAmount);
                initSpaceAmount++;
                initStarsAmount = initStarsAmount-2;
            }
            result = sbResult.toString();
        }

        return result;
    }

    private static void setOfSpacesAndStars(StringBuilder sbResult, int initSpaceAmount, int initStarsAmount) {
        for (int j = 0; j < initSpaceAmount; j++) {
            sbResult.append(" ");
        }
        for (int j = 0; j <= initStarsAmount; j++) {
            if (j < initStarsAmount) {
                sbResult.append("*");
            } else if (j == initStarsAmount) {
                sbResult.append("\n");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(print(13));
    }
}