package _07_collections;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		//Creating HashMap
		HashMap<String, Integer> subject = new HashMap<>();
		
		//Adding elements into the HashMap
		subject.put("English", 1001);
		subject.put("Mathematics", 1002);
		subject.put("Biology", 1003);
		subject.put("Chemistry", 1004);
		subject.put("Physics", 1005);
		
		//Retrieve the items of he HashMap
		for (Map.Entry m: subject.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}

	}

}
