import java.util.*;
public class for_21
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double n=sc.nextDouble();
        double c=((n-32)*5.0)/9.0;
        System.out.println("Temperature in Celcius: "+c);
    }
}