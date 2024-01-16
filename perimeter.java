import java.io.*;
class perimeter
{
    
    void input()throws IOException
    {
    }
    int P1(int a ,int b)
    {
        
        int p=2*(a+b);return p;
    }
    int P2(int a)
    {
        int p=4*a;return p;
    }
    int P3(int a,int b,int c)
    {
        int p=a+b+c;return p;
    }
    double P4(double r)
    {
        double p=2*22/7*r*r;return p;
    }
    public static void main()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int l,b,s,s1,s2,s3,p1,p2,p3;
        double r,p4;
        System.out.println("Enter length and breadth of rectangle;\nside of square;\nsides of triangle;\nradius of circle");
        l=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        s=Integer.parseInt(br.readLine());
        s1=Integer.parseInt(br.readLine());
        s2=Integer.parseInt(br.readLine());
        s3=Integer.parseInt(br.readLine());
        r=Double.parseDouble(br.readLine());
    
        perimeter obj=new perimeter();
        
        p1=obj.P1(l,b);
        p2=obj.P2(s);
        p3=obj.P3(s1,s2,s3);
        p4=obj.P4(r);
        System.out.println(p1+" "+p2+" "+p3+" "+p4);
    }
}
        