public class Vip {
    public static void main(String args[]){
        ViPCustomer SuryanshViP = new ViPCustomer("Suryansh",1000,"Suryansh555@yahoo.in");
        System.out.println(SuryanshViP.getName());

        ViPCustomer UnnatiViP = new ViPCustomer("Unnati",900);
        System.out.println(UnnatiViP.getEmailAddress());

        ViPCustomer ManishaViP = new ViPCustomer("Manisha");
        System.out.println(ManishaViP.getCreditLimit());
        
    }
}
