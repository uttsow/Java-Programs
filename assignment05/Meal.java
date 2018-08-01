package assignment05;

import java.time.LocalDate;



public class Meal implements TravelExpenses {
	private MealType mealType;
	private double amountPaid;
	private LocalDate date;
	
	public Meal(MealType aMealType, double aAmountPaid, LocalDate aDate) {
		mealType = aMealType;
		amountPaid = aAmountPaid;
		date = aDate;
	}
	
	@Override
	public double amountToReimburse(){
		 return Math.max(amountPaid, mealType.getMax());
	 }
	
	@Override
	public String getDescription() {
		return mealType + " on " + date;
	}
	
	@Override
	public LocalDate getStartDate() {
		return date;
	}
	
	@Override
	public LocalDate getEndDate() {
		return date;
	}
	
	public MealType getMealType() {
		return mealType;
	}
	
	public int sequenceNo() {
		return Integer.MAX_VALUE;
	}

}
