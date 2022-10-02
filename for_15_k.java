import java.util.*;
public class for_15_k
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=10;i<=n;i+=10)
        {
            System.out.print(i+",");
        }
    }
}