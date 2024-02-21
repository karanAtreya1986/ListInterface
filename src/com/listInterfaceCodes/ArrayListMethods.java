package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Duplicate");
		l1.add("Duplicate");
		l1.add("Duplicate");
		l1.add("Duplicate");

		l1.add("Multiple null");
		l1.add("Multiple null");
		l1.add("Multiple null");
		l1.add("Multiple null");

		l1.add("Peacock");
		l1.add("Tiger");
		l1.add("Lion");
		l1.add("Girrafe");

		ArrayList<String> l3 = new ArrayList<>();
		l3.add("Dinosaur");
		l3.add("Hyenas");
		l3.add("Duplicate from l3");
		l3.add("Duplicate from l3");
		l3.add("Duplicate from l3");
		l3.add("Duplicate from l3");
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add(null);

		l1.addAll(l3);

		// l1.remove("Tiger"); //give the value to be removed.

		// l1.removeAll(l3); //removes all the right hand side collection
		
		//l1.set(2, "Rocky Balboa"); //index number 2 is changed from duplicate to rocky balboa.
		
		//l1.clear(); //clears out the array list and totally blank.
		
		//l1.retainAll(l3); //retains right hand side collection and removes left hand side collection.

		Iterator<String> readList = l1.iterator();
		while (readList.hasNext()) {
			String listRead = readList.next();
			System.out.println(listRead);
		}
	}

}
