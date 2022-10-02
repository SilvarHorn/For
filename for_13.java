import java.util.*;
public class for_13
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}