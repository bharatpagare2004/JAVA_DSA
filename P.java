public class P {

    public static void main(String args[])
    {
        int n =10;
        for(int i = 1;i<=n;i++)// this outer loop...
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("   ");

        } 
    }

    
}
