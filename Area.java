import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        int l,b;
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter length:");
        int l=scan.nextInt();
        System.out.print("Enter breadth:");
        int b=scan.nextInt();
        a=l*b;
        System.out.println("Area="+a);
    }
}
