
// for diamond
public class Dimond {

    public static void main(String args[])
    {
        
        int n = 4;
        for(int i = 1;i<=n;i++)
        {
            // for spaces 
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=2*i-1;j++)
            {
                System.out.print("*");

            }
            System.out.println();

            
        }
        // lower half
        for(int i = n;i>=1;i--)
        {
            // for spaces 
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=2*i-1;j++)
            {
                System.out.print("*");

            }
            System.out.println();

            
                
    
            }
            

        }
    }
    

