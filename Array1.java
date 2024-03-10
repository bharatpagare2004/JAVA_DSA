// this program for printing the name with the help of array...

import java.util.*;

class Array1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of string array:");
        int input = sc.nextInt();

        String name[] = new String[input];
        
        System.out.print("taking input:");
        for(int i = 0;i<input;i++)
        {
            name[i] = sc.next();

        }

        System.out.println("printing......");
        for(int i = 0;i<name.length;i++)
        {

            System.out.println("name"+(i+1)+"is: "+name[i]);
        }
  sc.close();

    }
}