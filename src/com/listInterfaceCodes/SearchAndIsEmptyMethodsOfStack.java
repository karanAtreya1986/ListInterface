package com.listInterfaceCodes;

import java.util.Stack;

public class SearchAndIsEmptyMethodsOfStack {

		public static void main(String[] args) {

			Stack<Integer> stackInt1=new Stack<>();

			forPushing(stackInt1, 123);
			forPushing(stackInt1, 123);
			forPushing(stackInt1, 0);
			forPushing(stackInt1, 0);
			forPushing(stackInt1, 1);
			forPushing(stackInt1, 5678);

			stackInt1.push(500);
			stackInt1.push(500);
			stackInt1.push(0);
			stackInt1.push(0);
			stackInt1.push(-9);
			stackInt1.push(1987);
			
//			System.out.println(stackInt1.search(123)); //returns index location.
//			System.out.println(stackInt1.search(-6724)); //returns -1 when not found.
//			System.out.println(stackInt1.search(1987)); //index starts from 1 in stack.
			
			System.out.println(stackInt1.isEmpty());
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			stackInt1.pop();
			//System.out.println(stackInt1.isEmpty());
			
			
		}

		static void forPushing(Stack<Integer>s1, int i1){
			//s1.push(new Integer(i1));
			s1.push(i1);
		}

		static void forPopping(Stack<Integer> s2) {
			Integer k1=s2.pop();
			Integer k2=s2.pop();
		}
	}

