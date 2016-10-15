package unit3.demo;

public class Arrays2{
  
  /*
   * Second arrays example 
   */ 
  public static void main(String args[]){
    
    // declare a list of 50 double variables
    double[] randomNumbers = new double[50]; 
    
    // randomly assign each digit
    for (int i = 0; i < randomNumbers.length; i++)
      randomNumbers[i] = Math.random(); 
    
    
    // add up all numbers
    double sum = 0;
    for (int i = 0; i < randomNumbers.length; i++)
      sum = sum + randomNumbers[i];
    
    // output sum
    System.out.println("sum of 25 random numbers is " + sum); 
    
  }
  
  
}