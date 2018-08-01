package assignment05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TravelByRentalCar implements TravelExpenses {
	
	private double totalRentalCost;
	private double fuelCost;
	private double fuelUsed;
	private int numberOfDaysRented;
	private String rentalCompany;	
	private LocalDate startDate;
	private LocalDate endDate;
	
	public TravelByRentalCar(double aTotalRentalCost, String aRentalCompany, LocalDate aStartDate, LocalDate aEndDate) {
		totalRentalCost = aTotalRentalCost;
		rentalCompany = aRentalCompany;
		startDate = aStartDate;
		endDate = aEndDate;
		numberOfDaysRented = (int)ChronoUnit.DAYS.between(aStartDate, aEndDate);
	}
	
	public void addFuel(double numGallons, double cost) {
		fuelUsed += numGallons;
		fuelCost += cost;
	}
	
	@Override
	public String getDescription() {
		return "You rented a car from " + rentalCompany + " for " + numberOfDaysRented + " days from " + startDate + " to " + endDate + "\n"
				+ Math.round(fuelUsed) + " gallons of fuel used.";
	}
	
	@Override
	public double amountToReimburse(){
		 return totalRentalCost + fuelCost; 
	 }
	
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
		return 4;
	}
		
	

	

}
