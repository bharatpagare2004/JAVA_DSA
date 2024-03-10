
// finding the min and max number in the array...

import java.util.*;
public class Max_Min {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size = sc.nextInt();

        int num[] = new int[size]; // define the array..
        
        for(int i = 0 ;i<size;i++)
        {
            num[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE; // 
        int max = Integer.MIN_VALUE; // 

        for(int i = 0;i<num.length;i++)
        {
            if(num[i]<min) 
            {
                min = num[i];
            }
            if(num[i]>max)
            {
                max = num[i];
            }
        }

        System.out.println("largest: " + max);
        
        System.out.println("Smallest: " + min);
 
        sc.close();
    }
    
}
