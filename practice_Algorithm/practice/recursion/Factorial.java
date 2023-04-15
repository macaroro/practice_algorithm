package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	//��ʹ� �ڽ��� ������ �� �ڱ� �ڽ��� �� �����ϴ� ����� ��Ͷ�� �Ѵ�.\
	// �Լ��� �ڽ��� �Լ��� ȣ���ϰ� ȣ���ϴ°� ����Լ�
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int factorial = factorial(num);
		
		System.out.println(factorial);
		
	}
	
	public static int factorial(int num) {
		
		if(num<=1) {
			return 1;
		}
		return num*factorial(num-1);
		
		
	}

}
