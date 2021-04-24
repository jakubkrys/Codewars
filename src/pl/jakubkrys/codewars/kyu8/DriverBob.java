package pl.jakubkrys.codewars.kyu8;

public class DriverBob {
    public static int enough(int cap, int on, int wait){
        return (cap - on >= wait? 0 : wait-(cap-on));
    }

    public static void main(String[] args) {
        System.out.println(enough(100,60,50));
    }
}
