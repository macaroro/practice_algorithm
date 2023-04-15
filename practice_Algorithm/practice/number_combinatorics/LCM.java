package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int test_case= Integer.parseInt(br.readLine());
		
		for(int i=0;i<test_case;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int max_divisor=0;// 최대 공약수
			
			for(int j=1;j<=a&&j<=b;j++) { //두개의 숫자 모두 나눠지는 값을 찾아서 계속 대입
				if(a%j==0&&b%j==0) {
					max_divisor=j;
				}
			}
			sb.append(a*b/max_divisor).append("\n");
			
		}
		
		System.out.println(sb);

	}

	}


