package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Checkpoing {
	
	//문제는 입력한 값들을 나누는 수인 m을 찾는것
	//(a/m+r)과(b/m+r)의 m은 같으므로  두수를 빼게되면 (a-b/m)만 남게됨 즉 m은 의 공약수인것

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		int[] list = new int[test_case];
		for(int i=0;i<test_case;i++) {
			list[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		
		int max_divisor = list[1]-list[0];
		for(int i=2;i<test_case;i++) {
			max_divisor=divisor(max_divisor, list[i]-list[i-1]);
		}
		
		for(int i = 2; i <= max_divisor / 2; i++) {
		    
			// i의 제곱 값이 최대공약수의 약수라면?
			if(max_divisor % i == 0) {
				sb.append(i + " ");
			}
		}
		
		// 마지막 최대공약수 꼭 출력해야함
		sb.append(max_divisor);
        
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
