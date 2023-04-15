package practice_Algorithm.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PoketmonMaster {

	public static void main(String[] args) throws IOException {
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int size = Integer.parseInt(st.nextToken());
		int serach_poketmon = Integer.parseInt(st.nextToken());
		
		Map<Integer,String> map = new HashMap<>();
		for(int i=1;i<=size;i++) {
			map.put(i,br.readLine());
		}
		
		for(int i=0;i<serach_poketmon;i++) {
		String str = br.readLine();
		if(isNumeric(str)){
			
			sb.append(map.get(Integer.parseInt(str))).append("\n");
		}else {
			sb.append(getKey(map,str)).append("\n");
			
		}

		}
		System.out.println(sb);



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
	   public static boolean isNumeric(String s) {
	        try {
	            Double.parseDouble(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	 

}
