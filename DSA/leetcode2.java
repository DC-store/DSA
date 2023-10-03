import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class leetcode2 {
//wealth in 2d array
public static void main(String[] args) {
    int[][] arr= {
            {2,1,3},
            {3,5,7,8,9},
            {1,1,1}
    };

    List<Integer> richFinding= new ArrayList<>();
    for (int[] ints : arr) {
        int sum=0;
        for (int anInt : ints) {
            sum=sum+anInt;
        }
        System.out.println("the sum is ===="+sum);
        richFinding.add(sum);
    }

    System.out.println("the richest wealth is "+richFinding.stream().max(Comparator.comparingInt(value -> value)).get());
    System.out.println("the index of the rich man is "+(richFinding.indexOf(richFinding.stream().max(Comparator.comparingInt(value -> value)).get())));
}

}
