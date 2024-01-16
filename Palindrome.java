import java.util.Scanner;
class Palindrome extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Palindrome obj=new Palindrome();
        obj.palindrome(n);
    }
}