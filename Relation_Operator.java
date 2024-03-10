public class Relation_Operator {


    public static void main(String args[])
    {
        int a = 10;
        int b = 10;

       // relation operator gives boolean value.....

         if(a!=b)
         {
            System.out.println("not equal");
         }
         else 
         {
          System.out.println(" equal");
         }

         // a>b 
         // a<b
         // >=
         // <=
         // logical operator

         //&& => logical and 
         // || =>logical or
         int a1 = 10;
         int a2 = 10;
         int a3 = 1;
         System.out.println("for and");
         if(a1==a2 &&a3==a1) // if both statement are true then then they give true output...
         {
            System.out.println("equal");
         }
         else
         {
            System.out.println("not equal");
         }

         System.out.println("for or");
         if(a1==a2 ||a3==a1) // if one statement is true then then  they give true output...
         {
            System.out.println("equal");
         }
         else
         {
            System.out.println("not equal");
         }




    }
    
}
