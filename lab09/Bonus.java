package lab09;

import java.util.Comparator;

public class Bonus {

	public static void main(String[] args) {
		Comparator<String> comp = (i, j) -> j.length() - i.length();
		// BST creates the nodes based on the comparison
		BinarySearchTree<String> tree = new BinarySearchTree<>(comp);
		tree.insert("abcd");
		tree.insert("Daniel");
		tree.insert("Uttso");
		tree.insert("AB");
		tree.insert("ART");
		tree.insert("A");
		tree.insert("afrvcvrgrasd");
		tree.prettyPrint();
	}

}
