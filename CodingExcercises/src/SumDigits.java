public class SumDigits {
    public static int sumDigits(int number) {
        if ((number >= 10) && number > -1) {
            int i = number;
            int res = 0;
            while (i > 0) {
                int a = i % 10;
                res = res + a;
                i = i / 10;
            }
            System.out.println(res);
        }

            return -1;
        }

    public static void main(String args[]){
           sumDigits(1421);
           sumDigits(125);
}
}
