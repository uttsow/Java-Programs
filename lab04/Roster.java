package lab04;

import java.util.ArrayList;
import java.util.Arrays;

public class Roster{
	private ArrayList<Student> classRoster = new ArrayList<>();

	public ArrayList<Student> getRoster(){
		return classRoster;
	}

	public void addStudent(Student s){
		classRoster.add(s);
	}

	public void dropStudent(String name){
		for(int i = 0; i < classRoster.size(); i++){
			if((classRoster.get(i)).getName() == name){
				classRoster.remove(i);
			}
		}
	}

	public String toString(){
		String retVal = "[";
		for(int i = 0; i < classRoster.size() - 1; i++){
			retVal += classRoster.get(i).getName() + ", ";
		}
		retVal += classRoster.get(classRoster.size() - 1).getName() + "]";
		return retVal;
	}

	public void sortById(){
 		for(int i = 0; i < classRoster.size(); i++){
      			for(int j = 1; j < (classRoster.size()-i); j++){
              			if(classRoster.get(j-1).getId() > classRoster.get(j).getId()){
                       			//swap elements
                       			Student temp = classRoster.get(j-1);
                       			classRoster.set(j - 1, classRoster.get(j));
                       			classRoster.set(j, temp);
              			}
      			}
  		}
	}


}
