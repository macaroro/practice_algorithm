package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GCD_LCM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int max_divisor=0;// 최대 공약수
		
		for(int i=1;i<=a&&i<=b;i++) { //두개의 숫자 모두 나눠지는 값을 찾아서 계속 대입
			if(a%i==0&&b%i==0) {
				max_divisor=i;
			}
		}
		
		System.out.println(max_divisor);
		System.out.println((a*b)/max_divisor);// 최소 공배수(두수를 곱한수에 최대 공약수로 나누면 됨)
		
		

	}

}
