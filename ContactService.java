package classes;

import java.util.Vector;

/******************************************************************************
 * @author liamnunes_snhu
 * Project 1-Contact Service Class
 *****************************************************************************/
public class ContactService {
	//data struct to store vectors
	Vector<Contact> contacts = new Vector<>();
	
	//a method that will search the contacts vector and return the location of the contact with a given ID
	public Contact searchContacts (String contactID){
		for (int i=0; i<contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				return contacts.get(i);
			}
		}
		return null;
	}
	
	//creates a new contact, if an invalid id is given the contact will not be created, and if the id is not unique the contact will not be created
	public void createContact (String contactID, String firstName, String lastName, String phone, String address) {
		Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
		if (!newContact.getContactID().equals("INVALID")) {
			if (searchContacts(contactID) == null) {
				contacts.add(newContact);
			}
			else {
				throw new IllegalArgumentException("ID already in use");
			}
		}
	}
	
	//deletes contact with given ID
	public void deleteContact (String contactID) {
		if (searchContacts (contactID) != null) {
			contacts.remove(searchContacts (contactID));
		}
	}
	
	//methods to update contact information
	public void updateContactFirstName (String contactID, String firstName) {
		if (searchContacts (contactID) != null) {
			searchContacts (contactID).setFirstName(firstName);
		}
	}
	public void updateContactLastName (String contactID, String lastName) {
		if (searchContacts (contactID) != null) {
			searchContacts (contactID).setLastName(lastName);
		}
	}
	public void updateContactPhone (String contactID, String phone) {
		if (searchContacts (contactID) != null) {
			searchContacts (contactID).setPhone(phone);
		}
	}
	public void updateContactAddress (String contactID, String address) {
		if (searchContacts (contactID) != null) {
			searchContacts (contactID).setAddress(address);
		}
	}

}

