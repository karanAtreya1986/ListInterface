package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class AddingVectorToAnotherListAndViceVersa {

	public static void main(String[] args) {

		Vector<String> v1=new Vector<>(5,10);
		v1.addElement("Hi");
		v1.addElement("Hello");
		v1.addElement("Hi");
		v1.addElement("Avenger");
		v1.addElement(null);
		v1.addElement(null);

		ArrayList<String> a1=new ArrayList<>(v1);
		a1.add("Tiger");
		a1.add(("Tiger"));
		a1.add("Lion");
		a1.add(null);
		a1.add(null);

		//			Enumeration<String> e1=a1.elements();
		//			while(e1.hasMoreElements()) {
		//				System.out.println(e1.nextElement());
		//			}

//		for(String s1:a1) {
//			System.out.println(s1);
//		}
//		System.out.println(v1);
//		System.out.println(a1);
		
		//add array list to vector list
		
		Vector<String> v2=new Vector<>(a1);
		
		Iterator<String>it1=v2.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}


}
