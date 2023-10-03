import java.util.Arrays;

public class ReverseUsingTwoPointer {
    public static void main(String[] args) {

        int arrr[]= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arrr)));

    }

    static int[] reverseArray(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
    }
}
