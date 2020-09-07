import java.util.Scanner;



class Datatypes{
    public static void main(String []args)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                int MaxInt = Integer.MAX_VALUE ;
                int MinInt = Integer.MIN_VALUE ;
                long MaxLong = Long.MAX_VALUE;
                long MinLong = Long.MIN_VALUE;
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)
                {
                    System.out.println("* short");
                }
                if(x>=-MinInt && x<=MaxInt) {
                    System.out.println("* int");
                }
                if(x>=-MinLong && x<=MaxLong) {
                    System.out.println("* long");
                }


                }
            catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }

            }
        }
    }

