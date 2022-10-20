package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {

	public static boolean[][] list;//������ �� �迭
	public static int min = 64;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int sero= Integer.parseInt(st.nextToken());//������ ����
		int garo = Integer.parseInt(st.nextToken());//������ ����
 
		list = new boolean[sero][garo];//2���� �迭
		
 
		// ���� �Է�
		for (int i = 0; i < sero; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < garo; j++) {
				if (str.charAt(j) == 'W') {
					list[i][j] = true;		// W�� ���� true 
				} else {
					list[i][j] = false;		// B�� ���� false
				}
 
			}
		}
 
		
		int N_row = sero - 7;//8*8�� ����
		int M_col = garo - 7;
 
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
 
	
	public static void find(int x, int y) {
		int end_x = x + 8;//�Է��� ���α���
		int end_y = y + 8;//�Է��� ���α���
		int count = 0;//�ٲ����� Ƚ��
 
		boolean color = list[x][y];	// ù ��° ĭ�� ��(w=true,b=false)
 
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
 
				// ���� ���� color�� true 
				//�� �Ͼ���� �ƴ϶�� count++
				//������ boolean���� �ٲ۴�
				if (list[i][j] != color) {	
					count++;
				}
				
				/* 
				 * ���� ĭ�� ���� �ٲ�Ƿ�
				 * true��� false��, false ��� true ��
				 * ���� �����Ѵ�.
				 */
				color = (!color);
			}
			
			color = !color;//�� ���� ������ ����� �� ������ ù��° ������ ���ƾ� �Ѵ�.
		}
		
		/*
		 *  ù ��° ĭ�� �������� �� ���� ��ĥ �� ����(count)��
		 *  ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ����
		 *  ��ĥ �� ����(64 - count) �� �ּڰ��� count �� ���� 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * ���������� ��� �� �ּڰ����� ���� count ����
		 * �� ���� ��� �ּڰ��� ���� 
		 */
		min = Math.min(min, count);
	}
}
