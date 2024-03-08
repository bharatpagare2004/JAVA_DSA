import java.util.*;
class Odd_Even
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        if(num%2 == 0)
        {
            System.out.println("the given number is even");
        }
        else{
            System.out.println("the given number is odd");
        }
        sc.close();

    }
}
