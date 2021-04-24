package pl.jakubkrys.codewars.kyu8;

import java.util.*;

public class TrafficLights {
    public static String updateLight(String current) {

        Map<String,String> lights = new HashMap<>();
        lights.put("red","green");
        lights.put("yellow","red");
        lights.put("green","yellow");

        return lights.get(current);
    }

    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }
}