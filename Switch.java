
import java.util.*;
public class Switch {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice:");
        int button = sc.nextInt();
        switch(button) 
        {
            case 1 : System.out.println("Hello");
             break;
            case 2 :System.out.println("Namaste");
             break;
            case 3 :System.out.println("G");
            break;
            default: System.out.println("invalid choice");
               
        }
        sc. close();

        
    }
    
}
