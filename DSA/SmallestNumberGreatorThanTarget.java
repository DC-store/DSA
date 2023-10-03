public class SmallestNumberGreatorThanTarget {
    public static void main(String[] args) {
        //find the smallest elemet greator then target
        int arr[] ={2,4,6,8,10,12,14,16,18};
        int target =17;

        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid= start +(end-start)/2;
            if(target>=arr[mid]){
                start=mid+1;
            }
            else{
                end =mid-1;
            }

        }
        if(start== arr.length){
            System.out.println("printing the wrap "+arr[0]);
        }
        else{
            System.out.println("printiing the largest is "+arr[end]);
        }

    }
}
