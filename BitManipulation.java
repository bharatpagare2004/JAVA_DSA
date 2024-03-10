import java.util .*;

public class BitManipulation {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        // if oper = 1 the "set" operation 1.bitmask and (or) with n
        // if oper = 0 this operation is "clear" 1.bitmask and (not~) and the (and)

        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
         
        if(oper == 1)
        {
            int newnum = bitmask | n;
            System.out.println(newnum);
        }
        else
        {
            int newnum = ~(bitmask);
            int new1 = newnum & n;
            System.out.println(new1);
        }
     sc.close();
    }
    
}
