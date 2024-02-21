package com.listInterfaceCodes;

import java.util.LinkedList;

public class LinkListWithCustomClass {

	public static void main(String[] args) {

		LinkedList<CustomClassObject> customClassList = new LinkedList<>();

		CustomClassObject c1 = new CustomClassObject(1, "Testing", "Rock", "Stone", 100);
		CustomClassObject c2 = new CustomClassObject(2, "Developing", "McMahon", "Matiza", 200);
		CustomClassObject c3 = new CustomClassObject(2, "Developing", "McMahon", "Matiza", 200);
		CustomClassObject c4 = new CustomClassObject(2, null, "McMahon", "Matiza", 200);
		CustomClassObject c5 = new CustomClassObject(2, null, "McMahon", "Matiza", 200);
		CustomClassObject c6 = new CustomClassObject(0, null, null, null, -100);

		customClassList.add(c1);
		customClassList.add(c2);
		customClassList.add(c3);
		customClassList.add(c4);
		customClassList.add(c5);
		customClassList.add(c6);

		for (CustomClassObject c7 : customClassList) {
			System.out.println(c7.author);
			System.out.println(c7.bookId);
			System.out.println(c7.bookName);
			System.out.println(c7.price);
			System.out.println(c7.publisher);
		}
	}

}
