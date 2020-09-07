public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int i = number;
        int digit = 0 ;
        if(number==0){
            return false;
        }

        int rev= 0;
        while(!(i==0)){
            digit = i % 10 ;
            rev = rev * 10;
            rev = rev + digit;
            i = i /10 ;


        }
        System.out.println(rev);

        if(Integer.compareUnsigned(rev,number) == 0){
            return true ;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
       boolean a = isPalindrome(1441);
       boolean b =  isPalindrome(1321);
        boolean c =  isPalindrome(-121);
       System.out.println(a);
       System.out.println(b);
    }
}
