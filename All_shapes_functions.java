class All_shapes_functions
{
    public void shape1()
    {
        int r, c;
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=3;c++)
            {
                if(r+c<=5)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            for(c=1;c<=4;c++)
            {
                if(r<=c)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            System.out.println( );
        }
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=3;c++)
            {
                if(r>=c)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            for(c=1;c<=4;c++)
            {
                if(r+c>=5)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            System.out.println( );
        }
    }
    public void shape2()
    {
            int r, c;
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=3;c++)
            {
                if(r+c>=5)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            for(c=1;c<=4;c++)
            {
                if(r>=c)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            System.out.println( );
        }
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=3;c++)
            {
                if(r+c<=5)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            for(c=1;c<=4;c++)
            {
                if(r<=c)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            System.out.println( );
        }
    }
    public void shape3()
    {
        int r, c;
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=3;c++)
            {
                if(r>=c)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            for(c=1;c<=4;c++)
            {
                if(r+c>=5)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            System.out.println( );
        }
         for(r=1;r<=4;r++)
        {
            for(c=1;c<=3;c++)
            {
                if(r<=c)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            for(c=1;c<=4;c++)
            {
                if(r+c<=5)
                System.out.print("1 \t");
                else
                System.out.print("\t");
            }
            System.out.println( );
        }
    }
    public void shape4()
    {
          System.out.println(" 1         1   1 1 ");
        System.out.println(" 1         1  1   ");
        System.out.println("  1       1  1 ");
        System.out.println("   1     1 1 ");
        System.out.println("    1   1   1");
        System.out.println("     1 1     1   1");
        System.out.println("      1       1 1 ");
    }
}
