// transpose of matrix

import java.util.*;
public class Transpose {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r and c: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][]= new int[r][c];
        
        System.out.print("for input>>>");

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("for transpose");
        for(int j = 0;j<c;j++)
        {
            for(int i=0; i<r;i++)
            {
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }


  sc.close();
    }
    
}
