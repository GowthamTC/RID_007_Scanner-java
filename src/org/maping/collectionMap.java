package org.maping;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class collectionMap {
	public static void main(String[] args) {
		Map<Integer, String> gt=new LinkedHashMap<Integer,String>();
		
		gt.put(10, "Gowtham");
		gt.put(20, "Amar");
		gt.put(30, "Gsn");
		gt.put(40, "Raghu");
		gt.put(50, "Suriya");
		gt.put(60, "Enithan");
		gt.put(70, "Dravit");
		
		System.out.println(gt);
		
		int size = gt.size();
		System.out.println(size);
		
		String string = gt.get(30);
		System.out.println(string);
		Set<Integer> keySet = gt.keySet();
		System.out.println(keySet);
		
		for (Integer g : keySet) {
			System.out.println(g);
			
		}
		Collection<String> values = gt.values();
		System.out.println(values);
		
		for (String g : values) {
			System.out.println(g);
			
		}
		Set<java.util.Map.Entry<Integer, String>> entrySet = gt.entrySet();
		System.out.println(entrySet);
		
	
	}

}
