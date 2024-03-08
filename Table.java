// print the table of 2 // or any number.....

import java.util.*;

public class Table {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number your want find the table:");
        int digit = sc.nextInt();
        for(int i =1; i<=10;i++)
        {
            
            System.out.println(digit*i);
        }
        sc.close();

    
    }


    
}
