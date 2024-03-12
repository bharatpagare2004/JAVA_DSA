
import java.util.*;
public class Bubble_Sort {


    public static void sortedArray(int arr[] )
    {

        // for printing
        for(int i =0;i<arr.length;i++)
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

        int arr[] = new int[size];
        System.out.print("enter the array element:");
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        // bubble sort

        for(int i =0 ;i<arr.length-1;i++)
        {
            for(int j =0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swaping
                   int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;


                }
            }


        }
  sc.close();
        sortedArray(arr);
    }
    
}
