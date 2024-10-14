package AddressBookApp;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	List<Person> listPerson = new ArrayList<Person>();

	public void addPerson(Person person) {

		listPerson.add(person);


		System.out.println("Person Added SuccessFully \n");
	}

	public void listOfPerson() {

		if (listPerson.isEmpty()) {

			System.out.println("Person List Is Empty \n");
		} else {

			for (Person person : listPerson) {

				System.out.println(person);

			}
		}

	}

	public void updatePerson(String firstName, String state, String city, int pincode, double salary) {

		for (Person person : listPerson) {

			if (person.getFirstName().equalsIgnoreCase(firstName)) {

				person.setState(state);
				person.setCity(city);
				person.setPincode(pincode);
				person.setSalary(salary);

				System.out.println("Person Update Successfully");

				return;

			}
		}

		System.out.println("Person Is Not Found....");
	}

	public void deletePerson(String firstName) {

		Person deletePerson = null;

		for (Person person : listPerson) {

			if (person.getFirstName().equalsIgnoreCase(firstName)) {

				deletePerson = person;

				break;
			}
		}

		if (deletePerson != null) {

			listPerson.remove(deletePerson);
			System.out.println("Person Delete SuccessFully");
		} else {
			System.out.println("Person Is Not Found....");
		}

	}

public void getByName(){

System.out.println("Hello BridgeLabz");
}

}
