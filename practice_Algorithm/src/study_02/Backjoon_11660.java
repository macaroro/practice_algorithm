package study_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//������ ���ϱ�2
public class Backjoon_11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] list = new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1; j<=N;j++) {
				list[i][j]= list[i][j-1]+Integer.parseInt(st.nextToken());
				//2���� �迭�� ���پ� �������� �迭�� ����
			}
			
		}
		
		for(int i=1;i<=M;i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
            for (int j = x1; j <= x2; j++) {
                sum = sum + (list[j][y2] - list[j][y1-1]);
            }
            sb.append(sum + "\n");
        }
        System.out.print(sb);
	}

}
