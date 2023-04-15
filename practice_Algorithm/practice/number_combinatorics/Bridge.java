package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge {
	static int[][] dp = new int[30][30];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int test_Case = Integer.parseInt(br.readLine());
		
		//�� eastCwest(�� ���շ�)
		for(int i=0;i<test_Case;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int east = Integer.parseInt(st.nextToken());
			int west = Integer.parseInt(st.nextToken());
			sb.append(combi(east, west)).append('\n');
			
		}
		
		System.out.println(sb);

	}
	
	static int combi(int n, int r) {
			
			// �̹� Ǯ�� ��� �ٷ� ��ȯ
			if(dp[n][r] > 0) {
				return dp[n][r]; 
			}
			
			// 2�� ����
			if(n == r || r == 0) {
				return dp[n][r] = 1;
			}
			
			// 1�� ����
			return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
		}

}
