import java.util.*;
public class for_15_p
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r=0;
        for (int i=0;i<=n;i++)
        {
            r=(int)Math.pow(10,i);
            System.out.print(r+",");
        }
    }
}