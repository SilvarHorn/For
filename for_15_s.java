import java.util.*;
public class for_15_s
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r=0;
        for (int i=1;i<=n;i++)
        {
            r=(r*10)+i;
            System.out.print(r+",");
        }
    }
}