public class AllFactors {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        else{
            int i = 1;
            int num = 0;
            while (!(i == number +1)){
                num = number % i ;
                if(num == 0){
                    System.out.println(i + "");
                }
                i++;

            }
        }
    }
}
