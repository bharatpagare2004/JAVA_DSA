
import java.util.*;
public class Selection_Sort {


    public static void sortArray(int arr[])
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
        int arr[] = new int[size];
        System.out.print("enter the element:");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        sortArray(arr);
        sc.close();
    }
    
    
}
