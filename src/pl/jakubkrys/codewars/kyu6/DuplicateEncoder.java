package pl.jakubkrys.codewars.kyu6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateEncoder {
    static String encode(String word){

        List<String> source = new ArrayList<>();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            source.add(word.toLowerCase().substring(i, i+1));
        }

        for (int i = 0; i < source.size(); i++) {
            if((Collections.frequency(source, source.get(i))) > 1) {
                //source.set(i,")");
                result += ")";
            } else {
                //source.set(i,"(");
                result += "(";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("(( @"));
    }
}
