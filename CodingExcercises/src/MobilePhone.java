import java.util.ArrayList;

public class MobilePhone {
    private static ArrayList<String> Contacts = new ArrayList<String>();
    private String myNumber;



    public static void add(String name , String no){
        boolean present = CheckContact(name);
        if(present==true){
            System.out.println("Contact with name " + name + " already present ");

        }else{
            Contacts.add(name);

            Contact contact = Contact.createContact(name,no);
            System.out.println("Contact has been created");
        }


    }
    public static int getIndex(String name){
        int num = Contacts.indexOf(name);
        return  num ;
    }
    public static boolean CheckContact(String name){
        boolean contact = Contacts.contains(name);
        return contact;
    }
    public static void modify(String name , String replace ){
       boolean present = CheckContact(name);
       if(present==true){
           System.out.println("Contact Name : " + name + " is replaced by " + replace);
           int num = getIndex(name);
           Contacts.set(num,replace);
          // System.out.println("The no of replace has been replaced with " + no);




       }else{
           System.out.println("The Contact is not present ");
       }



    }
    public static void remove(String name){
        boolean present = CheckContact(name);
        if(present==true){
            System.out.println("Contact Name : " + name + " has been removed ");
            int num = getIndex(name);
            Contacts.remove(num);



        }else{
            System.out.println("The Contact is not present ");
        }
    }

    public static void DisplayContacts(){
        if(Contacts.size() == 0){
            System.out.println("There is no Contact saved");
        }
        for(int i = 0 ; i < Contacts.size() ; i ++){
            System.out.println("Contacts : \n " + (i+1) + ". " + Contacts.get(i)  );
        }
    }



}
