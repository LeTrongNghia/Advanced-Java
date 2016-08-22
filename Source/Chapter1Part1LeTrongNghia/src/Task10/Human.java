package Task10;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for Human
 */
public class Human {
	public String name;
	public String birthOfDay;
	public String address;
	public String phoneNumber;
	
	public Human(String name, String birthOfDay, String address, String phoneNumber) {
		super();
		this.name = name;
		this.birthOfDay = birthOfDay;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthOfDay() {
		return birthOfDay;
	}

	public void setBirthOfDay(String birthOfDay) {
		this.birthOfDay = birthOfDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * Summary: use to print information human
	 */
	public String toString() {
		return "Name: " + name + "\nDay of birth: " + birthOfDay + "\nAddress: " + address + "\nPhone number: " + phoneNumber;
	}
}
