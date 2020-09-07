import java.util.Scanner;

public class ScannerSum {
    public static void main(String args[]){
        int counter = 1 ;
        int no = 0 ;
        int result = 0 ;
        Scanner scan = new Scanner(System.in);
        while(counter<11){
            System.out.print("Enter No." + counter +"\n");

            if(scan.hasNextInt()) {

                if(counter == 11){
                    break;
                }

                no = scan.nextInt();
                result = result + no;
                counter++;
            }
            else{
                System.out.println("Invalid Number");

            }
            scan.nextLine();

        }
        scan.close();

        System.out.println(result);

    }
}
