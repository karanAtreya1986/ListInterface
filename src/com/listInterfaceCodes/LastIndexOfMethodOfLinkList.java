package com.listInterfaceCodes;

import java.util.LinkedList;

public class LastIndexOfMethodOfLinkList {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Tester");
		l1.add("Developer");
		l1.add("Tester");

		l1.addFirst("Pathan"); 

		String s2=l1.getFirst(); 

		l1.addLast("Hogan"); 

		System.out.println(l1.lastIndexOf("Deve")); //returns -1 since not present.
		System.out.println(l1.lastIndexOf("Developer")); //returns index where it is stored.
		System.out.println(l1);
	}

}

