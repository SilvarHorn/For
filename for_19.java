import java.util.*;
public class for_19
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m1=0,m2=0,t=0;
        double a=0.0;
        for (int i=1;i<=5;i++)
        {
            System.out.print("Enter marks in English I: ");
            m1=sc.nextInt();
            System.out.print("Enter marks in English II: ");
            m2=sc.nextInt();
            t=m1+m2;
            a=t/2.0;
            System.out.println("Total marks: "+t);
            System.out.println("Average marks: "+a);
        }
    }
}