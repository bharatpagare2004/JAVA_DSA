public class Reverse {

    public static void main(String args[])
    {
        StringBuilder str  = new StringBuilder("BHARAT");

        // by using for loop
        for(int i =0;i<str.length()/2;i++)
        {
            int front = i;
            int back = str.length()-1-i;
            
            char FrontChar = str.charAt(front); // we get the char of front
            char BackChar = str.charAt(back);// we get the char of last

            str.setCharAt(front,BackChar);
            str.setCharAt(back,FrontChar);
             

        }
        System.out.println(str);
    }
    
}
