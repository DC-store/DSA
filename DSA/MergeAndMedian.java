import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeAndMedian {
    public static void main(String[] args) {

        int[] num1 = {1, 2};
        int[] num2 = {3, 4};



        System.out.println("the median is ::"+findMedianSortedArrays(num1,num2));

        int[] numm1={1,3};
        int[] numm2={2};

        System.out.println("the median is ::"+findMedianSortedArrays(numm1,numm2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> num1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> num2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        num1List.addAll(num2List);

        num1List= num1List.stream().sorted().collect(Collectors.toList());

        Integer[] num3 =  num1List.toArray(new Integer[num1List.size()]);

        int start=0;
        int end = num3.length-1;

        if (end%2==0) {
            int mid = start+(end-start)/2;

            return  num3[mid];
        }
        else{
            int mid = start+(end-start)/2;
            System.out.println("number 1:"+num3[mid]);
            System.out.println("number 2:"+num3[mid+1]);
            return (double) (num3[mid]+num3[mid+1])/2;
        }


    }
}
