import java.util.*;

public class Cir {


    public static double cir_circle(double r)
    {
        return  (2*3.14)*r;
       
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius:");
        double r =sc.nextDouble();
        sc.close();

        System.out.println("the circumference of circle is :"+cir_circle(r));
    }
    
}
