public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if ( number < 0){
            return -1 ;
        }
        int result = 0 ;
        while (number > 0){
            int no = number % 10 ;
            number = number /10 ;
            if(no % 2 == 0){
                result = result + no ;
            }
            else {
              continue;
            }

        }
        return result;

    }
}
