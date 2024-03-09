import java.util.*;

public class Multipy {


    public static int calucuMulti(int a, int b)
    {
        return a*b;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("the product of two no:"+calucuMulti(a, b));
    }
    
}
