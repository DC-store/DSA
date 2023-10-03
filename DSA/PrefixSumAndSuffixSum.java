import java.util.Arrays;

public class PrefixSumAndSuffixSum {
    public static void main(String[] args) {
        int arr[] ={2,1,3,4,5};
        System.out.println("the prefix sum or runnnig sum ="+ Arrays.toString(prefixSum(arr)));

        int prefixarr[] = prefixSum(arr);
        //find the q queries l r
        int out = sumPrefix(prefixarr,3,5);
        System.out.println("the prefix of the sum and n sum "+out);
    int input[] ={5,3,2,6,3,1};

        int[] suffixsum = suffixArray(input);
        System.out.println("input is "+Arrays.toString(input));
        System.out.println("suffix sum "+Arrays.toString(suffixsum));

        System.out.println();
        System.out.println();
        System.out.println();


       int [] input2= {5,3,2,6,3,1};
        System.out.println("input is "+Arrays.toString(input2));
       int[] prefixSumm= prefixSum(input2);
        System.out.println("prefix sum is  "+Arrays.toString(prefixSumm));

        ///sub array exist or not

        int x= subArrayIndex(prefixSumm,suffixsum);
        System.out.println("the sub array is " +x+","+(prefixSumm.length-1-x));
    }
    public static int[] prefixSum(int[] arr){
        int i=0;
        int j=0;
        while(j<=arr.length-1){
            if(i==0 && j==0){
                arr[i]=arr[j];
            }
            else{

                arr[i]=arr[i]+arr[j-1];
            }
            i++;
            j++;


        }
        return arr;
    }

    public static int sumPrefix(int[] arr,int l, int r){
        l=l-1;
        r=r-1;
     return arr[r]-arr[l-1];
    }



    public static int[] suffixArray(int[] arr){
        int i= arr.length-1;
        int j= arr.length-1;
        while(i>=0){
            if(i== arr.length-1 && j == arr.length-1){
                arr[i]=arr[j];
            }
            else{
                arr[i]= arr[i]+arr[j+1];
            }
            i--;
            j--;
        }
        return arr;
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


    public static int subArrayIndex(int[] prefixSum, int[] suffixSum){
        int start=0;
        int end = prefixSum.length-1;
        while(start<=end){
            if(prefixSum[start]==suffixSum[start+1]){
                System.out.println("TRUE");
                return start;
            }
            start++;

        }
        return -1;
    }
}
