import java.util.*;
public class for_15_q
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        double r=0.0;
        for (int i=1;i<=n;i++)
        {
            r=(double)1.0/i;
            System.out.print(r+",");
        }
    }
}