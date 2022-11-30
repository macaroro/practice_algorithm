package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//행렬곱셈은 *기호 앞에 있는 행렬의 행의 개수와 * 뒤에 있는 행렬의 열의 개수가 같아야 함
public class Matrix_Multiplication {

	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// A행렬 입력
		int n = Integer.parseInt(st.nextToken());//열
		int m = Integer.parseInt(st.nextToken());//행
		

		int[][] a = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		st = new StringTokenizer(br.readLine(), " ");
		
		// B행렬 입력 
		st.nextToken();		// 어차피 M값으로 같은 수이기 때문에 버려도 상관 없다.
		int k = Integer.parseInt(st.nextToken());
		
		int[][] b = new int[m][k];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < k; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		// 행렬 계산 및 출력
		//입출력의 예로 들면 a의 행렬 가로인 (0,0)b의 (0,0)을 곱하고 a(1,0)과 b(0,1)곱한걸 더해서 첫번째값인 -1이 나옴
		//이것을 b의 열 개수만큼 반복하고 첫번째 줄의 출력을 완료함
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				int sum = 0;
				for(int x = 0; x < m; x++) {
					sum += a[i][x] * b[x][j];
				}
				// A의 i행의 j열 연산이 끝나면 바로 출력문으로 보내준다. 
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
