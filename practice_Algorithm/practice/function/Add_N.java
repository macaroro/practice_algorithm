package practice_Algorithm.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_N {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
//		Java: long sum(int[] a); (Ŭ���� �̸�: Test)
//		a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
//		���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lenth = Integer.parseInt(br.readLine());
		
		
		int a[] = new int[lenth];//�迭�� ���̼���
		
		 for (int i = 0; i < a.length; i++) {
			 a[i] = Integer.parseInt(br.readLine());
						
		}
				
		 System.out.println(sum(a));

	}
	
	private static long sum(int[] a) {
		long add =0;
		for(int i=0;i<a.length;i++) {
			add+=a[i];
		}
		return add;
		
	}

}
