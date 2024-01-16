import java.util.Scanner;
public class Automorphic extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Automorphic obj=new Automorphic();
        obj.automorphic(n);
    }
}