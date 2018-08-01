package assignment05;

import java.time.LocalDate;

public class TravelByBus implements TravelExpenses {
	private LocalDate outboundStartDate;
	private LocalDate inboundEndDate;
	private String busLines;
	private double totalCost;
	
	public TravelByBus(LocalDate srtDate, LocalDate enDate, String aRailLine, double cost) {
		outboundStartDate = srtDate;
		inboundEndDate = enDate;
		busLines = aRailLine;
		totalCost = cost;
	}
	

	@Override
	public String getDescription() {
		 return "You went on bus(es) " + busLines + " from " + outboundStartDate + " to " + inboundEndDate;
	 }
	
	@Override
	public double amountToReimburse(){
		 return totalCost; 
	}
	 
	@Override
	public LocalDate getStartDate() {
		return outboundStartDate;
	}
	
	@Override
	public LocalDate getEndDate() {
		return inboundEndDate;
	}
	
	@Override
	public int sequenceNo() {
		return 3;
	}

}
