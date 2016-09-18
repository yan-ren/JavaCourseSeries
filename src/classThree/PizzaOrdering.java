package classThree;
import java.util.Scanner;

public class PizzaOrdering
{
    
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter username:");
    String username = sc.next();
        
    System.out.println("Enter password:");
    String password = sc.next();
    
    System.out.println("Enter pizzas to order:");
    int pizzasToOrder = sc.nextInt();
     
    boolean loginSuccess = false;
    
    //only allow these users to have a successful login
    //note the use of nested ANDs and ORS
    //this means that user must be Bentley AND password must be secretpassword
    //OR, the user is John AND the password is croissant
    if (
    	(username.equals("Bentley") && password.equals("secretpassword")) 
    	|| 
    	(username.equals("John") && password.equals("croissant"))
       
       )
    {
    
        //if either username/password combo is seen,
        //then login is successful
        loginSuccess = true;
    }
   
    if (!loginSuccess )
    {
        System.out.println("You must be logged in to order that");
    }
    else if (pizzasToOrder < 0 || pizzasToOrder > 100)
    {
        System.out.println("Invalid pizza amount");
    }
    else
    {
        System.out.println("Pizzas ordered");
    }
    
 }
    
}
