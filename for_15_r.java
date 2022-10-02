import java.util.*;
public class  for_15_r
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r=0;
        for (int i=1;i<=n;i++)
        {
            r=(r*10)+1;
            System.out.print(r+",");
        }
    }
}