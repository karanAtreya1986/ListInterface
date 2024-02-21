package com.listInterfaceCodes;

import java.util.LinkedList;

public class SpecificMethodsOfLinkList {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>(); // use link list on both sides to use the methods of link list.
		l1.add("Tester");
		l1.add("Developer");
		l1.add("Tester");

		l1.addFirst("Pathan"); //this will add the start of the list.
		
		String s2=l1.getFirst(); //getting value of first element from link list.
		//System.out.println(s2);
		
		l1.addLast("Hogan"); //add last element to the link list
		//System.out.println(l1.getLast()); //get value of last element in list
		
//		System.out.println(l1.indexOf("P")); //returns -1 because not there in link list
//		System.out.println(l1.indexOf("Tester")); //returns 1 because its at index 1
//		System.out.println(l1.indexOf("Path")); //returns -1 because not there in link list
		
//		System.out.println(l1.removeFirstOccurrence("P")); // returns false as no match
//		System.out.println(l1.removeFirstOccurrence("Path")); //returns false as no match
//		System.out.println(l1.removeFirstOccurrence("Tester")); //if there are more than one tester then first one is removed and rest remains.

		
		System.out.println(l1.removeLastOccurrence("Tester"));//if there are more than one value, the last value is removed.
		
		for (String s1 : l1) {
			System.out.println(s1);
		}
	}

}
