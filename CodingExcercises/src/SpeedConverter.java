public class SpeedConverter {


        public static long toMilesPerHour(double kilometersPerHour)
        { long miles;
            if(kilometersPerHour<0){
                return miles = -1 ;
            }
            else{
                miles = Math.round(kilometersPerHour/1.609);
                return miles;
            }
        }
        public static void printConversion (double kilometersPerHour){
            if (kilometersPerHour<0){
                System.out.println("Invalid Value");
            }
            else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h" );
        }

    }

