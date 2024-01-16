import java.util.Scanner;
class Magical extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Magical obj=new Magical();
        obj.magical(n);
    }
}