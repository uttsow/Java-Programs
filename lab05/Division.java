package lab05;
import java.util.ArrayList;
import java.util.*;

public class Division{
	private ArrayList<Double> list = new ArrayList<Double>();

//Constructor
	public Division(double[] array){
		if(array == null || array.length == 0){
			throw new IllegalArgumentException("need to enter an array with at least one double");
			 	}
		for(int i =0; i <array.length; i++){
			list.add(i, array[i]);

		}
	}


	public void removeZeros(){
		for(int i = 0; i<list.size(); i++){
		if(list.get(i) ==0){
			list.remove(i);
			}

		}

	}

	public void divide(int divisor){
		for(int i = 0; i<list.size(); i++){
			double holder = list.get(i)/divisor;
			list.set(i, holder);
		if(divisor == 0){
			throw new IllegalArgumentException("cant divide by zero");
			}
		}
	}

	public String toString(){
		return list.toString();
	}



}
