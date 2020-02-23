/**
 * 
 */
package com.collection.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author sv8986
 * 
 */
public class MapInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "check");
		m.put("vanam", "sandeep");
		m.put("maram", "Naveen");
		m.put("kalaga", "sowmya");
		m.put("Nannuri", "Anil");
		m.put("Vanam", "Sandeep");
		m.put("1", "Check1");

		System.out.println("Using Entry set looping");
		Iterator<Entry<String, String>> i = m.entrySet().iterator();

		while (i.hasNext()) {

			Entry<String, String> s = i.next();
			System.out.println(s.getKey() + " --->" + s.getValue());

		}
		System.out.println("Using Enhanced for loop");
		for (Map.Entry<String, String> a : m.entrySet()) {

			String key = a.getKey();
			String value = a.getValue();
			System.out
					.println("Key and value are ---->" + key + "--->" + value);
		}

		System.out.println("Using Key set looping");
		System.out.println("Key and Values are testing ");

		for (String s : m.keySet()) {

			System.out.println(s + "------->" + m.get(s));

		}
		
		System.out.println("As you observed the out put if you give same key values it will override the first key value");

	}

}
