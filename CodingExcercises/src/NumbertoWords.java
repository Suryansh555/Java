public class NumbertoWords {
    public static void numberToWords(int number){
        if(number <0){
            System.out.println("Invalid Value");
        }
        else{
            int i = number;
            int digit = 0 ;

            if(number == 0) {
                System.out.println("Zero");
            }
//            if((getDigitCount(number) == 1) && (number > 0)) {
//                switch (number){
//                    case 0 :
//                        System.out.print("Zero ");
//                        break;
//                    case 1 :
//                        System.out.print("One ");
//                        break;
//                    case 2 :
//                        System.out.print("Two ");
//                        break;
//                    case 3 :
//                        System.out.print("Three ");
//                        break;
//                    case 4 :
//                        System.out.print("Four ");
//                        break;
//                    case 5 :
//                        System.out.print("Five ");
//                        break;
//                    case 6 :
//                        System.out.print("Six ");
//                        break;
//                    case 7 :
//                        System.out.print("Seven " );
//                        break;
//                    case 8 :
//                        System.out.print("Eight ");
//                        break;
//                    case 9 :
//                        System.out.print("Nine ");
//                        break;
//                }
//            }

            int ad =getDigitCount(i);


i = reverse(i);
 int bc =getDigitCount(i);


            while(!(i==0)){
                digit = i % 10 ;
                switch (digit){
                    case 0 :
                        System.out.print("Zero ");
                        break;
                    case 1 :
                        System.out.print("One ");
                        break;
                    case 2 :
                        System.out.print("Two ");
                        break;
                    case 3 :
                        System.out.print("Three ");
                        break;
                    case 4 :
                        System.out.print("Four ");
                        break;
                    case 5 :
                        System.out.print("Five ");
                        break;
                    case 6 :
                        System.out.print("Six ");
                        break;
                    case 7 :
                        System.out.print("Seven " );
                        break;
                    case 8 :
                        System.out.print("Eight ");
                        break;
                    case 9 :
                        System.out.print("Nine ");
                        break;
                }
                i = i / 10 ;

                }
            if(ad==bc){

            }
            else {
                switch (ad-bc) {

                    case 1:
                        System.out.print("Zero");
                        break;
                    case 2:
                        System.out.print("Zero Zero");
                        break;
                    case 3:
                        System.out.print("Zero Zero Zero");
                        break;
                    case 4:
                        System.out.print("Zero Zero Zero Zero");
                        break;


                }
            }


        }

        }


    public static int reverse(int  a){
       int j = a;
       int num1 = 0;
       int rev = 0;
       if (j<0){
           j = 0 - j ;
       }
       while (j>0){
           num1 = j%10;
           rev = rev * 10 ;
           rev = rev + num1;
           j = j/10;
       }
       if(a<0){
           return -rev;
       }else{
           return rev;
       }


    }
    public static int getDigitCount(int number){
        if(number<0) {
            return -1;
        }
        else {
            int ab = 0;
            int k = number;
            while(!(k==0)){
                ab++;
                k=k/10;


            }
            if(number==0){
                ab = 1;
            }
            return ab ;
        }

    }
    public static void main (String args[]){
      // System.out.println(reverse(5));
       numberToWords(1450);
      // System.out.println(getDigitCount(25));

    }
}
