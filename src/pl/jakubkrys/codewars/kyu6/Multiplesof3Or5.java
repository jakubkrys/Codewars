package pl.jakubkrys.codewars.kyu6;

public class Multiplesof3Or5 {
    public static int solution(int number) {
        int result = 0;

        for (int i = 0; i < number; i++) {
            if (i%3 == 0 || i%5 == 0){
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
