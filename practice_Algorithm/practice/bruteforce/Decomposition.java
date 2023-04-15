package practice_Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		//0���� �������� �� �Էµ� ���� ������ �ݺ��� ����
		
		int result=0;
		for(int i=0;i<num;i++) {
			int sum=0;
			int n=i;
			
			while(n !=0) {//�� �������� 0�� ����̴�
				sum+=n%10;//�� �ڸ��� ���� ���� sum�� �ְ�
				n/=10;//���� n�� 10�� ���� ���� �ٽ� while������ ������.
			}
			
			if(i+sum==num) {
				result=i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
