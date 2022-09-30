package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Max {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for (int i = 1; i <= 9; i++) {
			int num = Integer.parseInt(br.readLine());
			map.put(i, num);
		}
		
		int max = Collections.max(map.values());

		int key = getKey(map, max);
		System.out.println(max);
		System.out.println(key);
		
	}
	  // hashmap에 value 로 key 찾기
	   public static <K, V> K getKey(Map<K, V> map, V value) {
	 
	        for (K key : map.keySet()) {
	            if (value.equals(map.get(key))) {
	                return key;
	            }
	        }
	        return null;
	    }
	

}


