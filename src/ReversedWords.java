public class ReversedWords {

    public static String reverseWords(String str) {
        String[] strArray = str.split(" ");
        str = "";
        for (int i = strArray.length-1; i >=0 ; i--) {
            str += strArray[i]+" ";
            /*if(i >= 0){
            } else {
                str += strArray[i]+" ";
            }*/
        }
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length()-1);
        str = sb.toString();
        return str;
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("Ala ma kota czarnego w kropki bordo"));

    }
}
