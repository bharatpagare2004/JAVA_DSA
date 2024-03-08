import java.util.*;


public class First_Na {
    
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the natural number you want to find sum:");
    int num = sc.nextInt();
    int sum = 0;
    for(int i = 0;i<=num;i++)
    {
        sum = sum +i;
    }
    System.out.println("The sum of that number is:"+sum);
    sc.close();
    }
   
}
