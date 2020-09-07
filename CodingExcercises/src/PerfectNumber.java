public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int num = 0 ;
        int sum = 0 ;
        int i = 1;
        if(number < 1){
            return false;
        }
        else{

           while (!(i == number + 1)){
               num = number % i ;
               if(num == 0){
                   sum = sum + i ;

               }
               i++;
           }
           sum = sum/2;


        }
       // System.out.println(sum);
      //  System.out.println(number);
if (sum == number){
    return true;
}
else
    return false;
    }
    public static void main(String args[]){
        System.out.println(isPerfectNumber(28));
    }
}
