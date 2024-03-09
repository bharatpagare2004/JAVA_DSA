import java.util.*;

public class Factorial {


    // this fuction for factorial
    public static void factorialNum( int n)
    {
        int fact = 1;
        
        if(n<0){
            System.out.println("invalid number");
            return;   
        }
        
        for(int i = n;i>=1;i--)
        {
            fact = fact *i;      
        }
        System.out.println("the factorial is :"+fact); 
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter:");
        int n = sc.nextInt();
        sc.close();
        factorialNum(n);
    }
}
