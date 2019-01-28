package MyAssignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfChars {

	public static void main(String[] args) {
	
		String[] strArr = {"a","b","c","t","b","d","t","b","t","a","d"};
		System.out.println("String Length is "+strArr.length);
		
		HashMap <String, Integer> hm = new HashMap <String, Integer>();
		
		for (String c: strArr){
			if (hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, 1);
			}
			
		}
		
		for (HashMap.Entry entry: hm.entrySet()){
			System.out.println(entry.getKey()+"------>"+ entry.getValue());
		}
	}

}
