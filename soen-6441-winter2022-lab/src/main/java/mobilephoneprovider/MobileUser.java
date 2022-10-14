package mobilephoneprovider;

public class MobileUser {
	
	private String firstName;
	private String lastName;
	private int number;
	private boolean isAccountActive;
	private float planData;
	private float freeData;
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public boolean isAccountActive() {
		return isAccountActive;
	}


	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}


	public float getPlanData() {
		return planData;
	}


	public void setPlanData(float planData) {
		this.planData = planData;
	}


	public float getFreeData() {
		return freeData;
	}


	public void setFreeData(float freeData) {
		this.freeData = freeData;
	}


	public MobileUser(String firstName, String lastName, int number, boolean isAccountActive, float planData,
			float freeData) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.isAccountActive = isAccountActive;
		this.planData = planData;
		this.freeData = freeData;
	}


	@Override
	public String toString() {
		return "MobileUser [number=" + number + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	

}
