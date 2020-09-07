package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double abc = scan.nextDouble();
        String xyz = scan.nextLine();
        System.out.println(abc);

        System.out.println(xyz);
     if ( num > 0)
     {
         System.out.println("The value of the number is more than zero that is " + num );
     }
     else {
         System.out.println("The value of the number is less than zero that is " + num );
     }
    }
}
