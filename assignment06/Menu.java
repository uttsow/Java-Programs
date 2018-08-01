package assignment06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Menu implements MComp{
	private String name;
	private String description;
	private ArrayList<MComp> comps = new ArrayList<>();
	
	public Menu(String aName, String aDescription) {
		name = aName;
		description = aDescription;
	}

	@Override
	public void add(MComp mComp) {
		comps.add(mComp);
		
	}
	
	@Override
	public void remove(MComp mComp) {
		comps.remove(mComp);
	}
	
	@Override 
	public MComp getChild(int i) {
		return comps.get(i);
	}
	
	//getters
	@Override
	public String getName() {
		return name;
	}
	//getter
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Iterator<MComp> iterator() {
		return new CompositeIterator(comps.iterator());
	}
	
	@Override 
	public void pushToStack(Stack<Iterator<MComp>> stack) {
		stack.push(comps.iterator());
	}
	
	@Override 
	public void print() {
		System.out.println("\n" + getName() + ", " + getDescription() + "----------------------------");
		
	}
	
}
