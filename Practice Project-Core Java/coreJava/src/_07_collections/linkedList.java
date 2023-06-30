package _07_collections;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		//Create LinkedList
		LinkedList<String> subject = new LinkedList<>();
				
		//Storing elements into the LinkedList
		subject.add("English");
		subject.add("Mathematics");
		subject.add("Biology");
		subject.add("Chemistry");
		subject.add("Physics");
				
		//Retrieving items from LinkedList
		for (String t : subject) {
			System.out.println(t);
		}
				
		//Methods in LinkedList
		//Size of LinkedList
		System.out.println("Total elements in the LinkedList : " + subject.size());
		        
		//Element in a Index
		System.out.println("Item at index 1 : " + subject.get(1));
				
		//Index of an Element
		System.out.println("Index of Biology : " + subject.indexOf("Biology"));
				
		//Check for a particular element
		System.out.println("Biology is in the list : " + subject.contains("Biology"));
		System.out.println("History is in the list : " + subject.contains("History"));
	}

}
