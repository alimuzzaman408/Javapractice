package homework;

import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Jhon");
		hm.put(102, "Michel");
		hm.put(103, "Karim");
		hm.put(104, "Rahim");
		hm.put(105, "Motin");
		System.out.println(hm);
		hm.remove(101);
		System.out.println(hm);
		
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			
			
			System.out.println(m.getKey()+" "+m.getValue());
			}
		
		
	}

}
