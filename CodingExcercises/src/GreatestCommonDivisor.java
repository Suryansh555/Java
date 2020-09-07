public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int i = 1;
        int j = 1;
        int num = 0;
        int num1 = 0;
        int acc = 0 ;
        if (first > 9 && second > 9) {
            while (!(i == first + 1)) {
                if (first % i == 0) {
                    num = i;
                }


                j = 1;
                while (!(j == second + 1)) {
                    if (second % j == 0) {
                        num1 = j;
                    }
                    j++;
                        if(num == num1){
                            acc = num;
                        }



                }
                i++;

            }
            return acc;

        }
        else {
            return -1;
        }
    }
    public static void main(String args[]){
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(10,35));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
}
