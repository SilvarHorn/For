import java.util.*;
public class for_15_d
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i+=2)
        {
            System.out.print(i+",");
        }
    }
}