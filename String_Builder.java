public class String_Builder {

    public static void main(String args[])
    {
        // define StringBuilder
        StringBuilder sb = new StringBuilder("Bharat");
        System.out.println(sb);

        // which charaacter at index
        System.out.println(sb.charAt(0));
    
        // set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);


        // insert
        sb.insert(2,'t');
        System.out.println(sb);
        
        // delete
        sb.delete(0,1);
        System.out.println(sb);

        // append
        sb.append("e");
        sb.append("s");
        System.out.println(sb.length());


        // string reverse by using StringBuilder
        StringBuilder str = new StringBuilder("hello");
        for(int i = 0;i<str.length()/2;i++)
        {
            int front = i;//0 th position
            int back = str.length()-1-i;// 5-1-0 = >4 // here find the last index...
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front,backChar);
            str.setCharAt(back,frontChar);
           
        }
        System.out.println(str);


    }
    
}
