package Homework2;

public class task5 {
    public static void main(String[] args){
        int [] array = {72, 8, 921, 14, 4124};
        int max = array[0];
        int min = array[0];
        for (int i = 1;i< array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
