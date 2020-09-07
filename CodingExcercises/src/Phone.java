import java.util.Scanner;

public class Phone {
    private static Scanner scan =  new Scanner(System.in);

    public static  void main(String args[]){
        Instruction();
        System.out.println("Enter your Option No :- \r");

        boolean quit = false;
        while(quit == false) {
            int NoOption = scan.nextInt();
            scan.nextLine();
            switch (NoOption) {
                case 0:
                    Instruction();

                    break;
                case 1:
                    display();

                    break;
                case 2:
                    add();

                    break;
                case 3:
                    modify();

                    break;
                case 4:
                    remove();

                    break;
                case 5:
                    search();

                    break;
                case 6:
                    quit = true;

                    break;
                default:
                    System.out.println("Please Enter Valid Options");


            }
        }
    }

    public static void Instruction(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To display Contacts .");
        System.out.println("\t 2 - To add Contacts.");
        System.out.println("\t 3 - To modify a Contact");
        System.out.println("\t 4 - To remove a Contact.");
        System.out.println("\t 5 - To search for a Contact.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void display(){
        MobilePhone.DisplayContacts();
    }
    public static void add(){
        System.out.println("Enter The Name of the Contact :");
        String Name = scan.nextLine();

        System.out.println("Enter The No of the Contact :");
        String phone = scan.nextLine();
        MobilePhone.add(Name,phone);




    }
    public static void modify(){
        System.out.println("Enter The Name of the Contact To be Modified :");
        String Name = scan.nextLine();


        System.out.println("Enter The New Name of the Contact :");
        String rename = scan.nextLine();
        MobilePhone.modify(Name,rename);

    }
    public static void remove(){
        System.out.println("Enter the contact needed to delete :");
        String name = scan.nextLine();
        MobilePhone.remove(name);
    }

    public static void search(){
        System.out.println("Enter the Contact needed to search :");
        String name = scan.nextLine();
       boolean ab =  MobilePhone.CheckContact(name);
        if(ab == true) {
            System.out.println("The Contact is present in the Phone");
        }
            else{
                System.out.println("The Contact is not present in the Phone");
            }
        }


}
