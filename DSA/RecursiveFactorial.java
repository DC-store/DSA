import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int product =1;
        factorila(n,product);

        int fact=factorilaOneLine(n);
        System.out.println("the  return of the factorial is ::::"+fact);

        System.out.println();
        System.out.println();

        //fibbanaciao number;

        System.out.println("fib sum is ::"+ fibanaciao(5));




    }

    public static int fibanaciao(int n){

        if(n==0 ){
            return 0;
        }
         if(n==1){

        return 1;
        }
         int prev = fibanaciao(n-1);

         int preprePrev= fibanaciao(n-2);

         int sum =prev+preprePrev;
        System.out.println("the every number is "+sum);

     return prev+preprePrev;
    }



    public static void factorila(int n,int product){
        if(n==1 || n==0){
            System.out.println(product);
            return ;
         }

        product=product*n;
        factorila(n-1,product);


    }

    public static int factorilaOneLine(int n){
        if(n==0){

            return 1;
        }
        return n*factorilaOneLine(n-1);
    }
}
