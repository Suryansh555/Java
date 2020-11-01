public class Main1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Engineer [] ar1=new Engineer[3];
        Doctor [] ar2=new Doctor[3];
        Pilot [] ar3=new Pilot[3];
        for(int i=0;i<=2;i++) {
            ar1[i]=new Engineer();
            ar1[i].getdetails();
            ar1[i].getdetails1();

        }
        for(int i=0;i<=2;i++) {
            ar2[i]=new Doctor();
            ar2[i].getdetails();
            ar2[i].getdetails1();

        }
        for(int i=0;i<=2;i++) {
            ar3[i]=new Pilot();
            ar3[i].getdetails();
            ar3[i].getdetails1();

        }

        for(int i=0;i<1;i++) {
            ar1[i].displaydetails();
            ar1[i].displaydetails1();
            ar2[i].displaydetails();
            ar2[i].displaydetails1();
            ar3[i].displaydetails();
            ar3[i].displaydetails1();
        }

    }


}