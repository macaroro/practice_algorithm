package practice_Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M3 {

	
	
	public static int[] list;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new int[m];//길이
		visit = new boolean[n];
		dfs(n, m, 0);
		System.out.println(sb);
	}
	 
		public static void dfs(int N, int M, int depth) {
		
			if (depth == M) {
				for (int val : list) {
					sb.append(val).append(' ');
				
				}
				sb.append('\n');
				return;//if문 종료
			}
	 
			for (int i = 0; i < N; i++) {
				
				
					visit[i] = true;//방문했다고 말해줌
					list[depth] = i + 1;
					dfs(N, M, depth + 1);
					//반복문은 계속 돌아가고있음(만약 m==1이라면 깊이에서 +1한 후에 
				    //재귀함수를 호출하면 depth==1이므로 위의 if문을 실행하고 종료 하고 다시 반복문을
					//그때의 깊이는 다시0으로 초기화 된다.
					visit[i] = false;
				}
			

		}
}
