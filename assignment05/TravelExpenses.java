package assignment05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public interface TravelExpenses {
	double mileage = 0.53; // cents per mile driven in a private car
	double BREAKFAST_MAX = 8.0;
	double LUNCH_MAX = 10.0;
	double DINNER_MAX = 40.0;
	
	//abstract method
	double amountToReimburse();
	
	//Default class, will return
	default String getDescription() {
		throw new UnsupportedOperationException("Must be implemented by class.");
	}
	
	default LocalDate getStartDate() {
		return LocalDate.now();
	}
	default LocalDate getEndDate() {
		return LocalDate.now();
	}
	default int sequenceNo() {
		return Integer.MAX_VALUE;
	}
	
	static void printReport(ArrayList<TravelExpenses> list) {
		Collections.sort(list, Comparator.comparing(TravelExpenses::getStartDate).thenComparing(new ExpenseOrder()));
		
		for(TravelExpenses x : list) {
			if(x.getStartDate().isBefore(x.getEndDate())) {
				System.out.println("Start date: " + x.getStartDate() + ", "+ "End Date: "+ x.getEndDate());
				String s = String.format("$%.2f", x.amountToReimburse()); 
				System.out.println(x.getDescription() + ": " + s + "\n");
			}else if(x.getStartDate().isAfter(x.getEndDate())) {
				throw new IllegalArgumentException("End date can't be before start date");	
			}
			else {
				System.out.println("Start date: " + x.getStartDate());
				String s = String.format("$%.2f", x.amountToReimburse()); 
				System.out.println(x.getDescription() +": " + s + "\n");
			}
		}
		double totalCost = 0;
		for(int i = 0; i<list.size(); i++) {
			totalCost += list.get(i).amountToReimburse();	
		}
		System.out.println("Total Expenses: $" + totalCost);
		
		
		
	}

}
