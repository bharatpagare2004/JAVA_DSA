import java.util.*;


public class Function1 {

    public static int calculateSum(int a,int b)
    {
        int sum =a+b;
        return sum;
    }



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  two number for sum :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum = calculateSum(a, b);
        System.out.println("the sum is:"+sum);

          
    }
    
}
