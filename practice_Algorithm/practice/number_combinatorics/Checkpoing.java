package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Checkpoing {
	
	//������ �Է��� ������ ������ ���� m�� ã�°�
	//(a/m+r)��(b/m+r)�� m�� �����Ƿ�  �μ��� ���ԵǸ� (a-b/m)�� ���Ե� �� m�� �� ������ΰ�

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		int[] list = new int[test_case];
		for(int i=0;i<test_case;i++) {
			list[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		
		int max_divisor = list[1]-list[0];
		for(int i=2;i<test_case;i++) {
			max_divisor=divisor(max_divisor, list[i]-list[i-1]);
		}
		
		for(int i = 2; i <= max_divisor / 2; i++) {
		    
			// i�� ���� ���� �ִ������� ������?
			if(max_divisor % i == 0) {
				sb.append(i + " ");
			}
		}
		
		// ������ �ִ����� �� ����ؾ���
		sb.append(max_divisor);
        
		System.out.println(sb);
		

	}
	
	static int divisor(int a, int b) {//��Ŭ���� ȣ����(�ִ� ����� ���ϱ�)
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
