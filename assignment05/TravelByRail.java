package assignment05;

import java.time.LocalDate;

public class TravelByRail implements TravelExpenses {
	private LocalDate outboundStartDate;
	private LocalDate inboundEndDate;
	private String railLines;
	private double totalCost;
	
	public TravelByRail(LocalDate srtDate, LocalDate enDate, String aRailLine, double cost) {
		outboundStartDate = srtDate;
		inboundEndDate = enDate;
		railLines = aRailLine;
		totalCost = cost;
	}
	

	@Override
	public String getDescription() {
		 return "You went on " + railLines + " train from " + outboundStartDate + " to " + inboundEndDate ;
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
		return 2;
	}

}
