import java.util.Scanner;
class Duck_number extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Duck_number obj=new Duck_number();
        obj.duck(n);
    }
}
