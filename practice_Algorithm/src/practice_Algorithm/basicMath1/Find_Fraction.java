package practice_Algorithm.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Fraction {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//����: �밢�� ���� �����ؾߵ�
		//�밢�� ĭ�� �и�� ���ڸ� ���� ��(a)�� ¦���̰ų� �� �밢���� ĭ(a-1)�� ������ Ȧ���̸��
		//�밢�� ĭ�� �и�� ���ڸ� ���� ��(b)�� Ȧ���̰ų� �� �밢���� ĭ(b-1)�� ������ ¦���̸��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
 
		int cross_count = 1;//�밢���� ĭ�� ����
		int prev_count_sum = 0;//������ �� ĭ�� ����(�Է��� ������ ��°�� �м��� �ִ� �밢�� ����)
 
		while (true) {
			// ���� �밢�� ������ + �ش� �밢�� ���� �̿��� ���� �Ǻ�
			if (num <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// �밢���� ������ Ȧ����� 
					// ���ڰ� ū ������ ����
					// ���ڴ� �밢���� ���� ���� - (num ��° - ���� �밢�������� �� ���� - 1) 
					//-1�� �и��� ���� �ִ� ���ڿ� �и��� ��-1�̹Ƿ� ����
					// �и�� num ��° - ���� �밢�������� �� ����
					System.out.print((cross_count - (num - prev_count_sum - 1)) + "/" + (num - prev_count_sum));
					break;
				} 
				
				else {	// �밢���� ������ ¦����� 
					// Ȧ���� ���� ����� �ݴ�� 
					System.out.print((num - prev_count_sum) + "/" + (cross_count - (num - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}

	}

}
