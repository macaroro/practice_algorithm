package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		//���� �ڵ�
//	    StringBuilder sb = new StringBuilder();
//		
//		
//		int sum=0;
//		
//		for(byte num:br.readLine().getBytes()) {
//			sum+=(num-'0');
//		}
//		
//		System.out.println(sum);
		
		String str = br.readLine();
		char[] c = str.toCharArray();
		
		int sum=0;
		for(int i=0;i<count;i++) {
			sum += c[i]-'0';
			//0�� �ƽ�Ű �ڵ�� 48 �� �ڷ� 1�� ���� 
			//char ������ ���ڸ� int�� �ٲٰ� �ʹٸ� ���ϴ� ������ �ƽ�Ű �ڵ忡 0�� �ƽ�Ű �ڵ带 ���� ��
		}
		System.out.println(sum);


	}

}
