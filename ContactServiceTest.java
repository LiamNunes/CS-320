package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.ContactService;

class ContactServiceTest {

	@Test
	void contactServiceAddContact() {
		ContactService contactService = new ContactService();
		contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		assertTrue(contactService.searchContacts("001") != null);//if the contact is not added then the search will not return null
	}
	
	@Test
	void contactServiceAddContactUniqueID() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			ContactService contactService = new ContactService();
			contactService.createContact("001", "Test", "Test", "0123456789", "Test");
			contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		});	//trying to add two contacts with the same id would cause it to not be unique
	}
	
	@Test
	void contactServiceDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		contactService.deleteContact("001");
		assertTrue(contactService.searchContacts("001") == null);//if the contact is deleted then the search will return null
	}

	@Test
	void contactServiceChangeFirstName() {
		ContactService contactService = new ContactService();
		contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		contactService.updateContactFirstName("001","John");
		assertTrue(contactService.searchContacts("001").getFirstName().equals("John"));
	}
	
	@Test
	void contactServiceChangeLastName() {
		ContactService contactService = new ContactService();
		contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		contactService.updateContactLastName("001","Smith");
		assertTrue(contactService.searchContacts("001").getLastName().equals("Smith"));
	}
	
	@Test
	void contactServiceChangePhone() {
		ContactService contactService = new ContactService();
		contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		contactService.updateContactPhone("001","0000000000");
		assertTrue(contactService.searchContacts("001").getPhone().equals("0000000000"));
	}
	
	@Test
	void contactServiceChangeAddress() {
		ContactService contactService = new ContactService();
		contactService.createContact("001", "Test", "Test", "0123456789", "Test");
		contactService.updateContactAddress("001","no address");
		assertTrue(contactService.searchContacts("001").getAddress().equals("no address"));
	}
}
