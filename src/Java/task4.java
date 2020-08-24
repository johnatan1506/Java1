package Java;

public class task4 {
    public static void main (String[] args) {
        System.out.println(test(5, 12));
    }
    private static boolean test(int x1, int x2) {
        int sum = x1+x2;
        if (sum<= 20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }

}
