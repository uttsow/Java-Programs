package assignment05;

import java.time.LocalDate;

public class TravelByAir implements TravelExpenses {
	private LocalDate outboundStartDate;
	private LocalDate inboundEndDate;
	private String airlines;
	private double totalCost;
	
	public TravelByAir(LocalDate srtDate, LocalDate enDate, String aAirline, double cost) {
		outboundStartDate = srtDate;
		inboundEndDate = enDate;
		airlines = aAirline;
		totalCost = cost;
	}
	

	@Override
	public String getDescription() {
		 return "You flew " + airlines + " from " + outboundStartDate + " to " + inboundEndDate;
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
		return 1;
	}

}
