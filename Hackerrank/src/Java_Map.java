import java.util.*;

public class Java_Map {

    public static void main(String[] argh) {
        Map<String, Integer> kaish ;
        kaish = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
        kaish.put(name,phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
           if(kaish.containsKey(s)){
               System.out.println(s  + "=" + kaish.get(s));
           }else{
               System.out.println("Not found");
           }
        }
    }
}