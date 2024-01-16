public class Few_number_Functions
{
    int n;
    public void disarium(int n)
    {
        int a,s=0,p=0,d;
        a=n;
        while(n>0)
        {
            p++;
            n=n/10;
        }
        n=a; 
        while(n>0)
        {
            d=n%10;
            s=s+(int)Math.pow(d,p);
            p--;
            n=n/10;
        }
        n=a;
        if(s==n)
        System.out.println(n+" Is a Disarium no.");
        else
        System.out.println(n+" Is not a Disarium no.");
    }
    public void special(int n)
    { 
        int a,s=0,p=0,d;
        a=n;
        while(n>0)
        {
            d=n%10;
            p=1;
            for(int i=1;i<=d;i++)
            {
                p=p*i;
            }
            s=s+p;
            n=n/10;
        }
        if(s==a)
        System.out.println(a+" Is a Special no.");
        else
        System.out.println(a+" Is not a Special no.");
    }
    public void magical(int n)
    {
        int s=0,d;
        while(n>9)
        {
          while(n>0)
          {
            d=n%10;
            s=s+d;
            n=n/10;
          }
          n=s;
          s=0;
        }
        if(n==1)
        System.out.println("Special no.");
        else
        System.out.println("Not a Special no.");
    }
    public void palindrome(int n)
    {
        int rev=0,s,a;
        a=n;
        while(n>0)
        {
            s=n%10;
            rev=rev*10+s;
            n=n/10;
        }
        if(rev==a)
        System.out.println(a+" Is a Palindrome no.");
        else
        System.out.println(a+" Is not a Palindrome no.");
    }
    public void automorphic(int n)
    {
        int sq,t,c=0,p;        
        sq=n*n;
        t=n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        p=(int)Math.pow(10,c);
        if(sq%p==t)
        System.out.println(t+" Is an Automorphic no.");
        else
        System.out.println(t+" Is not an Automorphic no.");
    }
    public void armstrong(int n)
    {
        int d,s=0,a;        
        a=n;
        while(n>0)
        {
            d=n%10;
            s=s+d*d*d;
            n=n/10;
        }
        n=a;
        if(s==n)
        System.out.println(n+" Is an Armstrong no.");
        else
        System.out.println(n+" Is not an Armstrong no.");
    }
    public void prime(int n)
    {
        int c=1,i=1;        
        while(i<n)
        {
            if(n%i==0)
            c++;
            i++;
        }
        if(c==2)
        System.out.println("prime no.");
        else
        System.out.println("not a prime no.");
    }
    public void duck(int n)
    {
        int d,s=1,temp;        
        temp=n;
        while(n>0)
        {
            d=n%10;
            if(d==0)
            s=d;
            n=n/10;
        }
        n=temp;
        if(s==0)
        System.out.println(n+" Is a Duck no.");
        else
        System.out.println(n+" Is not a Duck no.");
    }
}
        