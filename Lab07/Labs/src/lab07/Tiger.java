package lab07;

public class Tiger extends Carnivore {
	private String name;
	
	public String getName(){
		return name;
	}
	
	public Tiger(String aName, String aPrey, int aLevel){
		super(aPrey, aLevel);
		name = aName;
		
	}
	
	@Override
	public String toString(){
		return  "Tigers are a predator of Asia, known for their stripes";
	}
	
	@Override 
	public String getAnimalName(){
		return "Tiger";
		
	}
	@Override
	public void speak() {
		System.out.println("Growl");
		
	}

	public void eat() {
		System.out.println(name + "has eaten" + getPrey());
		
	}

	public void move() {
		System.out.println("Tigers move gracefully due to their powerful leg and shoulder muscles.");
		
	}

	public void sleep() {
		System.out.println("Tigers like to sleep in rocky places, grassy areas, or inside caves.");
		
	}

	public String kingdom() {
		// TODO Auto-generated method stub
		return "Animalia";
	}

	public String genus() {
		// TODO Auto-generated method stub
		return "Panthera";
	}

	public String species() {
		// TODO Auto-generated method stub
		return "P.tigris (tiger)";
	}

	@Override
	void prowl() {
		System.out.println("The tiger pounces on an unsuspecting " + getPrey());
		
	}



}
