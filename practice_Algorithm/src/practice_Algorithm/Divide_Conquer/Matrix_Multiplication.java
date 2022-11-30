package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//��İ����� *��ȣ �տ� �ִ� ����� ���� ������ * �ڿ� �ִ� ����� ���� ������ ���ƾ� ��
public class Matrix_Multiplication {

	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// A��� �Է�
		int n = Integer.parseInt(st.nextToken());//��
		int m = Integer.parseInt(st.nextToken());//��
		

		int[][] a = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		st = new StringTokenizer(br.readLine(), " ");
		
		// B��� �Է� 
		st.nextToken();		// ������ M������ ���� ���̱� ������ ������ ��� ����.
		int k = Integer.parseInt(st.nextToken());
		
		int[][] b = new int[m][k];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < k; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		// ��� ��� �� ���
		//������� ���� ��� a�� ��� ������ (0,0)b�� (0,0)�� ���ϰ� a(1,0)�� b(0,1)���Ѱ� ���ؼ� ù��°���� -1�� ����
		//�̰��� b�� �� ������ŭ �ݺ��ϰ� ù��° ���� ����� �Ϸ���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				int sum = 0;
				for(int x = 0; x < m; x++) {
					sum += a[i][x] * b[x][j];
				}
				// A�� i���� j�� ������ ������ �ٷ� ��¹����� �����ش�. 
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
