package classThree;

import java.util.Scanner;

public class Weather
{
    
 public static void main(String[] args)
 {
 
    //sample input '32.5 false'
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a temperature in float");
    //get a decimal number from the user
    float temperature = sc.nextFloat();
    
    System.out.println("Is it going to rain? ");
    //get a boolean value from the user
    boolean isRaining = sc.nextBoolean();
     
     //if it is NOT raining
    if (!isRaining)
     {
         System.out.println("It is dry out");
     }
     
     //if the temperature is below zero AND it is raining
     if (temperature < 0 && isRaining)
     {
         System.out.println("I love snow!!! Go out!");
     }
    //If it is cold OR it is raining
     else if (temperature < 10 || isRaining)
     {
         System.out.println("Stay inside and watch Netflix!");
     }
     
 }
    
}

