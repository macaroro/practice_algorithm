package practice_Algorithm.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberCard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int count = Integer.parseInt(br.readLine());
		
		st=new StringTokenizer(br.readLine()," ");
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<count;i++) {
			list.add(Integer.parseInt(st.nextToken()));
			
		}
		
		int countnum = Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<countnum;i++) {
			boolean b = list.contains(Integer.parseInt(st.nextToken())); 
			if(b) {
				sb.append(1).append(" ");
			}else {
				sb.append(0).append(" ");
			}
			
		
		}
		
		System.out.println(sb);
	}


}
