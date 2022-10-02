import java.util.*;
public class for_15_b
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=n;i>=1;i--)
        {
            System.out.print(i+",");
        }
    }
}