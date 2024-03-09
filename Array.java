public class Array {

    public static void main(String args[])
    {
        int marks[] = new int[3]; // returntype arrayname[] = new type[size];
        marks[0] = 34; // for giving the value particular index use this syntax
        marks[1] = 44;
        marks[2] = 89;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // by using loop
        for(int i = 0;i<3;i++)
        {
            System.out.println(marks[i]);
        }
    }
    
}
