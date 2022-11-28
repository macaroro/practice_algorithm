package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paper_Count {


	// 색상 카운트 할 변수 및 색종이(board)
	public static int minus_one = 0;
	public static int zero = 0;
	public static int one = 0;
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
		System.out.println(minus_one);
		System.out.println(zero);
		System.out.println(one);
		
	}
	
	public static void partition(int row, int col, int size) {
		
		
		if(numCheck(row, col, size)) {
			if(board[row][col] == -1) {
				minus_one++;
			}else if(board[row][col] == 0) {
				zero++;
			}else if(board[row][col] == 1) {
				one++;
			}
			return;
		}
		
		int newSize = size / 3;	
		
		partition(row, col, newSize);								// 왼쪽 위
		partition(row, col + newSize, newSize);						// 중앙 위
		partition(row, col + 2 * newSize, newSize);					// 오른쪽 위
		
		partition(row + newSize, col, newSize);						// 왼쪽 중간
		partition(row + newSize, col + newSize, newSize);			// 중앙 중간
		partition(row + newSize, col + 2 * newSize, newSize);		// 오른쪽 중간
		
		partition(row + 2 * newSize, col, newSize);					// 왼쪽 아래
		partition(row + 2 * newSize, col + newSize, newSize);		// 중앙 아래
		partition(row + 2 * newSize, col + 2 * newSize, newSize);	// 오른쪽 아래					
		
	}
	
	
	// 현재 파티션의 숫자가 같은지 체크한다.
	public static boolean numCheck(int row, int col, int size) {
	
		int number = board[row][col];	// 첫 번째 원소를 기준으로 검사
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				// 숫자가 같지 않다면 false를 리턴 
				if(board[i][j] != number) {
					return false;
				}
			}
		}
		// 검사가 모두 통과했다는 의미이므로 true 리턴
		return true;
	}

}
