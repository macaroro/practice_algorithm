package practice_Algorithm.dynamic_Programming;

import java.io.*;

public class Wine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int wine = Integer.parseInt(br.readLine());
		
		int[] dp = new int[wine + 1];
		int[] list = new int[wine+1];
		
		for(int i=1;i<=wine;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
 
	
		dp[1] = list[1];
		
		//첫번째 와인과 두번째 와인의 합
		if (wine > 1) {
			dp[2] = list[1] + list[2];
		}
 
		
		for (int i = 3; i <= wine; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + list[i], dp[i - 3] + list[i - 1] + list[i]));
		}
 
		System.out.println(dp[wine]);
 
	}
}