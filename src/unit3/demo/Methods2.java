package unit3.demo;

public class Methods2{
  
  /*
   * More method eamples
   */ 
  public static void main(String args[]){
   
    isEven(4);
    isEven(3);
    isEven(1245);
    
  }
  
  // checks if a number is even or odd
  public static void isEven(int x) {
    
    if (x%2 == 0){
      System.out.println(x + " is even!");
      // return statement exits the method as soon as hit
      return; 
    }
    
    System.out.println(x + " is odd!"); 
    
  }
  
  

  
}