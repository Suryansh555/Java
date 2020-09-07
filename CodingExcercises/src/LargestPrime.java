public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 2)
            return -1;
        for(int i=2; i <= number/2; i++) {
            System.out.println(i);
            if(number%i == 0) {
                number = number/i;
                i=1;
            }
        }
        return number;
    }
    public static void main(String args[]){
        System.out.println(getLargestPrime(45));
    }
}
