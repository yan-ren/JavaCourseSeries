package unit3.demo;

public class Arrays
{
    
 public static void main(String[] args)
 {
     //declaration
     //type [] variableName
     double[] temperatures; //an array of doubles
 
     int[] numbers; //an array of integers
     boolean[] bools; //an array of booleans
     
     //System.out.println(temperatures); //gives error
     //we need to initialize the array
     
     //initialization
     //variableName = new type[size]
     temperatures = new double[30];
     //we want an array that stores 30 doubles
     
     //put something in the first car
     temperatures[0] = -14.5;
     
     //print the first spot
     System.out.println("First spot: " + temperatures[0]);
     
     //get the last element in the array
     //int lastIndex = temperatures.length; //gives ArrayIndexOutOfBoundsException
     int lastIndex = temperatures.length - 1;
     //[0][1][2]
     double lastElement = temperatures[lastIndex];
     
     //different from getting the string length
     //note the brackets here
     int stringLength = "hello".length();
     
     //zero out the values in the array
     //good practice to ensure we know what's in the array
     for (int i=0; i < temperatures.length; i++)
     {
        temperatures[i] = 0; 
     }
     
     //set the first position after zeroing it
     temperatures[0] = -14.5;
     
     //print out the array
     System.out.println("Temperatures"); 
     for (int i=0; i < temperatures.length; i++)
     {
        System.out.print(temperatures[i] + " " ); 
     }
     
     //another way to create an array
     //not commonly used
     String[] names = {"John", "Bentley", "Jackie"};
     int[] moreNumbers = {123, 574, 3, 239};
 }
    
}