package assignment05;

import java.time.LocalDate;
import java.util.*;
public class ExpensesTester {
	
	
	
	public static void main(String[] args) {
		ArrayList<TravelExpenses> list = new ArrayList<>();
		
		LocalDate startDate = LocalDate.of(2017, 06, 15);
		LocalDate endDate = LocalDate.of(2017, 06, 25);
		
		//compare both same start and endDate as well as different start and end date;
		TravelByRentalCar rentalCar = new TravelByRentalCar(100,"Hertz", startDate, endDate); 
		rentalCar.addFuel(16, 42.76);
		
		TravelByRentalCar rentalCar2 = new TravelByRentalCar(200, "Enterprise", startDate, startDate);
		rentalCar2.addFuel(21, 56.96);
		
		TravelByRail rail = new TravelByRail(startDate, endDate, "MTA" , 2.75);
		TravelByRail rail2 = new TravelByRail(startDate, startDate, "ATM" , 2.85);
		
		TravelByBus bus = new TravelByBus(startDate, endDate, "Greyhound", 2.50);
		
		TravelByAir air = new TravelByAir(startDate, startDate, "Emirates and Ethad", 756);
		
		TravelByOwnCar car = new TravelByOwnCar(startDate, endDate);
		car.addMiles(100);
		
		Lodging logde = new Lodging(startDate, endDate, "Poconos", 275.12);
		Lodging l2 = new Lodging(startDate, endDate, "Washington DC", 300.23);
		Lodging l3 = new Lodging(startDate, startDate, "Port Washington", 75);
		
		Meal m1 = new Meal(MealType.DINNER, 12.50, startDate);
		Meal m2 = new Meal(MealType.LUNCH, 12.60, startDate);
		Meal m3 = new Meal(MealType.BREAKFAST, 1.75, startDate);
		
		//different date
		Meal m4 = new Meal(MealType.LUNCH, 12.60, endDate);
		Meal m5 = new Meal(MealType.BREAKFAST, 1.75, endDate);
		
		list.add(rentalCar);
		list.add(rail);
		list.add(bus);
		list.add(logde);
		list.add(l2);
		list.add(m1);
		list.add(rail2);
		list.add(m2);
		list.add(rentalCar2);
		list.add(m3);
		list.add(l3);
		list.add(air);
		list.add(m4);
		list.add(m5);
		list.add(car);
		
		//Printing out the list
		TravelExpenses.printReport(list);
		
	}

}
