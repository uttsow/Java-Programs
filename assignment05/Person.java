package assignment05;

import java.time.LocalDate;
import java.util.Comparator;

public class Person implements Comparable<Person> {

	
	private String lastName;
	private String firstName;
	private LocalDate dateOfBirth;
	
	public Person(String aLastName, String aFirstName, LocalDate aDOB) {
		lastName= aLastName;
		firstName = aFirstName;
		dateOfBirth = aDOB;
	}

	@Override
	public int compareTo(Person other) {
		return (lastName + firstName).compareToIgnoreCase(other.lastName + other.firstName);
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public String toString() {
		return lastName + ", " + firstName + ": " + dateOfBirth; 
	}
	
	public static Comparator<Person> byDOB () {
		return Comparator.comparing(Person::getDateOfBirth);
	}
	public static Comparator<Person> byDOBandName () {
		return byDOB().thenComparing(Comparator.naturalOrder());
	}
	
	
	
	
	
	

}
