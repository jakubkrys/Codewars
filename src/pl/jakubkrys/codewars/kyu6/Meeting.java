package pl.jakubkrys.codewars.kyu6;

import java.util.*;

public class Meeting {

    public static String meeting(String s) {

        String result = "";
        List<String> guestsList = Arrays.asList(s.toUpperCase().split(";"));

        for (int i = 0; i < guestsList.size(); i++) {
            List<String> guest = Arrays.asList(guestsList.get(i).split(":"));
            Collections.reverse(guest);
            guestsList.set(i,"("+guest.get(0).toString()+", "+guest.get(1).toString()+")");
        }

        Collections.sort(guestsList);

        for (int i = 0; i < guestsList.size(); i++) {
            result += guestsList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
    }
}
