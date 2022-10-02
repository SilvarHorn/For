import java.util.*;
public class for_15_cc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            if (i%2!=0)
            {
                System.out.print((-i)+",");
            }
            else
            {
                System.out.print(i+",");
            }
        }
    }
}