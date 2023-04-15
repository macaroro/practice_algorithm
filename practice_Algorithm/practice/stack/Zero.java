package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test_Case = Integer.parseInt(br.readLine());
	
		int[] stack = new int[test_Case];
		
		int size=0;
		for(int i=0;i<test_Case;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			if(num==0) {
				stack[size-1]=0;
				size--;
			}else {
				stack[size]=num;
				size++;
			}
			
		}
		
		
		int sum=0;
		
		for(int n:stack) {
			sum+=n;
		}
		System.out.println(sum);
	}

}
