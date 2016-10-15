package unit3.demo;

public class MultiTable
{
    
    public static void main(String[] args)
    {
        //a goes from 0 to 9
        for (int a = 0; a < 10; a++)
        {
            //b goes from 0 to 10
            //note that b restarts at 0 when a goes up
            for (int b =0 ; b < 10; b ++)
            {
                //\t is the tab character
                //\n is the new line character
                //print out a fancy multiplication table
                System.out.print(a + " * " + b + " = " + ( a * b) + "\t");   
                
            }
            
            //print out a new line
            System.out.println("");
        }   
    }
}