package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine()," ");
		
		
		int num_count = Integer.parseInt(st.nextToken());
		int seq = Integer.parseInt(st.nextToken());
		
		int[] list = new int[num_count];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<num_count;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		
	
		int max=0;
		
		for(int i=0;i<=num_count-seq;i++) {
			int sum=0;
			for(int j=i;j<i+seq;j++) {
				sum +=list[j];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		
	
		


	}

}
