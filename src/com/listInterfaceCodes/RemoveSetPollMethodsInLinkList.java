package com.listInterfaceCodes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveSetPollMethodsInLinkList {

	public static void main(String[] args) {

		LinkedList<String> l1=new LinkedList<>(); // only different line from array list.
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

		//l1.remove(2); //remove based on index number. element at index 2 is removed.

		//l1.removeFirst(); //remove the first element in the link list. in our case duplicate.

		//l1.removeLast(); //remove last element in link list. in our case giraffe.

		//l1.removeFirstOccurrence("Peacock"); //peacock is removed. removes first occurrence of the item, if the same item is present multiple times.

		//l1.removeLastOccurrence("Multiple null"); //last null value is removed. if there multiple values the last one is removed.

		l1.set(5, "Hello"); //sets the value at the index. index starts from zero.

		System.out.println(l1.size());
		System.out.println(l1.pollFirst());
		System.out.println(l1.size());
		System.out.println(l1.pollLast());
		System.out.println(l1.size());

//		Iterator<String> readList=l1.iterator();
//		while(readList.hasNext()) {
//			String listRead=readList.next();
//			System.out.println(listRead);
//		}
	}

}
