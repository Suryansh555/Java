import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int rec = 1;
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE ;
        while(true){
            System.out.println("Enter The Number #" + rec);
            if(scan.hasNextInt()) {
                num = scan.nextInt();

                if (num > big) {
                    big = num;
                }
                if(num < small){
                    small = num ;
                }
            }
            else{

                 break;

            }
            rec ++;
        }
        System.out.println("Max no = " + big);
        System.out.println("Min no = " + small);
    }
}
