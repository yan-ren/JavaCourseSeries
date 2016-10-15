package unit3.demo;

public class AddArgs{
  
  /*
   * Program takes 2 arguments from the command line
   * and outputs their sum 
   */ 
  public static void main(String[] args){
    
    // check that 2 arguments were provided
    if (args.length == 2){
      
      // convert string arguments to integers
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      
      // output the sum of the integers
      System.out.println("arg1 + arg2 = " + (a+b)); 
    } else {
      System.out.println("You must input two integers on the command line!");
    }
 
    
    
    
    
  }
  
}