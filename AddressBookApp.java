package AddressBookApp;

import java.util.Date;
import java.util.Scanner;

public class AddressBookApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		AddressBook ab = new AddressBook();

		boolean exit = false;

		while (!exit) {

			System.out.println("Address Book Menu:");
			System.out.println("1. Add Person ");
			System.out.println("2. List Persons ");
			System.out.println("3. Update Person ");
			System.out.println("4. Delete Person ");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:

				try {
					System.out.print("Enter First Name: ");
					String firstName = sc.nextLine();

					System.out.print("Enter Last Name: ");
					String lastName = sc.nextLine();

					System.out.print("Enter State: ");
					String state = sc.nextLine();

					System.out.print("Enter City: ");
					String city = sc.nextLine();

					System.out.print("Enter Pincode: ");
					int pincode = sc.nextInt();

					System.out.print("Enter Salary: ");
					double salary = sc.nextDouble();

					Date date = new Date();

					Person per = new Person(firstName, lastName, state, city, pincode, salary, date);

					ab.addPerson(per);

					break;
				} catch (Exception e) {
					System.out.println("An unexpected error occurred: " + e.getMessage());
				}
			case 2:

				ab.listOfPerson();

				break;

			case 3:

				try {
					System.out.print("Enter the First Name of the Person to Update: ");
					String updateFirstName = sc.nextLine();

					System.out.print("Enter New City: ");
					String newCity = sc.nextLine();

					System.out.print("Enter New State: ");
					String newState = sc.nextLine();

					System.out.print("Enter New Pincode: ");
					int newPincode = sc.nextInt();

					System.out.print("Enter New Salary: ");
					double newSalary = sc.nextDouble();

					ab.updatePerson(updateFirstName, newState, newCity, newPincode, newSalary);

					break;

				} catch (Exception e) {
					System.out.println("An unexpected error occurred: " + e.getMessage());
				}
			case 4:

				System.out.print("Enter the First Name of the Person to Delete: ");

				String deleteFirstName = sc.nextLine();

				ab.deletePerson(deleteFirstName);
				break;

			case 5:

				exit = true;
				break;

			default:

				System.out.println("Input Mismatch please Cheack the inputs....");
				break;
			}

		}
		sc.close();
	}

}
