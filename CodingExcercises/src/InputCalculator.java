import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        int numberEntered;

        int sumOfNumbers = 0;

        int countNumbers = 0;

        boolean hasNextInt;

        Scanner scanner = new Scanner(System.in);



        while (true) {

            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                numberEntered = scanner.nextInt();

                sumOfNumbers += numberEntered;

                countNumbers +=1;

            } else {

                break;

            }

            scanner.nextLine(); // handles next line character (enter key)

        }

        if (sumOfNumbers == 0) {countNumbers = 1;};

        System.out.println("SUM = " + sumOfNumbers + " AVG = " +

                Math.round((double)sumOfNumbers/countNumbers));

        scanner.close();

    }
    public static void main(String args[]){

    }


}


