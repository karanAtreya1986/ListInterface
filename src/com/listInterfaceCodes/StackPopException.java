package com.listInterfaceCodes;

import java.util.Stack;

public class StackPopException {


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

		System.out.println(stackInt1);

		stackInt1.pop();
		System.out.println(stackInt1);
		stackInt1.pop();
		System.out.println(stackInt1);
		stackInt1.pop();
		System.out.println(stackInt1);
		stackInt1.pop();
		System.out.println(stackInt1);
		stackInt1.pop();
		System.out.println(stackInt1);
		stackInt1.pop();
		System.out.println(stackInt1);

		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
		forPopping(stackInt1);
	}

	static void forPushing(Stack<Integer>s1, int i1){
		//s1.push(new Integer(i1));
		s1.push(i1);
		System.out.println(s1);
		//System.out.println(i1);
	}

	static void forPopping(Stack<Integer> s2) {
		Integer k1=s2.pop();
		System.out.println(k1);
		//System.out.println(s2);
		Integer k2=s2.pop();
		//System.out.println(k2);
		System.out.println(s2);
	}
}

