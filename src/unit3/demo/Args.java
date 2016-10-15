package unit3.demo;

public class Args
{
    
 public static void main(String[] args)
 {
     //note that there is a variable args above,
     //which is an array of Strings
     
     //print out this array of arguments
     //args are given by typing 'run Args 123 hello' in the Interactions pane of Dr. Java
     System.out.println("args length: " + args.length);
     for (int i=0; i < args.length; i++)
     {
      System.out.println(args[i] + " ");   
     }
     
     //convert a String to an int
     //gives java.lang.NumberFormatException is the String does not 
     //contain an int
     int x = Integer.parseInt(args[0]);
     System.out.println("x:" + x); 
     
     //below is a short calculator program
     //get the arguments
     int a = Integer.parseInt(args[0]);
     String op = args[1];
     int b = Integer.parseInt(args[2]);
     
     //make a decision based on the operator
     if (op.equals("+"))
     {
         System.out.println("Answer: " + (a + b)); 
         
     }
     else if (op.equals("-"))
     {
         System.out.println("Answer: " + (a - b)); 
         
     }
     //make a decision based on the operator
     if (op.equals("+"))
     {
         System.out.println("Answer: " + (a + b)); 
         
     }
     else if (op.equals("*"))
     {
         System.out.println("Answer: " + (a * b)); 
         
     }
 }
    
    
    
}