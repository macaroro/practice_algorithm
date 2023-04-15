package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Min_Max {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int count = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		
		for (int i = 0; i <count; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
			
		}
		int max = Collections.max(list);
		int min = Collections.min(list);
		
	System.out.printf("%d %d",min, max);
	}

}
