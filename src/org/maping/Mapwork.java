package org.maping;
//Day9 Q1
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapwork {
	public static void main(String[] args) {
		Map<Integer, String> h=new HashMap<Integer, String>();
		System.out.println("Day9 Q1");
		System.out.println("\nHashMap");
		
		h.put(10, "java");
		h.put(20, "sql");
		h.put(30, "oops");
		h.put(40, "Sql");
		h.put(50, "oracle");
		h.put(60, "DB");
		h.put(10, "selenium");
		h.put(50, "psql");
		h.put(40, "Hadoop");
		System.out.println(h);
		
		
		Map<Integer, Integer> l=new LinkedHashMap<Integer, Integer>();
		l.put(10, 10);
		l.put(20, 20);
		l.put(30, 30);
		l.put(40, 40);
		l.put(50, 50);
		l.put(60, 60);
		l.put(10, 10);
		l.put(50, 50);
		l.put(40, 40);
		System.out.println("\n LinkedHashMap");
		System.out.println(l);

		
		Map<String, Integer> t=new TreeMap<String, Integer>();
		t.put("!", 10);
		t.put("@", 20);
		t.put("#", 30);
		t.put("$", 40);
		t.put("%", 50);
		t.put("^", 60);
		t.put("&", 10);
		t.put("*", 50);
		t.put("(", 40);
		System.out.println("\n TreehMap");
		System.out.println(t);
		
		
		Map<String, String> ht=new Hashtable<String, String>();
		ht.put("vel", "Selenium");
		ht.put("Ganesh", "framework");
		ht.put("Dinesh", "oracle");
		ht.put("Vengat", "Corejava");
		ht.put("Subash", "jira");
		System.out.println("\nHashMap");
		System.out.println(ht);
		
		
		
		
	}

}
