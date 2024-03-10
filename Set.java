public class Set {


    public static void main(String args[])
    {
        int n = 5; // 0 1 0 1
        int pos = 1;
        int bitMask = 1 << pos;

        int newnum = bitMask|n; // 0111 the number is 7 in decimal
        System.out.println(newnum);

    }
    
}
