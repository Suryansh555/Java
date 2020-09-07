public class Contact {
    private String name;
    private String phonenumber;

    public Contact(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static Contact createContact(String name ,String phonenumber) {
        return new Contact(name, phonenumber);
    }
    public void Update(String name ,  String phone ){
          this.name = name ;
          this.phonenumber = phone;
    }
    public void remove(String name , String phone){
        this.name = "";
        this.phonenumber = "";
    }



}

