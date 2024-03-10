public class Clear {

    public static void main(String args[])
    {
        int n = 5 ; // 0101

        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);
        int newnumber = notbitmask&n;
        System.out.println(newnumber);  // 0 0 0 1 // decimal number is 1
    }
    
}
