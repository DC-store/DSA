import java.util.Arrays;

public class Sort10101 {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,1,0,0,0,1};
        System.out.println("the ordered array is "+ Arrays.toString (ordering(arr)));

    }

    public static int[] ordering(int arr[]){
        int start=0;
        int end =arr.length-1;

        while(start<end) {
            if(arr[start]==0){
                start++;

            }
            if(arr[end]==1){
                end--;
            }
            if(arr[start]!=0 && arr[end]!=1){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        }
        return arr;
    }

}
