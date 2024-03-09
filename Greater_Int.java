
import java.util.*;
public class Greater_Int {

    public static int greater(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the two no:");
        int a =sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        greater(a, b);
        System.out.println("the greater no:"+greater(a, b));
    }
    
}
