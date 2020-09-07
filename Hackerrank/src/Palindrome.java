import java.util.Scanner;

public class Palindrome{
public static void main(String args []){
    Scanner scan = new Scanner (System.in);
    String name = scan.nextLine();
    String rev = "" ;
    int num = name.length();
    int i = num ;
    System.out.println(num);
    for(; i > 0; i--) {
        char alap = name.charAt(i - 1);
        rev = rev + alap;
    }
    if (name.equals(rev)) {
        System.out.println("Yes");
    }
    else {
        System.out.println("No");


}
}
}