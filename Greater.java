// write a function which takes in 2 numbers and returns the greater of those two

import java.util.*;
public class Greater {

    public static void greater(int a,int b)
    {
        if(a==b)
        {
            System.out.println("both no are same:"+a);
        }
        else if(a>=b)
        {
            System.out.println("a is greater:"+a);
        }
        else if(b>=a)
        {
            System.out.println("b is greater:"+b);
        }

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the two no:");
        int a =sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        greater(a, b);

     
    }
    
}
