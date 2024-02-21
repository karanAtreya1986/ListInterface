package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddArrayListToLinkListAndViceVersa {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Tester");
		l1.add("Developer");
		l1.add("Tester");

		l1.addFirst("Pathan");

		l1.addLast("Hogan");

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("First");
		a1.add("First");
		a1.add("Second");
		a1.add(null);
		a1.add(null);

		l1.addAll(a1);

		for (String s1 : l1) {
			System.out.println(s1);
		}
	}

}
