package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class Cutline {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int test_case = Integer.parseInt(st.nextToken());
		int cutline = Integer.parseInt(st.nextToken());
		
		Integer[] list = new Integer[test_case];
				
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<test_case;i++) {
			
			list[i] = Integer.parseInt(st.nextToken());
			
			
		}
		Arrays.sort(list,Collections.reverseOrder());
		System.out.println(list[cutline-1]);

	}

}
