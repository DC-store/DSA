import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.*;
import java.util.stream.Collectors;

public class ZensorInterview {

    // [2, 1, 5, 1, 3, 2], k=3
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("please give the input");
      //  int size = sc.nextInt();


        int a[]= {2, 1, 5, 1, 3, 2};

        int greaternum = 0;

        List<Integer> list = Arrays.stream(a).boxed().sorted().collect(Collectors.toList()).reversed();
        System.out.println(list);
        int count=0;
        int x=0;
        int y=0;
        List<Integer> sumMaxProvider= new ArrayList<>();


    while(true){
        int sum=0;
        for(int i =y;i<=y+2;i++){

            System.out.println("i::::"+i);

            sum=sum+a[i];
                if(i==a.length-1){
                    count=1;
                    break;
                }
        }
        y++;

        sumMaxProvider.add(sum);
        if(count==1){
            System.out.println("the maximum of all this array is "+sumMaxProvider.stream().max(Comparator.comparingInt(value -> value)).get());
            break;
        }


        System.out.println();
    }








    }

}
