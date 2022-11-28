package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���� �˰����� �⺻�� �Ǵ� �ذ�������, 
//�⺻�����δ� ��û���� ũ�� ����� ������ ���ݾ� ���ݾ� �������鼭 �����ϰ� Ǯ �� �ִ� ���� ������ ���� ���� �װ͵��� �ٽ� ���ļ� �ذ����ڴ� ����
//��ǥ�����δ� ����Ʈ�� ��������
public class Confetti_Make {


	// ���� ī��Ʈ �� ���� �� ������(board)
	public static int white = 0;
	public static int blue = 0;
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
		
		int newSize = size / 2;	// ���� ������(���� ���� üũ���� false�� ������ �ٽ� 4�)
		// ��� ȣ��(��и��� �ð� �ݴ� �������� 1��и��� ���� ����
		partition(row, col, newSize);						// 2��и�
		partition(row, col + newSize, newSize);				// 1��и�
		partition(row + newSize, col, newSize);				// 3��и�
		partition(row + newSize, col + newSize, newSize);	// 4��и�
	}
	
	
	// ���� ��Ƽ���� �÷��� ������ üũ�Ѵ�.
	public static boolean colorCheck(int row, int col, int size) {
	
		int color = board[row][col];	// ù ��° ���Ҹ� �������� �˻�
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				// ������ ���� �ʴٸ� false�� ���� 
				if(board[i][j] != color) {
					return false;
				}
			}
		}
		// �˻簡 ��� ����ߴٴ� �ǹ��̹Ƿ� true ����
		return true;
	}

}
