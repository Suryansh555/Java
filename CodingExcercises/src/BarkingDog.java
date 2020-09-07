public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking , int hourOfDay) {
        boolean wakeup ;
        if(hourOfDay > 22 && hourOfDay < 8 && hourOfDay < 24 && hourOfDay >= 0){
            if(barking == true){
                return wakeup = true;
            }
            else {
                return wakeup = false ;

            }
        }
        else{
               return wakeup = false ;
        }

    }
}
