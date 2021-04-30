package pl.jakubkrys.codewars.kyu8;

public class AreaOrPerimeter {

    public static int areaOrPerimeter (int l, int w) {
        return l == w? Math.multiplyExact(l,w) : 2*l+2*w;
    }


    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(6,6));
    }
}