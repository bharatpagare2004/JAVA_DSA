import java.util.*;

public class User_Define {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size = sc.nextInt();
       

        int marks[] = new int[size];
      // taking input 
      for(int i = 0;i<size;i++)
      {
        marks[i] = sc.nextInt();
      }

     // this is for output purpose....

     System.out.println("this is output.....");
        for(int i = 0;i<size;i++)
        {
            System.out.println(marks[i]);
        }

 
  sc.close();
        
    }
    
}
