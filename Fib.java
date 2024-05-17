import java.util.Scanner;
public class Fib
{
    public static void main(String[] args)
    {
        int a=0,b=1;
        int sum;
        int i;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the range of numbers:");
        int n=scan.nextInt();
        System.out.print(+a +b);
        for(i=2;i<n;i++)
        {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }


    }
}
