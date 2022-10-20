package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {

	public static boolean[][] list;//색깔이 들어갈 배열
	public static int min = 64;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int sero= Integer.parseInt(st.nextToken());//세로의 길이
		int garo = Integer.parseInt(st.nextToken());//가로의 길이
 
		list = new boolean[sero][garo];//2차원 배열
		
 
		// 색깔 입력
		for (int i = 0; i < sero; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < garo; j++) {
				if (str.charAt(j) == 'W') {
					list[i][j] = true;		// W일 때는 true 
				} else {
					list[i][j] = false;		// B일 때는 false
				}
 
			}
		}
 
		
		int N_row = sero - 7;//8*8을 제외
		int M_col = garo - 7;
 
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
 
	
	public static void find(int x, int y) {
		int end_x = x + 8;//입력한 세로길이
		int end_y = y + 8;//입력한 가로길이
		int count = 0;//바껴지는 횟수
 
		boolean color = list[x][y];	// 첫 번째 칸의 색(w=true,b=false)
 
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
 
				// 만약 위에 color이 true 
				//즉 하얀색이 아니라면 count++
				//맞으면 boolean값을 바꾼다
				if (list[i][j] != color) {	
					count++;
				}
				
				/* 
				 * 다음 칸은 색이 바뀌므로
				 * true라면 false로, false 라면 true 로
				 * 값을 변경한다.
				 */
				color = (!color);
			}
			
			color = !color;//각 줄의 마지막 색깔과 그 다음줄 첫번째 색깔은 같아야 한다.
		}
		
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, count);
	}
}
