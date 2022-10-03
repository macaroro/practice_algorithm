package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		int sum=0;
		
		for(byte num:br.readLine().getBytes()) {
			sum+=(num-'0');
			//���� 0�� �ƽ�Ű �ڵ� 48 �� ���ķδ� 48+n....
			//�׷��Ƿ� �Է��Ѽ��� �ƽ�Ű �ڵ带 �޾Ƽ� -48�ϰ� �Ǹ� �Է��� ���� �˼� ����
		}
		
		System.out.println(sum);

	}

}
