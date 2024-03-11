// this program for butterfly pattern



public class Butterfly_Patt {

    public static void main(String args[])
    {
      int n = 5;
      // for upper half

      for(int i = 1 ;i<= n ;i++)
      {
        //first part
        for(int j = 1;j<=i;j++)
        {
            System.out.print("*");
        }
        // spaces 
        int spaces = 2 *(n-i);
        for(int j = 1 ;j<=spaces;j++)
        {
            System.out.print(" ");
        }
        
        // for second part
        for(int j = 1;j<=i;j++)
        {
            System.out.print("*");
        } 
        System.out.println();
      }

      // lower half
      for(int i = n ;i>=1 ;i--)
      {
        //first part
        for(int j = 1;j<=i;j++)
        {
            System.out.print("*");
        }
        // spaces 
        int spaces = 2 *(n-i);
        for(int j = 1 ;j<=spaces;j++)
        {
            System.out.print(" ");
        }
        
        // for second part
        for(int j = 1;j<=i;j++)
        {
            System.out.print("*");
        } 
        System.out.println();
      }
      
      
     


    }
    
}
