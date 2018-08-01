package assignment06;

import java.util.Iterator;

public class MenuItem implements MComp{
	
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String aName, String aDescription, boolean aVeg, double aPrice) {
		name = aName;
		description = aDescription;
		vegetarian = aVeg;
		price = aPrice;
	}

	@Override
	public Iterator<MComp> iterator() {
		return new NullIterator();
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void print() {
		System.out.print("\t" + getName());
		if(isVegetarian()) {
			System.out.print("(v)");
			System.out.println(", " + getPrice());
			System.out.println("\t\t--" + getDescription());
		}
	}
	
	

}
