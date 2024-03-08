
import java.util.*;

public class Practice {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value a*b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // a value for row purpose...
        // b value for column purpose...
        for(int i = 1;i<=a;i++)
        {
            for(int j = 1;j<=b;j++)
            {
                if(i == 1||j==1||i==a||j==b)
                {
                    System.out.print(" & ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

     sc.close();

    }
    
}
