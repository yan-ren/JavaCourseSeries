package unit3.demo;

public class BinaryExample{
 
  /*
   * Example of looking at each character 
   * in a string 
   */ 
  public static void main(String args[]){
    
    // declare string
    String bits = "011ab0"; 
    
    // iterate through each character in string
    for (int i = 0; i < bits.length(); i++){
      
      // check if character is neither 0 or 1
      if (bits.charAt(i) != '0' && bits.charAt(i) != '1'){
        System.out.println("character " +i + " is not a 0 or 1"); 
      }
    }
  }
  
}