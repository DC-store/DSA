import java.util.Arrays;

public class TwoDArrayBinarySearch {
    public static void main(String[] args) {
        int num[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

       int target=9;

        System.out.println("the binary search element is "+Arrays.toString(binarSearch(num,target)));

    }
    public static int[] binarSearch(int[][] matrix,int target){


        int row=0;
        int col=matrix.length-1;
        System.out.println("the column length= "+col);
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(target>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }


        }

        return new int[]{-1,-1};
    }
}
