// write a function to print the sum of all odd numbers from 1 to n
import java.util.*;
public class Sum_Odd {
    public static void sumOdd(int a)
    {
        int sum =0;
        for(int i =1;i<=a;i++)
        {           
            if(i%2!=0)
            {
                sum = sum +i;   
            }    
        }
        System.out.println("the sum of odd no is :"+sum); 
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to find the odd no.sum upto:");
        int a = sc.nextInt();
        sc.close();
      
        sumOdd(a);

    }
    
}
