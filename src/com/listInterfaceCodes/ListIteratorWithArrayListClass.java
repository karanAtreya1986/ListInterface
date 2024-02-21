package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorWithArrayListClass {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
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

		ListIterator<String> it=l1.listIterator();
		System.out.println("In forward direction");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("In backward direction");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
