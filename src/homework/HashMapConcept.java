package homework;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"Jhon");
		hm.put(102,"Alam");
		hm.put(103,"Michel");
		hm.put(104,"Kyle");
		System.out.println(hm);

		for(Map.Entry<Integer,String> entry:hm.entrySet()) {

			System.out.println(entry.getKey()+" "+entry.getValue());



		}

	}

}
