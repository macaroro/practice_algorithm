package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lost_Bracket {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int sum = Integer.MAX_VALUE;	// �ʱ� ���� ���� Ȯ���� ���� ������ ���� 
		//-�� �������� ����
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		
		while(st.hasMoreTokens()) {
			int temp=0;
			
			//�� ���� +�� �������� ����
			StringTokenizer plus = new StringTokenizer(st.nextToken(),"+");
			while(plus.hasMoreTokens()) {
				temp+= Integer.parseInt(plus.nextToken());
			}
			
			if (sum == Integer.MAX_VALUE) {//ù��° ���� ���ö�
				sum = temp;
			} else {
				sum -= temp;
			}
		
		}
		
		System.out.println(sum);

	}

}
