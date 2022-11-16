package practice_Algorithm.cumulaticeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Intercal_Sum5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		
		int size = Integer.parseInt(st.nextToken());
		int add_count = Integer.parseInt(st.nextToken());
		
		int[][] list = new int[size+1][size+1];
		
		for(int i=1;i<=size;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1; j<=size;j++) {
				list[i][j]= list[i][j-1]+Integer.parseInt(st.nextToken());
				//2차원 배열의 한줄씩 누적합을 배열에 저장
			}
			
		}
		
		for(int i=1;i<=add_count;i++) {
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


