import java.util.Arrays;

public class SumUpArray {
    public static void main(String[] args) {

        int arr[] = {3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));

        System.out.println("the sum out put is "+Arrays.toString((twoSumTwoPointer(arr,target))));
    }
    public static int[] twoSumTwoPointer(int[] nums, int target){
        int[] a = {-1,-1};
        int start=0;
        int end= nums.length-1;

        while(start<end){
            int sum = nums[start]+nums[end];
            if(sum==target){
                a[0]=start;
                a[1]=end;
                return a;
            }
            else if(sum>target){
                start++;
            }else{
                end--;
            }
        }

        return a;
    }





    public static int[] twoSum(int[] nums, int target) {
        int start=0;
        int j=0;
        int end = nums.length-1;
        int[] a = {-1,-1};
        int sum=0;

        while(start<(end)){
            sum = nums[start]+nums[end];
            if(sum==target){
                a[0]=start;
                a[1]=end;
                return a;
            }

            if(sum>target){
                start++;

            }
            else{
                end--;
            }

        }

        return a;
    }
}
