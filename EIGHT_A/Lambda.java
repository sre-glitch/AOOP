package seven1;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	  public static void main(String[] args) {
	        List<String> animalList = new ArrayList<>();
	        animalList.add("Elephant");
	        animalList.add("Tiger");
	        animalList.add("Zebra");
	        animalList.add("Lion");

	        // Sorting in descending order using a lambda expression
	        animalList.sort((a1, a2) -> a2.compareTo(a1));

	        // Printing the sorted list
	        System.out.println("Sorted animal list in descending order:");
	        animalList.forEach(System.out::println);}}
