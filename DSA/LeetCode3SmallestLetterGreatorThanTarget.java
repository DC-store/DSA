import java.util.Arrays;

public class LeetCode3SmallestLetterGreatorThanTarget {

    public static void main(String[] args) {
        String[] a ={"c","f","j"};
        int tar= 'j';

        int[] arr= {(int)a[0].charAt(0), (int)a[1].charAt(0),(int)a[2].charAt(0)};
        int target=(int) tar;

        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>=arr[mid]){
                start=mid+1;

            }
            else{
                end = mid-1;
            }

        }
        System.out.println("the start is :::"+start);
        if(start>(arr.length-1)){
            System.out.println("the wrapping char "+(char)arr[0]);
        }
        else{
            System.out.println("the smallest number greator than target::: "+(char)arr[start]);
        }



    }
}
