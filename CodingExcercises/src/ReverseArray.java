import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scan = new Scanner (System.in);

    public static void main(String args[]){
        System.out.println("Enter the index of array to be reversed  \r");
     int [] Array = new int[scan.nextInt()];
        System.out.println("Enter Array Elements \r");
        for(int i = 0 ; i < Array.length ; i++){
            Array[i] = scan.nextInt();
        }
        System.out.println( "Initial Array =  " + Arrays.toString(Array));
        reverse(Array);
    }


    public static void reverse( int[] array ){
        int num = array.length - 1;
        int [] Reverse = new int[array.length];
        for(int i = 0 ; i < array.length ; i++){
            Reverse[num] = array [i];


            num--;
        }
        System.out.println("Reverse = " + Arrays.toString(Reverse));

    }

}
