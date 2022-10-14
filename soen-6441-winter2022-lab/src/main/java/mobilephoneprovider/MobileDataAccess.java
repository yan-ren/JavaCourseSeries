package mobilephoneprovider;

import java.util.Arrays;
import java.util.List;


public class MobileDataAccess {
	
	public static boolean grantAccess (MobileUser user) {
		return (user.isAccountActive() && (user.getPlanData()>0 || user.getFreeData()>0));
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello, SOEN6411 Quiz #1!");
		List <MobileUser> users = Arrays.asList(
				new MobileUser("John","Smith",1234,true,100,50),
				new MobileUser("Paul","Jones",5678,true,0,0)
				);
				
		System.out.println("User 1234 can connect to the network? " + grantAccess(users.get(0)));
		System.out.println("User 5678 can connect to the network? " + grantAccess(users.get(1)));
		System.out.println("Goodbye, SOEN6411 Quiz #1!");
		
	}
	 

}
