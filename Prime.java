import java.util.Scanner;
class Prime extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Prime obj=new Prime();
        obj.prime(n);
    }
}
