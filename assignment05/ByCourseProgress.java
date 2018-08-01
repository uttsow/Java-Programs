package assignment05;
import java.util.*;

public class ByCourseProgress implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getCourse() == null && s2.getCourse() == null) {
		}else {
			if(s1.getCourse() != null && s2.getCourse() == null) {
				return 1;
			}
			if(s1.getCourse() == null && s2.getCourse() !=null) {
				return -1;
			}
			if(s1.percentRead() > s2.percentRead()) {
				return 1;
			}
			if(s1.percentRead() < s2.percentRead()) {
				return -1;
			}
			if(s1.percentCompleted()> s2.percentCompleted()) {
				return 1;
			}
			if(s1.percentCompleted() < s2.percentCompleted()) {
				return -1;
			}
		}
		return s1.getSelf().compareTo(s2.getSelf());
	}
	
	
	
}
