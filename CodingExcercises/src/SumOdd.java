public class SumOdd {
    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int a = start;
        int b = end;
        int sum = 0;
        if ((a <= b) && (a > 0) && (b > 0)) {
            for (; a <= b; a++) {
                if (isOdd(a)) {
                    sum = sum + a;
                }
                else {
                    //return -1;
                }

            }
            return sum;

        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}


