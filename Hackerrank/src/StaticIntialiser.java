import java.util.Scanner;

public class StaticIntialiser {
  static  Scanner scan = new Scanner(System.in);
  static  int B = scan.nextInt();
  static  int H = scan.nextInt();

    static {
     if((B>0) && (H>0))
     {

     }
     else{
         System.out.println("java.lang.Exception: Breadth and height must be positive");
         System.exit(0);
     }


    }
    public static void main(String[] args) {
       int res = B * H ;
       System.out.println(res);

    }
}

