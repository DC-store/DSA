import java.util.Arrays;

public class SortSqrtOrder {
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5,9,20};

        System.out.println("the sqrt of the sorted arra is "+ Arrays.toString(getSqrtNumebers(arr)) );

        int[] ans=getSqrtNumebers(arr);
        System.out.println("the sorted array is "+Arrays.toString(reverseArray(ans)));




    }

    public static int[] getSqrtNumebers(int[] arr){
        int start=0;
        int end= arr.length-1;
        int ans[] = new int[arr.length];
        int j=0;
        while(start<=end){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                ans[j]=Math.abs(arr[start])*Math.abs(arr[start]);
                start++;
                j++;

            }
            else{
                ans[j]=Math.abs(arr[end])*Math.abs(arr[end]);
                end--;
                j++;
            }
        }

        return ans;
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
