package practice_Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M1 {

	//�� Ʈ��ŷ: ������,  � ����� '������'�� �Ǵ��� ��, �ش� ��尡 �������� �ʴٸ� �θ� ���� ���ư� �ٸ� �ڽ� ��带 ã�� ����̴�.
			  //��, ��� ����� ���� ã�ƺ�����, �� �߿����� ���ɼ��� �ִ� ����� ���� ã�ƺ��� ����̴�.
	
	public static int[] list;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new int[m];//����
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
				return;//if�� ����
			}
	 
			for (int i = 0; i < N; i++) {
				
				if (visit[i]==false) {//�� �湮�ߴٴ� ����� ���ٸ�
					visit[i] = true;//�湮�ߴٰ� ������
					list[depth] = i + 1;
					dfs(N, M, depth + 1);
					//�ݺ����� ��� ���ư�������(���� m==1�̶�� ���̿��� +1�� �Ŀ� 
				    //����Լ��� ȣ���ϸ� depth==1�̹Ƿ� ���� if���� �����ϰ� ���� �ϰ� �ٽ� �ݺ�����
					//�׶��� ���̴� �ٽ�0���� �ʱ�ȭ �ȴ�.
					visit[i] = false;
				}
			}

		}
}
