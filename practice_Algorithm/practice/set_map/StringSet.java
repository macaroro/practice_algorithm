package practice_Algorithm.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringSet {

	public static void main(String[] args) throws IOException {
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		int size = Integer.parseInt(st.nextToken());
		int serach_str = Integer.parseInt(st.nextToken());
		
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<size;i++) {
			map.put(br.readLine(),i);
		}
		
		int count=0;
		for(int i=0;i<serach_str;i++) {
		boolean b = map.containsKey(br.readLine());
		
		if(b) {
			count++;
		};
		}
		System.out.println(count);

	}

}
