package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paper_Count {


	// ���� ī��Ʈ �� ���� �� ������(board)
	public static int minus_one = 0;
	public static int zero = 0;
	public static int one = 0;
	public static int[][] board;
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());//ũ��
		
		board = new int[size][size];
		
		StringTokenizer st;
		
		
		//�Էµ� ������ 2���� �迭�� ��Ƴ���
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
		
		partition(row, col, newSize);								// ���� ��
		partition(row, col + newSize, newSize);						// �߾� ��
		partition(row, col + 2 * newSize, newSize);					// ������ ��
		
		partition(row + newSize, col, newSize);						// ���� �߰�
		partition(row + newSize, col + newSize, newSize);			// �߾� �߰�
		partition(row + newSize, col + 2 * newSize, newSize);		// ������ �߰�
		
		partition(row + 2 * newSize, col, newSize);					// ���� �Ʒ�
		partition(row + 2 * newSize, col + newSize, newSize);		// �߾� �Ʒ�
		partition(row + 2 * newSize, col + 2 * newSize, newSize);	// ������ �Ʒ�					
		
	}
	
	
	// ���� ��Ƽ���� ���ڰ� ������ üũ�Ѵ�.
	public static boolean numCheck(int row, int col, int size) {
	
		int number = board[row][col];	// ù ��° ���Ҹ� �������� �˻�
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				// ���ڰ� ���� �ʴٸ� false�� ���� 
				if(board[i][j] != number) {
					return false;
				}
			}
		}
		// �˻簡 ��� ����ߴٴ� �ǹ��̹Ƿ� true ����
		return true;
	}

}
