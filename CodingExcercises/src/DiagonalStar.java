public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            for(int row = 1; row <= number; row++) {
                for(int column = 1; column <= number; column++) {
                    if(column == number) {
                        System.out.println("*");
                    } else if((row == 1) || (row == number) || (column == 1) || (row == column) || (row == (number - column + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }

    public static void main (String args[]){

        printSquareStar(5);
    }

    }


