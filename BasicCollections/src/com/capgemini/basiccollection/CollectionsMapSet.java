package com.capgemini.basiccollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsMapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		

		map.put("Subhamoy", "Mango");
		map.put("Amit", "Banana");
		map.put("Alfaiz", "Apple");
		map.put("Mehul", "Pomegranate");
		
		System.out.println(map.get("Subhamoy"));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		Set<Entry<String,String>> set=map.entrySet();
		
		set.stream().forEach((element)->System.out.println(element.getValue()+" "+element.getKey()));
		
		
		
		

	}

}
