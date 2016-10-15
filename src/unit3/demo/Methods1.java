package unit3.demo;

public class Methods1{
  
  /*
   * Examples of some methods
   */ 
  public static void main(String args[]){
    int a = 3;
    int b = 8; 
    
    // add integers
    int sum = addNumbers(a,b); 
    System.out.println(sum); 
    
    
    int c = 4; 
    int d = 8; 
    sum = addNumbers(c,d) + addNumbers(a,c) + addNumbers(d,d); 
    
    // use fancy print
    myPrint(sum); 
  }
  
  
  public static void myPrint(int n){
    System.out.println("*******" + n + "!!!!!!!!"); 
  }
  
  // methods are declared in the class but outside of main!
  public static int addNumbers(int x, int y){
    return x+y; 
  }
  
  // the 3rd word specifies the return type 
  public static double addDoubles(double x, double y){
    // this method returns x+y which is a double
    return x+y; 
  }
}