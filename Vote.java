// Write the function that takes in age as input and returns if that person is eligible to vote or not .A person of age >18 is eligible to vote...

import  java.util.*;
public class Vote {

    public static boolean vote(int age)  // here we use boolean data type.....
    {
        if(age>=18)
        {
            System.out.println("You can Vote");
            return true;
            
        }
        else{
            System.out.println("you cannot Vote");
            return false;
        }
    

    }

     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age:");
        int age = sc.nextInt();

        vote(age);

     }
    
}
