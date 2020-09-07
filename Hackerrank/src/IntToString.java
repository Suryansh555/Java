import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = Integer.toString(n);
        if ((n >= -100) && (n <= 100)) {
            System.out.println("Good job");
        } else {

            System.out.printf("Wrong answer");
        }
    }
}
