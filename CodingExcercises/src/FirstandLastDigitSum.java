public class FirstandLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int lastno = 0 ;
        int firstno = 0 ;
        int result = 0;
        if(number < 10){
            firstno = number;
        }
        else {
             firstno = number % 10;
        }

        if (number < 0){
            return -1;
        }
        else{
            while (number > 0){
                lastno = number ;
                number = number / 10 ;
            }
            result = lastno + firstno;
            return result;
        }
    }

}
