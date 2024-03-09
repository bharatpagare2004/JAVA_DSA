// by using int returndata type function
import java.util.*;

public class Average_Int {

    // fuction
    public static float ave(int a,int b ,int c)
    {
        return (a+b+c)/3;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the three no:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("the three no ave is :"+ave(a, b, c));
    }
    
}
