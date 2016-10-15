package unit3.demo;

public class DrawCircle
{
    
    public static void main(String[] args)
    {
        //make y go from 10 to -10
        //this makes the top row of the coordinate system y=10
        //the bottom row will be y = -10
        for (int y = 10; y >= -10; y--)
        {
            //for each row, x will go from -10 to 10
            for (int x = -10 ; x <= 10; x ++)
            {
                
                //use the circle equation
                //details aren't important
                double xPow = Math.pow(x, 2);
                double yPow = Math.pow(y, 2);
                double result = Math.sqrt(xPow + yPow);
                
                //see if the result is within a certain range
                if (result  > 5 && result < 7 )
                {
                    //print hashes
                    System.out.print("#"); 
                }
                //print the vertical axis
                else if ( x == 0 )
                {
                    System.out.print("|");   
                }
                
                //print the horizontal axis
                else if (y == 0)
                {
                    System.out.print("-");   
                }
                //print spaces in empty coordinates
                else
                {
                    System.out.print(" ");  
                }
                
            }
            //print a new line at the end of a row of characters
            System.out.println("");
        }
        
        
    }
}