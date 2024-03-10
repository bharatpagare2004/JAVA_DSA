// problem statement:take a matrix as input from the user .search for a given number x and print the indices at which it occurs


import java.util.*;
public class D_Array {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the size of r&c:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // define the 2d array
        int [][] mat = new int[row][col];

        // for input
        System.out.print("enter your input:");
        for(int i = 0;i<row;i++)
        {
            for(int j= 0 ;j<col;j++)
            {
                 mat[i][j] = sc.nextInt();
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

        System.out.print("enter the number for find:");
        int x = sc.nextInt();
        for(int i = 0 ;i<row;i++)
        {
            for(int j = 0 ;j<col;j++)
            {
                if(mat[i][j]==x)
                {
                    System.out.println("x found at location ("+ i +","+ j + ")" );
                }
            }
        }

        sc.close();
        

    }
    
}
