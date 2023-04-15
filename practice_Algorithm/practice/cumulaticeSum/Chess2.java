package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess2 {

	static int N, M, K;
	static char[][] board;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		board = new char[N][M];
		String line;
		for(int i = 0; i < N; i++) {
			line = br.readLine();
			for(int j = 0; j < M; j++) {
				board[i][j] = line.charAt(j);
			}
		}
		
		
		System.out.println(Math.min(minimal_board('B'), minimal_board('W')));
		
	}
	
	public static int minimal_board(char color) {
		int count = Integer.MAX_VALUE;
		int value;
		int[][] list = new int[N + 1][M + 1];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if((i + j) % 2 == 0) {
					value = board[i][j] != color? 1 : 0;
				}else {
					value = board[i][j] == color? 1 : 0;
				}
				list[i + 1][j + 1] = list[i][j + 1] + list[i + 1][j] - list[i][j] + value;
			}
		}
		
		for(int i = 1; i <= N - K + 1; i++) {
			for(int j = 1; j <= M - K + 1; j++) {
				count = Math.min(count, list[i + K - 1][j + K - 1] - list[i + K - 1][j - 1] - list[i - 1][j + K - 1] + list[i - 1][j - 1]);
			}
		}
		return count;
	}
				
}