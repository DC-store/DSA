import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayCls {
    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},//0th index
                {4, 5, 6},//1st index
                {7, 8, 9}//2nd index
        };

        System.out.println("lenghtof the array " + arr.length);
        //arrd[2] =[789]

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        //swap array

        int array[] = {1, 2, 3, 4, 5, 6, 7};

        int start = 0;
        int end = array.length - 1;
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            if (start < end) {
                int temp1 = array[i];
                int temp2 = array[end];
                array[start] = temp2;
                array[end] = temp1;

            }
            start++;
            end--;


        }
        for (int i : array) {
            System.out.print("::::::::::: "+i);
        }

        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            x.add(i);
        }
        System.out.println();
        for(int j =0;j<x.size();j++){
            if(99999==x.get(j)){
                System.out.println("found the number");
                break;

            }
        }
    }

}
