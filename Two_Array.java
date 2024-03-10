import java.util.*;

public class Two_Array {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the r & c:");
        int row = sc.nextInt();
        int col = sc.nextInt();
         // declaration of two-d array

         int [][]mat = new int[row][col];
         System.out.print("enter the input number:");

         for(int i = 0;i<row;i++)
         {
           for(int j = 0 ;j<col;j++)
           {
             mat[i][j]=sc.nextInt();
           }
         }
       System.out.println("the matrix is :");
         for(int i = 0;i<row;i++)
         {
            for(int j = 0;j<col;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
         }
   sc.close();
    }
    
}
