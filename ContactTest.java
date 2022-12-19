package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("0", "Test", "Test", "0123456789", "Test");
		assertTrue(contact.getContactID().equals("0"));
		assertTrue(contact.getFirstName().equals("Test"));
		assertTrue(contact.getLastName().equals("Test"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("Test"));
	}
	
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("01234567890", "Test", "Test", "6031111111", "Test");
		});	
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact(null, "Test", "Test", "6031111111", "Test");
		});	
	}
	
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "01234567890", "Test", "6031111111", "Test");
		});	
	}
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", null, "Test", "6031111111", "Test");
		});	
	}
	
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "Test", "01234567890", "6031111111", "Test");
		});	
	}
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "Test", null, "6031111111", "Test");
		});	
	}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "Test", "Test", "6031111111", "0123456789012345678901234567890");
		});	
	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "Test", "Test", "6031111111", null);
		});	
	}
	
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "Test", "Test", "01234567890", "Test");
		});	
	}
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			@SuppressWarnings("unused")
			Contact contact = new Contact("0", "Test", "Test", null, "Test");
		});	
	}

}
