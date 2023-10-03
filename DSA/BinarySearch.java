public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 16;
        int start = 0;
        int end = arr.length - 1;
        System.out.println("The array length is " + (end + 1)); // Adding 1 to get the correct length.

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                System.out.println("The index of the target element is " + mid);
                return; // Target found, exit the loop.
            }
        }

        System.out.println("Sorry, the target element was not found.");
    }
}
