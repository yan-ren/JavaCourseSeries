package unit3.demo;

public class ArrayLec {
  
  /*
   * Array examples
   */ 
  public static void main(String args[]){
    
    // Explicit declaration of array 
    int[] favoriteNumbers = {11, 12, 23, 68, 4};
    
    // output size of array using favoriteNumbers.length
    System.out.println("I have " + favoriteNumbers.length + " favorite numbers"); 
    
    // print array
    // note: array indexes start at 0!
    System.out.println("My favorite numbers are "); 
    for (int i = 0; i < favoriteNumbers.length; i++){
      System.out.print(favoriteNumbers[i] + " "); 
    } 
    System.out.println(); 
    
    // print out the third number in the list
    // note: the 3rd number is at position 2!
    System.out.println("My 3rd favorite number is " + favoriteNumbers[2]); 
    
   
    
  }
  
}