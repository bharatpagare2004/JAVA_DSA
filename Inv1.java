

import java.util.*;
public class Inv1 {


    public static void main(String args[])
    {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to print upto:");
        int n = sc.nextInt();
        sc.close();

       
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("  ");
        }
    }
    
}
