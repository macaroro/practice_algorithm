package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ring {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int test_case = Integer.parseInt(br.readLine());
		
		st=new StringTokenizer(br.readLine()," ");
		
		int[] list = new int[test_case];
		for(int i=0;i<test_case;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1;i<list.length;i++) {
			int divisor = divisor(list[0], list[i]);
			
			if(divisor==1) {
				sb.append(list[0]+"/"+list[i]).append("\n");
			}else {
				sb.append((list[0]/divisor)+"/"+(list[i]/divisor)).append("\n");
			}
		}
		
		System.out.println(sb);
		
		

	}
	
	static int divisor(int a, int b) {//유클리드 호제법(최대 공약수 구하기)
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
