package practice_Algorithm.twoPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_Add5 {

	//2018
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num =  Integer.parseInt(br.readLine());
		
		int start=1;
		int end=1;
		int count=1;//end�� 15�϶��� ���ԵǴ� �̸� ����
		int sum=1;
		
		while(end !=num) {
			
			if(sum==num) {//���ڸ� ���� ���� num�̶� ���ٸ� count �����ϰ� end ����Ʈ ����
				count++;
				end++;
				sum=sum+end;//sum �� ����
			}else if(sum>num) {//sum�� num ���� ũ�ٸ� 
				sum = sum-start;//�������� �ٲ���ϴ� sum���� ������ start�� ���� end�� ����
				start++;//�׸��� ���� start�� �Ѿ
			}else {
				end++;
				sum = sum+end;//sum�� num ���� �۴ٸ� ��� end�� �����ְ� �ϳ��� �ø�
				
			}
			
			
			
		}
		
		System.out.println(count);
		
	}

}
