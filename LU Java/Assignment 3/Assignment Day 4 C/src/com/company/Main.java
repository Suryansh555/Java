package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] arr = new int[5];
	TakingInput(arr);
	int sum  = SumArray(arr);
	System.out.print("Sum = ");
	System.out.println(sum);
    }
    public static int SumArray(int[] array){
        int result = 0;
        for(int i = 0; i < array.length ; i++){
            result = result + array[i];
        }
        return result;

    }
    public static void TakingInput(int[] array){
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Please Enter Element No "+ (int)(i+1));
             array[i] = scan.nextInt();
        }
        System.out.println();
    }
}
