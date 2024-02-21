package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.List;

public class SizeOfArrayListMethod {

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
		
		System.out.println(l1.size());

			}

}
