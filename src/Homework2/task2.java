package Homework2;

public class task2 {
    public static void main(String[] args)
    {

        int[] array = new int[8];
        int j = 0;

        for(int i = 0; i < array.length; i++)
        {
            System.out.print (i + "-" + array[i]+" ");
        }
        System.out.println (" ");
        for(int i = 0; i < array.length; i++, j = j+3)
        {array[i] = j;
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.print (i + "-" + array[i]+" ");
        }
    }
}
