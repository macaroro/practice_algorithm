package practice_Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_Queen {

	public static int[] list;
	public static int n;
	public static int count = 0;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new int[n];
 
		nQueen(0);
		System.out.println(count);
 
	}
 
	public static void nQueen(int depth) {
		// ��� ���Ҹ� �� ä�� ���¸� count ���� �� return 
		if (depth == n) {
			count++;
			return;
		}
 
		for (int i = 0; i < n; i++) {
			list[depth] = i;
			// ���� �� �ִ� ��ġ�� ��� ���ȣ��
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
 
	}
 
	public static boolean Possibility(int col) {
 
		for (int i = 0; i < col; i++) {
			// �ش� ���� ��� i���� ���� ��ġ�Ұ�� (���� �࿡ ������ ���) 
			if (list[col] == list[i]) {
				return false;
			} 
			
			/*
			 * �밢���� �����ִ� ���
			 * (���� ���� ���� ���� ���� ��찡 �밢���� �����ִ� ����)
			 */
			else if (Math.abs(col - i) == Math.abs(list[col] - list[i])) {
				return false;
			}
		}
		
		return true;
	}

}
