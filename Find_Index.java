
/*  problem statement: take an array as input from the user. Search for a
  given number x and print the index at which it occure*/

  import java.util.Scanner;

public class Find_Index {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of array:");
    int size = sc.nextInt();
    //define the array
    int age[] = new int[size];

    System.out.println("taking input......");
    for(int i = 0;i<size;i++)
    {
         age[i] = sc.nextInt();
    }
     System.out.print("enter the number you want to find:");
    int x  = sc.nextInt();
    System.out.println("for finding index of given x...");
   
    for(int i = 0;i<size;i++)
    {
          
         if(age[i]==x)
         {
            System.out.println("the number is find at the index is :"+i);
         }
         else{
            System.out.println("this number not found");
            break;
         }
    }
    sc.close();
}
    
}
