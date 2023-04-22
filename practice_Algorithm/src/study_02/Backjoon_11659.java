package study_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� �� ���ϱ�
public class Backjoon_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//���� ���� ����
		int N = Integer.parseInt(st.nextToken());
		//���ؾ� �ϴ� Ƚ��
		int M = Integer.parseInt(st.nextToken());
		
		int[][] list = new int [2][N+1];
		list[0][1] = 0;
		list[1][0] = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N;i++) {
			list[0][i]=Integer.parseInt(st.nextToken());
			list[1][i]=list[1][i-1]+list[0][i];
		}
		
		for(int i=0; i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int sum  =  list[1][end]-list[1][start-1];
		    sb.append(sum+ "\n");
			
		}
		System.out.println(sb);

	}

}
