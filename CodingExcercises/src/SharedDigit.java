public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        int num1 , num = 0;
        int c = b;
  if ((a>9) && (b>9) && (a<100) && (b<100)){
      while (a > 0){
          num = a %10 ;
          a = a /10 ;
          b = c;
          while (b > 0){
              num1 = b %10 ;
              b = b / 10 ;
              if(num == num1){
                  return true ;
              }

          }


      }
  }
  return false ;
    }

    public static void main (String args[]){
        System.out.println(hasSharedDigit(5, 55));
        System.out.println(hasSharedDigit(13, 15));
        System.out.println(hasSharedDigit(56, 55));
        System.out.println(hasSharedDigit(15, 64));
    }
}
