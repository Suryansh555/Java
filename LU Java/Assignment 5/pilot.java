public class Pilot extends Employee  {
    private int No_of_flights;
    private String Type_of_airliner;
    void getdetails1() {
        System.out.println("Enter type of airliner");
        this.Type_of_airliner=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter No of flights");
        this.No_of_flights=sc.nextInt();

    }
    void displaydetails1() {
        System.out.println("No of flight :"+this.No_of_flights);
        System.out.println("Type of airliner:"+this.Type_of_airliner);
    }
}
