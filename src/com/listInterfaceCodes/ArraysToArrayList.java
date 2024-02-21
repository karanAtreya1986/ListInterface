package com.listInterfaceCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToArrayList {
	
	public static void main(String[] args) {
		
		String a[]= {"Karnataka", "London"};
		
		List<String> l1=new ArrayList<>(Arrays.asList(a));
		
		for(String s1:l1) {
			System.out.println(s1);
		}
	}

}
