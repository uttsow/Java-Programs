package assignment05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lodging implements TravelExpenses {
	private LocalDate startDate;
	private LocalDate endDate;
	private String lodgingName;
	private int numberOfNights;
	private double costOfStay; 
	
	
	public Lodging(LocalDate aStartDate, LocalDate aEndDate, String aLodgingName, double aCost) {
		startDate = aStartDate;
		endDate = aEndDate;
		lodgingName = aLodgingName;
		costOfStay = aCost;
		numberOfNights = (int)ChronoUnit.DAYS.between(aStartDate, aEndDate);
	}
	
	@Override
	public String getDescription() {
		 return "You stayed at " + lodgingName + " for " +  numberOfNights + " nights from " + startDate + " to " + endDate;
	 }
	
	@Override
	public double amountToReimburse(){
		 return costOfStay; 
	 }
	
	@Override
	public LocalDate getStartDate() {
		return startDate;
	}
	
	@Override
	public LocalDate getEndDate() {
		return endDate;
	}
	public int sequenceNo() {
		return 6;
	}

}
