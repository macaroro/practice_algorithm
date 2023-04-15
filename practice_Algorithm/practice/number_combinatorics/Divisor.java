package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int divisor_count = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		int[] list = new int[divisor_count];
		
		for(int i=0;i<divisor_count;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int max=0;
		int min=1000000;
		
		for(int num:list) {
			max = Math.max(num,max);
		}
		for(int num:list) {
			min = Math.min(num, min);
		}
		
		int divisor = max*min;
		System.out.println(divisor);
		
	}

}
