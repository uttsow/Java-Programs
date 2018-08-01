package assignment07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P19_7 {

	public static boolean twoVowels(String name) {
		boolean word = name.toLowerCase()
						  .codePoints() //to make it a stream inorder to filer it
						  .filter(i -> i =='a' || i == 'e' || i == 'i' || i== 'o' || i=='u' )
						  .count() <=2;  //counts to at most 2
		return word;
						  
	}
	
	public static String longestName(Set<String> lgtName) {
		int max = 0;
		String name = "";
		for(String x : lgtName) {
			if(x.length() > max) {
				max = x.length();
				name = x;
			}
		}
		return name;
	}
	public static void main(String[] args) throws IOException {
		try(Stream<String> lines = Files.lines(Paths.get("female1stNames.txt"))){
			//Will store the vowels in a set

			Set<String> vowels = lines.filter(i -> twoVowels(i))
									 .collect(Collectors.toSet());
			System.out.println("Names with at most 2 vowels: ");
			for(String i : vowels) {
				System.out.println(i);
			}
			System.out.println("--------------------------------------\n");
			String longName = longestName(vowels);
			System.out.println("Longest Name: " + longName); //Should return Gwendolyn
			
			Map<Integer, Long> lengths = new HashMap<Integer, Long>();
			long result = 0;
			for(int i= 1; i<longName.length()+1; i++) {
				for(String x : vowels) {
					if(x.length() == i) {
						result = result + 1;
					}
				}
				lengths.put(i, result);
				result = 0;
			}
			
			System.out.println("--------------------------------------\n");
			System.out.println("Number of names with each length: ");
			System.out.println(lengths);
			
		}
		try(Stream<String>  maleGroup = Files.lines(Paths.get("male1stNames.txt"))){
			Map<String, List<String>> maleName = maleGroup.collect(Collectors.groupingBy(x -> x.substring(0, 1)));
			System.out.println("--------------------------------------\n");
			System.out.println("Male names grouped : ");
			for(String x: maleName.keySet()) {
				System.out.println(x + ": " + maleName.get(x));
			}
		}
	}
}
