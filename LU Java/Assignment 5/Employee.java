import java.util.Scanner;
public class Employee {
    protected String name;
    protected	int age;
    protected	double sal;
    protected	String desg;
    Scanner sc=new Scanner(System.in);
    void getdetails() {
        System.out.println(" Enter Employee details \n Enter Name");
        this.name=sc.nextLine();
        System.out.println(" Enter Designation");
        this.desg=sc.next();
        sc.nextLine();
        System.out.println("  Enter age");
        this.age=sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter Salary");
        this.sal=sc.nextDouble();
        //System.out.println(" Executed ");
    }
    void displaydetails() {
        System.out.println("-------------------------------");
        System.out.println("Name :"+ this.name);
        System.out.println("Age : "+ this.age);
        System.out.println("Salary : "+ this.sal);
        System.out.println("Designation : "+ this.desg);
    }
}