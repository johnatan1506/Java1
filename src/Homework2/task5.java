package Homework2;

public class task5 {
    public static void main(String[] args){
        int [] arr = {72, 8, 921, 14, 4124};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0;i != arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
