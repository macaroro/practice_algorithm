package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 여러 알고리즘의 기본이 되는 해결방법으로, 
//기본적으로는 엄청나게 크고 방대한 문제를 조금씩 조금씩 나눠가면서 용이하게 풀 수 있는 문제 단위로 나눈 다음 그것들을 다시 합쳐서 해결하자는 개념
//대표적으로는 퀵소트나 병합정렬
public class Confetti_Make {


	// 색상 카운트 할 변수 및 색종이(board)
	public static int white = 0;
	public static int blue = 0;
	public static int[][] board;
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());//크기
		
		board = new int[size][size];
		
		StringTokenizer st;
		
		
		//입력된 색깔을 2차원 배열에 담아놓기
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < size; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, size);
		
		System.out.println(white);
		System.out.println(blue);
		
	}
	
	public static void partition(int row, int col, int size) {
		
		//
		if(colorCheck(row, col, size)) {
			if(board[row][col] == 0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}
		
		int newSize = size / 2;	// 절반 사이즈(만약 색깔 체크에서 false가 나오면 다시 4등문)
		// 재귀 호출(사분면은 시계 반대 방향으로 1사분면의 부터 시작
		partition(row, col, newSize);						// 2사분면
		partition(row, col + newSize, newSize);				// 1사분면
		partition(row + newSize, col, newSize);				// 3사분면
		partition(row + newSize, col + newSize, newSize);	// 4사분면
	}
	
	
	// 현재 파티션의 컬러가 같은지 체크한다.
	public static boolean colorCheck(int row, int col, int size) {
	
		int color = board[row][col];	// 첫 번째 원소를 기준으로 검사
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				// 색상이 같지 않다면 false를 리턴 
				if(board[i][j] != color) {
					return false;
				}
			}
		}
		// 검사가 모두 통과했다는 의미이므로 true 리턴
		return true;
	}

}
