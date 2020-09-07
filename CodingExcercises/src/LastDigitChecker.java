public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b ,int c){
        if ((a>9) && ( b>9) && (c>9) && (a<1001) && (b<1001) && (c<1001)){
            int num = a % 10 ;
            int num1 = b % 10 ;
            int num2 = c % 10 ;
            if((num == num1) || (num1 == num2) || (num == num2) ){
                return true ;
            }
            else{
                return false;
            }


        }
        return false ;
    }
    public static boolean isValid(int number){
        if(number>9 && number<1001){
            return true;
        }
        return false;
    }
}
