import java.util.Scanner;
class Disarium extends Few_number_Functions

{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Disarium obj=new Disarium();
        obj.disarium(n);
    }
}