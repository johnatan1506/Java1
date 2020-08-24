package Java;

public class task3 {
    public static void main(String[]args){
        double result = calculate(12, 2, 4, 2);
        System.out.println(result);
    }


    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }
}
