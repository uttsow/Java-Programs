package assignment05;

import java.time.LocalDate;

public class TravelByOwnCar implements TravelExpenses {
	private double milesDriven;
	LocalDate startDate;
	LocalDate endDate;
	
	
	public TravelByOwnCar(LocalDate aStartDate, LocalDate aEndDate) {
		startDate = aStartDate;
		endDate = aEndDate;
	}
	
	public void addMiles(double aMiles) {
		milesDriven += aMiles;
	}
	

	@Override
	public String getDescription() {
		 return "Own car used, miles driven: "+ milesDriven;	 
	}
	
	@Override
	public double amountToReimburse(){
		 return milesDriven * mileage; 
	}
	
	//Overriding the dates
	@Override
	public LocalDate getStartDate() {
		return startDate;
	}
	
	@Override
	public LocalDate getEndDate() {
		return endDate;
	}
	
	@Override
	public int sequenceNo() {
		return 5;
	}
}
