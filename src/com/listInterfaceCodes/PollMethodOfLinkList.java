package com.listInterfaceCodes;

import java.util.LinkedList;

public class PollMethodOfLinkList {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>(); 
		l1.add("Tester");
		l1.add("Developer");
		l1.add("Tester");

		l1.addFirst("Pathan"); 

		l1.addLast("Hogan"); 

		System.out.println(l1.size());
		System.out.println(l1.poll());
		System.out.println(l1.size());

//		for (String s1 : l1) {
//			System.out.println(s1);
//		}
	}

}

