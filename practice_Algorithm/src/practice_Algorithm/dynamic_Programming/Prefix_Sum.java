package practice_Algorithm.dynamic_Programming;

import java.io.*;
import java.util.StringTokenizer;


public class Prefix_Sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st; 
		int test_Case = Integer.parseInt(br.readLine());
		int[] list= new int[test_Case];
		
		 st = new StringTokenizer(br.readLine(), " ");
		 
		 for(int i=0;i<test_Case;i++) {
			 list[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 
		 int[] list2 = new int[test_Case];
		 list2[0] = list[0];
		 int max = list[0];
		 
		 for(int i=1;i<test_Case;i++) {
			 
			 list2[i]=Math.max(list2[i-1]+list[i],list[i]);
			 max = Math.max(max, list2[i]);
		 }
		 
		 System.out.println(max);
		

	}

}
