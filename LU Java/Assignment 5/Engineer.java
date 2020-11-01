public class Engineer extends Employee{
    private	String Stream;
    private int no_of_projects_workedon;
    void getdetails1() {
        System.out.println("Enter no of projects worked on ");
        this.no_of_projects_workedon=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Stream");
        this.Stream=sc.nextLine();

    }
    void displaydetails1() {
        System.out.println("-------------------------------");
        System.out.println(" Stream :"+this.Stream);
        System.out.println(" No of projects worked on :"+this.no_of_projects_workedon);
        System.out.println("-------------------------------");
    }
}
