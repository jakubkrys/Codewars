public class AbbreviateTwoWords {
    public static String abbrevName(String name) {

        String[] separate = name.split(" ");
        return separate[0].substring(0,1).toUpperCase()+"."+separate[1].substring(0,1).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Grzegorz Czarnogórski"));
    }
}
