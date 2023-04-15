package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] list = new int[test_case]; 
		
		for(int i=0;i<test_case;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		
		int num = Integer.parseInt(br.readLine());
		
		int count=0;
		for(int n:list) {
			if(num==n) {
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
