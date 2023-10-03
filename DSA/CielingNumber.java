public class CielingNumber {
    public static void main(String[] args) {
        //find the smallest element and check weather that is greator or lesser




        int[] arr = {2, 3, 5, 9, 14,16,18};
        int target = 12;
        int start = 0;
        int end = arr.length - 1;
        int result = -1; // Initialize result to an invalid value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                end = mid - 1; // Continue searching in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }


        System.out.println("the elemet is "+arr[start]);


    }


    }




