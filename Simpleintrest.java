import java.util.Scanner;
public class Simpleintrest 
{
    public static void main(String[] args)
    {
        int SI;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Principal:");
        int p=scan.nextInt();
        System.out.println("Enter the Time in years:");
        int t=scan.nextInt();
        System.out.println("Enter the Rate:");
        int r=scan.nextInt();
        SI=(p*t*r)/100;
        System.out.println("Simple Intrest:"+SI);
    }
}
