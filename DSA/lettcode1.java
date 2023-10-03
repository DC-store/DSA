public class lettcode1 {
    public static void main(String[] args) {
        //given an integer how many of them contain an even number of the digit
        int[] arr= {12,345,2,6,7896};
        int countOfEvenNumberDigit=0;
        for(int x : arr){

            String str= ""+x;
//short cut to find the number of digit is (int)(Math.log10(num)+1)
            int digit=str.length();
            if(digit%2==0){
                countOfEvenNumberDigit++;
            }
        }
        System.out.println("count of even number :: "+countOfEvenNumberDigit);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
