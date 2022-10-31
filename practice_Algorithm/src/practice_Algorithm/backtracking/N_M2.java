package practice_Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M2 {

	//백 트레킹: 되추적,  어떤 노드의 '유망성'을 판단한 뒤, 해당 노드가 유망하지 않다면 부모 노드로 돌아가 다른 자식 노드를 찾는 방법이다.
			  //즉, 모든 경우의 수를 찾아보지만, 그 중에서도 가능성만 있는 경우의 수만 찾아보는 방법이다.
	
	public static int[] list;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		 n = Integer.parseInt(st.nextToken());
		 m = Integer.parseInt(st.nextToken());
		
		list = new int[m];
        
		dfs(1, 0);
		System.out.println(sb);
	}
	 
		public static void dfs(int a, int depth) {
		
			if (depth ==m) {
				for (int val : list) {
					sb.append(val).append(' ');
				}
				sb.append('\n');
				return;
			}
	        
			for (int i = a; i <= n; i++) {
	 
				list[depth] = i;
				dfs(i + 1, depth + 1);
	 
			}
		}
}
