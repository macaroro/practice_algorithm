package practice_Algorithm.dynamic_Programming;

import java.io.*;
import java.util.StringTokenizer;

public class Triangle {

	static int[][] list;
	static Integer[][] dp;
	static int num;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		num = Integer.parseInt(br.readLine());
 
		list = new int[num][num];
		dp = new Integer[num][num];
		StringTokenizer st;
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < i + 1; j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		for (int i = 0; i < num; i++) {
			dp[num - 1][i] = list[num - 1][i];
		}
 
		System.out.println(find(0, 0));
 
	}
 
	static int find(int depth, int idx) {
		// 마지막 행일 경우 현재 위치의 dp값 반환
		if(depth == num - 1) return dp[depth][idx];
 
		// 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + list[depth][idx];
		}
		return dp[depth][idx];
 
	}
}
