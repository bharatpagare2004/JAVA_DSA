// this program for how to take input in the program..


// for input we need to import java.util.*;
import java.util.*;


class Input {
    public static void main(String args[])
    {
        //for input
        Scanner sc = new  Scanner(System.in);
        System.out.print("enter your name :");
        String name = sc.nextLine();
        // nextInt
        // nextFloat
        System.out.println("Your name is :"+name);
        sc.close();
        
        

    }
    
}
