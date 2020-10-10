package com.company;

import java.time.Month;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        int DOB,MOB,YOB,MSalary,YSalary,tax;
        float amount ;
	    System.out.println("Please Enter your name ");
	    name = scan.nextLine();
        System.out.println("Please Enter your date of Birth ");
        DOB = scan.nextInt();
        System.out.println("Please Enter your Month of Birth ");
        MOB = scan.nextInt();
        System.out.println("Please Enter your Year of Birth ");
        YOB = scan.nextInt();
        System.out.println("Please Enter your monthly Salary ");
        MSalary = scan.nextInt();

        switch(MSalary){
            case 200000:
                tax = 5 ;
                break;
            case 300000:
                tax = 10 ;
                break;
            case 400000:
                tax = 15 ;
                break;
            case 500000:
                tax = 20 ;
            default:
                System.out.println("Please Enter your Details Again");
                tax = 0;
                System.exit(0);
        }

        int Yage = 2020 - YOB;
        YSalary = MSalary * 12 ;
        amount = YSalary * tax / 100;
        System.out.println(""+ name + " of age " + Yage + " has annual salary of " + YSalary + " and has to pay " + amount + " as tax every year." );


    }


}
