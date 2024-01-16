import java.util.Scanner;
class Armstrong_ extends Few_number_Functions
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        Armstrong_ obj=new Armstrong_();
        obj.armstrong(n);
    }
}