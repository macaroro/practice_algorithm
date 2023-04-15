package practice_Algorithm.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Difference {

	public static void main(String[] args) throws IOException {
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		List<Integer> list_a = new ArrayList<>();
		List<Integer> list_b = new ArrayList<>();
		for(int i=0;i<a;i++) {
			list_a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<b;i++) {
			list_b.add(Integer.parseInt(st.nextToken()));
		}
		
		int dif=0;
		for(int num:list_a) {
			if(!list_b.contains(num)) {
				dif++;
			}
		}
		
		
		for(int num:list_b) {
			if(!list_a.contains(num)) {
				dif++;
			}
			
			
		}


		System.out.println(dif);
		
	}

}
