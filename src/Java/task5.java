package Java;

public class task5 {
    public static void main(String[] args) {
        isPositiveOrNegative(6);
        isPositiveOrNegative(-14);
    }

    public static void isPositiveOrNegative(int x) {
        if (x < 0) {
            System.out.println(x + " отрицательное число");
        } else {
            System.out.println(x + " положительное число");
        }
    }
}


