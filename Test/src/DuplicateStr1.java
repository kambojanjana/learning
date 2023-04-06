import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateStr1 {
	public static void main(String[] args) {
		String str = "vancouverr";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			
			char key = str.charAt(i);//i =0, v; i= 1, a;
			
			if (map.containsKey(key)) {//// map : {v : 2} ; if map.containsKey(v)
				
				int value_old = map.get(key);// map : {v : 2}
				
				map.put(key, value_old + 1);// map : {v : 2 + 1}
				
				//System.out.println(key +"-------------------"+ map.get(key));// map : {v:3}
				
			} else {
				map.put(key, 1);
				System.out.println(key +"=="+ 1);
			}
		}
		
//System.out.println(map);
	}

}
