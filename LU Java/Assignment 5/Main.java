public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee [] ar1=new Employee[3];
        for(int i=0;i<=2;i++) {
            ar1[i]=new Employee();
            ar1[i].getdetails();
        }

        for(int i=0;i<=2;i++) {
            ar1[i].displaydetails();
        }

    }


}
