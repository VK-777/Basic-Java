import java.util.Scanner;
class Special extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Special obj=new Special();
        obj.special(n);
    }
}