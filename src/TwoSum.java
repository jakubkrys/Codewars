import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        int[] indexes = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int index = i+1;
            while (index < numbers.length){
                if (target == numbers[i] + numbers[index]){
                    indexes[0] = i;
                    indexes[1] = index;
                    break;
                } else {
                    index++;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 100};
        System.out.println(Arrays.toString(twoSum(numbers, 109)));
    }
}
