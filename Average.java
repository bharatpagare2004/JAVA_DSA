// enter the 3 number from the user and make a fuctinon to print their average..

import java.util.*;
public class Average {

    public static void average(int a,int b,int c)
    {
        int avg = (a+b+c)/3;
        System.out.println("the average of three no is :"+avg);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the three no:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        average(a, b, c);
    }   
}
