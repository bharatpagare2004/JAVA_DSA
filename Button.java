import java.util.*;
public class Button {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the the option:");
        int button = sc.nextInt();
        if(button ==1)
        {
            System.out.println("Hello");
        }
        else if(button == 2)
        {
            System.out.println("Namsate");
        }
        else if(button == 3)
        {
            System.out.println("G");
        }

       sc.close();  
    }
    
}
