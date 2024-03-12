
import java.util.*;
public class Selection_Sort_Pra {

    // for printing 
    public static void print(int arr[])
    {
    for(int i = 0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size = sc.nextInt();

       

        // define the array
        int arr[] = new int[size];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the element:");
        for(int i = 0;i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++)
            {
                  if(arr[smallest]>arr[j])
                  {
                    smallest = j;
                  }

                }
                   
                  int tem = arr[smallest];
                  arr[smallest] = arr[i];
                  arr[i] = tem;


            
        }
        print(arr);
       sc.close();

    }
    
}
