
import java.util.*;
public class Strings {


public static void main(String args[])
{
    // string declaration
    String name1 = "bharat";
    String full_name = "bharat pagare"; // spaces also allowed.
    String sentences = "My name is Bharat Pagare";
    System.out.println(name1);
    System.out.println(full_name);
    System.out.println(sentences);
    

    //user input string 
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your name:");
    String name = sc.nextLine();
    System.out.println("your name is :"+name);

   // concatanation
    String str1 = "bharat";
    String str2 = "pagare";
    String str = str1 +" "+str2;
    System.out.println("the full string is:"+str);
    
    System.out.println("the full string is:"+str.length());
    // charAt
    for(int i = 0;i<str.length();i++)
    {
        System.out.println("the name is:"+str.charAt(i));
    }

  sc.close();
   
   
    
   
}
    
}
