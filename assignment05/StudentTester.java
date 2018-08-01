package assignment05;



import java.time.LocalDate;
import java.util.*;

public class StudentTester {
	
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1996, 06, 15);
		LocalDate d2 = LocalDate.of(2017, 10, 26);
		
		//Creating new person
		Person p1 = new Person((NamesResource.getRandomLastName()), (NamesResource.getRandomFirstName()), (NamesResource.getRandomBirthDate(1996)));
		Person p2 = new Person((NamesResource.getRandomLastName()), (NamesResource.getRandomFirstName()),  d2); // This will be last because its 100% Complete
		Person p3 = new Person((NamesResource.getRandomLastName()), (NamesResource.getRandomFirstName()), (NamesResource.getRandomBirthDate(1996)));
		Person p4 = new Person((NamesResource.getRandomLastName()), (NamesResource.getRandomFirstName()), d1); 
		Person p5 = new Person((NamesResource.getRandomLastName()), (NamesResource.getRandomFirstName()), d1); //will also have null course;
		
		/* p4 and p5 will be compared by name since both will have null value for courses. 
		 * I set the DOB for both the same so that it will be easier to track
		 * p2
		*/
		

		
		
		//Course 1;
		Course c1 = new Course("Math 330");
		c1.setNumReadings(2);
		c1.setPages(0, 100);
		c1.setPages(1, 200);
		
		//Course 2:
		Course c2 = new Course("BIO 118");;
		c2.setNumReadings(3);
		c2.setPages(0, 3);
		c2.setPages(1, 1);
		c2.setPages(2, 1);
		
		//Course 3
		Course c3 = new Course("CHEM 108");
		c3.setNumReadings(4);
		c3.setPages(0, 70);
		c3.setPages(1, 100);
		c3.setPages(2, 250);
		c3.setPages(3, 450);
		
		
		
		Student s1 = new Student(p1);
		Student s2 = new Student(p2);
		Student s3 = new Student(p3);
		Student s4 = new Student(p4);
		Student s5 = new Student(p5);
	
		
		//Student 4 has no courses;
		s1.setCourse(c1);
		s2.setCourse(c2);
		s3.setCourse(c3);
		
		//Sets Student 2 as 100% Complete
		s2.read(0);
		s2.read(0);
		s2.read(0);
		s2.read(0);
		s2.read(1);
		s2.read(1);
		s2.read(2);
		s2.read(2);
		
		//Sets Student 1
		for(int i = 0; i<65; i++) {
			s1.read(0);
		}
		for(int i = 0; i< c1.getTotalPages(1) -23; i++) {
			s1.read(1);
		}
		
		//Sets Student 3
		for(int i = 0; i< c3.getTotalPages(0)-25; i++) {
			s3.read(0);
		}
		for(int i = 0; i< c3.getTotalPages(1)-56; i++) {
			s3.read(1);
		}
		for(int i = 0; i< c3.getTotalPages(2)-67; i++) {
			s3.read(2);
		}
		for(int i = 0; i< c3.getTotalPages(3)+1; i++) {
			s3.read(3);
		}

		
		//Student 1
		System.out.println("Student 1: ");
		System.out.print("Percent Read: " + s1.percentRead() + "\n");
		System.out.println("Percent Completed: " + s1.percentCompleted());
		System.out.println("Progress Array: " + Arrays.toString(s1.getProgres()));
		System.out.println("Boolean Array: " + Arrays.toString(s1.getCompleted()) + "\n");
		
		//Student 2: Shows the array of progress and boolean, as well as the percent completed
		System.out.println("Student 2: ");
		System.out.print("Percent Read: " + s2.percentRead());
		System.out.println("Percent Completed: " + s2.percentCompleted());
		System.out.println("Progress Array: " + Arrays.toString(s2.getProgres()));
		System.out.println("Boolean Array: " + Arrays.toString(s2.getCompleted()) + "\n");
		
		//Student 3
		System.out.println("Student 3: ");
		System.out.print("Percent Read: " + s3.percentRead());
		System.out.println("Percent Completed: " + s3.percentCompleted());
		System.out.println("Progress Array: " + Arrays.toString(s3.getProgres()));
		System.out.println("Boolean Array: " + Arrays.toString(s3.getCompleted())+ "\n");
		
		//Student 4 will have a NullPointException since it doesn't have any courses; 
		
		
		
		//Comparing byCourseProgress
		ByCourseProgress b1 = new ByCourseProgress(); 
		
		//elements added in different order. 
		ArrayList<Student> list1 = new ArrayList<>(Arrays.asList(s2, s3, s1, s4, s5));
		Collections.sort(list1, b1);
		
		
		//Sorts via custom toString
		for(Student x: list1) {
			System.out.println(x.getSelf().toString());
		}
	
		
	}

}
