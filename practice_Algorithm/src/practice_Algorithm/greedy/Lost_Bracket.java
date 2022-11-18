package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lost_Bracket {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		//-를 기준으로 나눔
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		
		while(st.hasMoreTokens()) {
			int temp=0;
			
			//그 이후 +를 기준으로 나눔
			StringTokenizer plus = new StringTokenizer(st.nextToken(),"+");
			while(plus.hasMoreTokens()) {
				temp+= Integer.parseInt(plus.nextToken());
			}
			
			if (sum == Integer.MAX_VALUE) {//첫번째 수가 들어올때
				sum = temp;
			} else {
				sum -= temp;
			}
		
		}
		
		System.out.println(sum);

	}

}
