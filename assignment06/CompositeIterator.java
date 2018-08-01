package assignment06;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MComp>{
	private Stack<Iterator<MComp>> stack = new Stack<>();
	
	public CompositeIterator(Iterator<MComp> iterator) {
		stack.push(iterator);
	}
	
	
	public boolean hasNext() {
		if (stack.empty()) return false;
		Iterator<MComp> iterator = stack.peek();
		if (!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		}
		return true;
		}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public MComp next() {
		if(!hasNext()) return null;
		Iterator<MComp> iterator = stack.peek();  //gets the top element of the stack
		MComp comp = iterator.next(); 
		if (comp instanceof Menu) {
			if (comp instanceof Menu) comp.pushToStack(stack);
		}
		return comp;
	}
	
	
	



}


