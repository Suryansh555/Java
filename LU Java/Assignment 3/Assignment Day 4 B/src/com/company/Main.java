package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int num = 5 ;
            Scanner scan = new Scanner(System.in);
	        int[] arr = new int[num];
	        for(int i = 0 ; i < num; i++ ){
                System.out.println("Please Enter Element "+ i+1);
                arr[i] = scan.nextInt();
                System.out.println();
        }

	        scan.close();

	        for(int j = 0 ; j < num; j++ ){
	            if(arr[j] % 2 != 0 ){
	                System.out.println(arr[j]);
            }
        }
    }
}
