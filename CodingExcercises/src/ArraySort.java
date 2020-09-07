import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
      int [] arrayInt =getIntegers(5);
     printArray(sortIntegers(arrayInt));
      }




    public static int [] getIntegers(int num){
    System.out.println("Enter " + num + " values \r");
    int [] ArrayInteger = new int[num];
    for(int i = 0 ; i <ArrayInteger.length ; i++){
        ArrayInteger[i] = scan.nextInt();
    }
    return  ArrayInteger ;
    }

    public static void printArray(int[] name){
        for(int i=0 ; i<name.length; i++){
            System.out.println("Element No " + i + " Value = " + name[i] );
        }
    }

    public static int[] sortIntegers(int[] names){
//        int[] sortedArray = new int[names.length];
//        for(int i=0 ; i<names.length; i++){
//           sortedArray[i] = names[i];
//        }
        int [] sortedArray = Arrays.copyOf(names , names.length);
        boolean flag = true ;
        int temp ;

        while (flag){
            flag = false;
            for(int i = 0 ;  i <sortedArray.length -  1 ; i++){
                if(sortedArray[i]  > sortedArray [i + 1]){
                    temp = sortedArray[i];
                    sortedArray [i] = sortedArray [i+1];
                    sortedArray[i+1]=temp;
                    flag = true;

                }
            }
        }
       return sortedArray;
    }
}
