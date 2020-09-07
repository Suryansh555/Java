public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a , double b ){
        a = a * 1000 ;
        b = b * 1000 ;
        int c =(int)a ;
        int d =(int)b ;
        if(c==d){
            return true;
        }
        else{
            return false ;
        }

    }
}
