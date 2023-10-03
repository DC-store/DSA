import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MatrixFallingSum {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> newList= new ArrayList<>();
        for (int i = 0; i <=arr.length-1 ; i++) {
            int x = Arrays.stream(arr[i]).boxed().sorted().min(Comparator.comparingInt(value -> value)).get();
            System.out.println("the sorted array is x:: "+x);
            newList.add(x);
        }

        newList.forEach(e-> System.out.println(e));
        int shortesFallingSum= newList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(shortesFallingSum);

    }
}
