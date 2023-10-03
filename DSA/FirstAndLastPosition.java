public class FirstAndLastPosition {

    public static int  frstAndLast(int[] arr,int target,boolean fristIndex){
        int ans =0;
        int start=0;
        int end =arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){
                 end = mid-1;
            }
            else {
                //potenital ans
                ans=mid;
                if(fristIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {5,7,7,7,7,7 ,7,8,8,10};
        int target =7;
        int i =frstAndLast(arr,target,true);
        int j =frstAndLast(arr,target,false);
        System.out.println("the frst index is "+i);
        System.out.println("the last index is "+j);


    }
}
