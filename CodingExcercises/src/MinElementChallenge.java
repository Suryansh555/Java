import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter Index of array value \r");
        int num = scan.nextInt();

        int[] Array = readIntegers(num);
           System.out.println("Smallest Value is " +findMin(Array));

    }


    public static int[] readIntegers(int num){
        int[] array = new int[num];
        System.out.println("Enter the value of array :- \r");
        for(int i = 0 ; i < array.length ; i++ ){
            array[i] = scan.nextInt();
        }
        return array ;
    }

    public static int findMin(int [] array ){
        int [] main = Arrays.copyOf(array , array.length);
        boolean ad = true;
        int temp ;
        while (ad){
            ad = false;
            for(int i = 0 ; i < main.length - 1 ; i ++){
                if (main[i] < main[i+1] ){
                    temp = main[i];
                    main[i] = main[i + 1];
                    main[i+1] = temp ;

                    ad = true;
                }
            }
        }
        return  main[main.length - 1];
    }

}
