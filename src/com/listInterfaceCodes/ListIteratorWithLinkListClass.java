package com.listInterfaceCodes;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorWithLinkListClass {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();// only change
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

		ListIterator<String> it = l1.listIterator();
		System.out.println("In forward direction");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("In backward direction");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
