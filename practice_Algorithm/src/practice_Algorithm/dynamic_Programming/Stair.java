package practice_Algorithm.dynamic_Programming;

import java.io.*;

public class Stair {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int stair = Integer.parseInt(br.readLine());
 
		//시작점으로 인해 +1
		int[] dp = new int[stair + 1];//합을 저장
		int[] list = new int[stair + 1];
 
 
		//계단의 수 입력
		for (int i = 1; i <= stair; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
 
	
		//0번째는 시작점 1번은 첫번째 계단
		dp[1] = list[1];
		
		
		if (stair >= 2) {
			dp[2] = list[1] + list[2];
		}
 
		//
		for (int i = 3; i <= stair; i++) {
			dp[i] = Math.max(dp[i - 2] , dp[i - 3] + list[i - 1]) + list[i];
		}
 
		System.out.println(dp[stair]);
 
	}
}
