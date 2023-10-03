import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecrchIn2DArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("enter the number");
                array[i][j] = s.nextInt();

            }


        }

        int target = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (target == array[i][j]) {
                    System.out.println("the target is found");
                    int[] output = {i, j};
                    System.out.println("the array we found is " + Arrays.toString(output));
                    break;
                }


            }
        }

        //max element
        int greatorNumber = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (greatorNumber < anInt) {
                    System.out.println(anInt);
                    greatorNumber = anInt;
                }

            }
        }
        System.out.println("the greator numebr is " + greatorNumber);

    }
}
