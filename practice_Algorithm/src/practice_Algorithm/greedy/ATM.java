package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int person = Integer.parseInt(br.readLine());
		
		int[] time = new int[person];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<person;i++) {
			
			time[i]=Integer.parseInt(st.nextToken());
			
			
		}
		
		Arrays.sort(time);
		
		int[] add = new int[person];
		add[0]=time[0];
		for(int i=1;i<person;i++) {
			add[i]=time[i]+add[i-1];
		}
		int sum=0;
		for(int num:add) {
			sum+=num;
		}
		
		System.out.println(sum);
	
	}

}
