public class Main {

    public static void main(String args[]){
        HamBurger hamburger = new HamBurger("Basic","Sausage",3.56 ,"White" );
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato" , 0.3);
        hamburger.addHamburgerAddition2("lettuce" ,0.6);
        hamburger.addHamburgerAddition3("carrort",0.6);
        hamburger.addHamburgerAddition4("Cheese",0.5);
        System.out.println(hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Chicken",5.87);
        healthyBurger.addHealthyAddition1("Egg",2.54);
        healthyBurger.addHealthyAddition2("Cheese",0.45);
        healthyBurger.itemizeHamburger();


    }
}
