import java.util.Scanner;

public class RecursiveClass {

    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);

        int x =s.nextInt();
        printIncreasing(x);

    }
    public static void printIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
