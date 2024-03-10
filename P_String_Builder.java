public class P_String_Builder {


    public static void main(String args[])
    {

    // StringBuilder declaration

    StringBuilder sb = new StringBuilder("Drishti ias");
    System.out.println("the string is:"+ sb);

    // get character from at index
    System.out.println(sb.charAt(4));

    // set a character at index
    sb.setCharAt(0,'L'); // taking index first and then char
    System.out.println(sb);
    

    // insert the character
    sb.insert(0,'b'); // index and then char // all character as it is
    System.out.println(sb);

    // append means at the last
    sb.append("bharat");
    System.out.println(sb);

    // find the length of string 
    System.out.println(sb.length());
    sb.delete(1,4); // taking the length 
    System.out.println(sb);
}
}
