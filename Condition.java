import java.util.*; // all package


class Condition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You Can Vote..");
        }
        else{
            System.out.println("You Can Not Vote");
        }
        sc.close();


    }
}