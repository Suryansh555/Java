public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        int megabytes = kilobytes/1024;
        int remainingkilo = kilobytes%1024;
        if(kilobytes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainingkilo + " KB");
        }


    }
}
