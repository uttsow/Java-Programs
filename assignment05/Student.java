package assignment05;

public class Student {
	
	private Person self;
	private Course course;
	private int[] progress;
	private boolean[] completed;
	
	public Student(Person aSelf) {
		self = aSelf;
		//completed = new boolean[aCourse.getNumReadings()];
		
	}
	
	public void setCourse(Course crs) {
		course = crs;
		progress = new int[crs.getNumReadings()];
		completed = new boolean[crs.getNumReadings()];
		
	}
	
	public void read(int reading) {
			//completed = new boolean[course.getNumReadings()];
			//int x = course.getTotalPages(reading);
			
			if(progress[reading] == course.getTotalPages(reading)) {
				completed[reading] = true;
			}else {
				completed[reading] = false;
				progress[reading] +=1;
			}
			/*
			if(completed[reading] == false) {
				progress[reading] += 1;
			}
			*/
	
	}
	
	
	public int[] getProgres() {
		return progress;
	}
	public boolean[] getCompleted() {
		return completed;
	}
	
	
	public int percentRead() {
		int totalPagesRead = 0;
		int totalPagesReadingRequired = 0;
		for(int i = 0; i<course.getNumReadings(); i++) {
			totalPagesRead += progress[i];
			totalPagesReadingRequired += course.getTotalPages(i);
		}
		double result = ((double)totalPagesRead)/((double)totalPagesReadingRequired) * 100;
		return ((int)Math.round(result));
	}
	
	public int percentCompleted() {
		int totalCompleted = 0;
		for(int i = 0; i<course.getNumReadings(); i++) {
			if(progress[i] == course.getTotalPages(i)) {
				totalCompleted += 1;
			} 
		}
		double completedPercent = ((double)totalCompleted)/((double)course.getNumReadings()) * 100;
		return ((int)Math.round(completedPercent));
	}
	
	public Person getSelf() {
		return self;
	}
	
	public Course getCourse() {
		return course; 
	}
	

}
