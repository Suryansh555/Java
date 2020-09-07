import java.util.Scanner;

public class EndofFIle {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            if(str.isEmpty()) {
                break;
            }
            System.out.println(i + " " + str);
            i++;
        }
        scan.close();
        }


    }

