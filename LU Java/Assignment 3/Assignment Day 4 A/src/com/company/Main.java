package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 5;
	avenger[] avengers = new avenger[num];   // Array of Objects Created

	for(int i = 0 ; i< num  ; i++) {
        avengers[i] = new avenger();     // Objects Data
        avengers[i].getDetails();
    }
	for(int j = 0 ; j< num  ; j++){
	    avengers[j].displayDetails();  // Displaying Objects Data
        }
    }
    public static class avenger{    // Class avenger
       String name;
       int age;
       String power;
       String weapon;
       String planet;

       public void getDetails(){
           Scanner scan = new Scanner(System.in);
           System.out.println("Please Enter Your Avenger Name");
           this.name = scan.nextLine();
           System.out.println("Please Enter "+ this.name+"'s age");
           this.age = scan.nextInt();
           System.out.println("Please Enter "+ this.name+"'s power");    // To Take Input From User
           this.power = scan.next();
           System.out.println("Please Enter "+ this.name+"'s weapon");
           this.weapon = scan.next();
           System.out.println("Please Enter "+ this.name+"'s planet");
           this.planet = scan.next();
           System.out.println("-----------------------------------------------------------");
       }
       public void displayDetails(){
        System.out.println("Avenger \nName :- " +this.name+ "\n" + "Age:- " + this.age + "\n" + "Power:- " + this.power +"\n" + "Weapon:- " + this.weapon + "\n" + "planet:- " + this.planet);
       System.out.println("---------------------------------------------------------------------");    // Display Details of Avengers
       }

    }
}
