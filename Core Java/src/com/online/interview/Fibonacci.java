package com.online.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci
{
	public static void main(String args[])
	{		
		int prev, next, sum, n;
		prev=next=1;
		Map<Character,Integer> dup = new HashMap<Character,Integer>();
		dup.put('c', 1);
		System.out.println(dup);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println(list);
		for(n=1;n<=5;n++)
		{
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
		}
	}
}