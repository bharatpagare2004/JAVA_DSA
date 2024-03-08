import java.util.*;

public class Find_Gre {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 and number2:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==num2)
        {
           System.out.println("equal");
        }
        else if( num1 >num2)
        {
            System.out.println("num1 is greater");
        }
        else
        {
            System.out.println("num2 is greater");
        }
        sc.close();
    }
    
    
}
