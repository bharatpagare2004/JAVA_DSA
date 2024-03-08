

/*printing this pattern
                   * * * * * 
                   *       *
                   *       *
                   * * * * *
*/
                    

import java.util.*;

public class Rect {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n*m value:");
        int n = sc.nextInt();
        int m = sc.nextInt();
       // int n = 10; // for row
        //int m = 10; // for column
        System.out.println("following pattern");
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=m;j++)
            {
                if(i==1||j==1||i==n||j==m)
                {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
        } 
        System.out.println();
    }
    sc.close();
    
}
}
