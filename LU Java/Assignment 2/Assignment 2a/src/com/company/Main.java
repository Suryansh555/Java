package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int maths,physics,chemistry,english,IP,total;
	float percentage;
	String name;
	Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter Your Name - ");
    name = scan.nextLine();
    System.out.println("Please Enter Your Maths Marks - ");
    maths = scan.nextInt();
    System.out.println("Please Enter Your Physics Marks - ");
    physics = scan.nextInt();
    System.out.println("Please Enter Your Chemistry Marks - ");
    chemistry = scan.nextInt();
    System.out.println("Please Enter Your English Marks - ");
    english = scan.nextInt();
    System.out.println("Please Enter Your IP Marks - ");
    IP = scan.nextInt();

    if((maths < 0 || maths > 100) ||( physics < 0 || physics > 100) || (chemistry < 0 || chemistry > 100) || (english < 0 || english > 100) ||(IP < 0 || IP > 100)){
        System.out.print("Marks Are invalid !! Please try again");
        scan.close();
        System.exit(0);

    }
    else{
        total = maths + physics + chemistry + english + IP ;
        percentage = total/5 ;
        System.out.println(""+name+" has acheived "+ percentage + " % ");

    }





    }
}
