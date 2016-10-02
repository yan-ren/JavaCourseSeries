package classFour;

import java.util.Scanner;

public class GuessTheNumber
{
    
    public static void main(String[] args)
    {
        //the answer for the user to guess
       String answer = "58";
       
       Scanner sc = new Scanner(System.in);
       String input = ""; //empty String
       
       //the number of guesses the user has made
       int numberGuesses = 0;
       
       //while the user has not guessed the answer
       while (!input.equals(answer))
       {
           System.out.println("Enter the guess between 0 and 100");
           System.out.println("You have guessed " + numberGuesses + " times");
           
           //count the number of guesses
           numberGuesses ++;
           
           //get input from the user
           input = sc.nextLine();
       }       
       System.out.println("You got the number");
       sc.close();
    }
}