package classes;

/******************************************************************************
 * @author liamnunes_snhu
 * Project 1-Contact class
 *****************************************************************************/
public class Contact {
	//the different fields required by Contact
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//constructor for Contact that accepts the Contact ID
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.contactID = contactID;
		setFirstName(firstName);
		setLastName (lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	//getter for ID- no setter as it cannot be changed
	public String getContactID() {
		return contactID;
	}
	
	//getter and setter for first name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}
	
	//getter and setter for last name
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}
	
	//getter and setter for phone
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.phone = phone;
	}
	
	//getter and setter for address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
}
