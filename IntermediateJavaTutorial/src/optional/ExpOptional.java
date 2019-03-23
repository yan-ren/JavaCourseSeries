package optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

class User{
	String email;
	String password; 
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(){
		
	}
	
	public User(String email, String password){
		this.email = email;
		this.password = password;
	}
}

public class ExpOptional {

	public static void main(String[] args) {
		//NullPointerException
//		String isocode = new User().getEmail().toLowerCase();
				
//		Optional<User> emptyOpt = Optional.empty();
//	    emptyOpt.get();
	    
//		User user = new User();
//		Optional<User> opt = Optional.of(user);
//	    opt.get();
		
		example6();
	}
	
	@Test(expected = NoSuchElementException.class)
	public static void example1() {
	    Optional<User> emptyOpt = Optional.empty();
	    emptyOpt.get();
	}
	
	@Test
	public static void example2(){
		User user = null;
		Optional<User> opt = Optional.of(user);
		Optional<User> opt2 = Optional.ofNullable(user);
	}
	
	@Test
	public static void example3() {
	    String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    
	    assertTrue(opt.isPresent());
	    assertEquals("John", opt.get());
	}
	
	public static void example4(){
		User user = new User("@mail", "123");
		Optional<User> opt = Optional.ofNullable(user);
		opt.ifPresent( u -> assertEquals("@mail", u.getEmail()));
	}
	
	public static void example5(){
		User user = null;
	    User user2 = new User("anna@gmail.com", "1234");
	    User result = Optional.ofNullable(user).orElse(user2);

	    assertEquals(user2.getEmail(), result.getEmail());
	}
	
	@Test
	public static void example6() {
		//map() applies the Function argument to the value, then returns the result wrapped in an Optional.
	    User user = new User("anna@gmail.com", "1234");
	    String email = Optional.ofNullable(user)
	      .map(u -> u.getEmail()).orElse("default@gmail.com");
	    
	    assertEquals(email, user.getEmail());
	}

}
