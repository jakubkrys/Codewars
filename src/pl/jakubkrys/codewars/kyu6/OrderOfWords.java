package pl.jakubkrys.codewars.kyu6;

public class OrderOfWords {

    public static String order(String words) {
        if (words.length() < 1) {
            return "";
        } else {
            String[] wordsTab = words.split(" ");
            int[] intsTab = new int[wordsTab.length];
            String result = "";

            for (int i = 0; i < wordsTab.length; i++) {
                char[] tab = wordsTab[i].toCharArray();
                for (int j = 0; j < tab.length - 1; j++) {
                    if (tab[j] < tab[j + 1]) {
                        char tmp = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = tmp;
                    }
                }
                intsTab[i] = tab[tab.length - 1];
            }

            for (int j = 0; j < intsTab.length; j++) {
                for (int i = 0; i < intsTab.length - 1; i++) {
                    if (intsTab[i] > intsTab[i + 1]) {
                        String stmp = wordsTab[i];
                        wordsTab[i] = wordsTab[i + 1];
                        wordsTab[i + 1] = stmp;

                        int tmp = intsTab[i];
                        intsTab[i] = intsTab[i + 1];
                        intsTab[i + 1] = tmp;
                    }
                }
            }

            for (int i = 0; i < wordsTab.length; i++) {
                if (i < wordsTab.length - 1) {
                    result += wordsTab[i] + " ";
                } else {
                    result += wordsTab[i];
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
