public class FloorOfNumber {
    public static void main(String[] args) {

        int a[]={2,3,5,9,14,16,18};
        int start=0;
        int end = a.length-1;
        int target = 12;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target>a[mid]){
                start= mid+1;

            }
            else{
                end=mid-1;
            }
            if(a[mid]==target){
                System.out.println("the element is "+a[mid]);
            }

        }
        System.out.println("the smallest numebr is "+a[end]);
    }
}
