package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LetsSeeIfArrayListFollowsRulesOfListInterface {
	
	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<>();
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
		
		Iterator<String> readList=l1.iterator();
		while(readList.hasNext()) {
			String listRead=readList.next();
			System.out.println(listRead);
		}
	}

}
