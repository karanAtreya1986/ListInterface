package com.listInterfaceCodes;

import java.util.Enumeration;
import java.util.Vector;

public class VectorsClassBasics {

	public static void main(String[] args) {

		Vector<String> v1=new Vector<>(5,10);
		v1.addElement("Hi");
		v1.addElement("Hello");
		v1.addElement("Hi");
		v1.addElement("Avenger");
		v1.addElement(null);
		v1.addElement(null);

		//System.out.println(v1.size());
		//System.out.println(v1.capacity());

		//using Enumeration

		Enumeration<String> e1=v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}




	}

}
