import java.util.*;

// simple calculator....
public class Simple_Cal {

    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("\n@CHOICE@ \nch-1 : addition \nch-2 : sub \nch-3 : mul \nch-4 : div \nenter your choice:");
        int ch = sc.nextInt();
        float sum ;
        int diff ;
        int mul ;
        int div ;
        switch(ch)
        {
            case 1: sum = a+b;
              System.out.println("THE ADDITION OF TWO NUMBER:"+sum);
            break;
            case 2 :diff = a-b;
            System.out.println("THE SUB OF TWO NUMBER:"+diff);
              
            break;
            case 3:mul = a*b;
            System.out.println("THE MULTIPLICATION:"+mul);
             break;
             case 4:div = a/b;
             System.out.println("THE DIVISION IS:"+div);
             break;

        }
   sc.close();

    }
    
}
