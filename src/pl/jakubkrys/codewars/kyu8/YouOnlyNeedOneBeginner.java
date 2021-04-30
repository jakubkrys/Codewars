package pl.jakubkrys.codewars.kyu8;

public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        boolean status = false;

        for (int i = 0; i < a.length; i++){
            if (a[i].equals(x)){
                status = true;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        System.out.println(check(new Object[] {66, 101}, 66));
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'e'));
        System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"));
    }
}