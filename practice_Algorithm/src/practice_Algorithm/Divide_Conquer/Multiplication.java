package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiplication {

	//��ⷯ ���(��ⷯ ����)�� ������ �հ� ���� � �־��� ���� �������� �̿��Ͽ� �����ϴ� ���
	//(a+b)%c = (a%c + b%c)%c
	//(a-b)%c = (a%c - b%c)%c
	//(a*b)%c = (a%c * b%c)%c
	
	public static long c;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long a = Long.parseLong(st.nextToken());//���Ҽ�
		long b = Long.parseLong(st.nextToken());//a�� ��� ������
	    c = Long.parseLong(st.nextToken());//���Ѽ��� c�� ������

	    
	    System.out.println(pow(a,b));
		

	}

	private static long pow(long a, long b) {
		
		//������ 1�̸� �ٷ� ������ ���ϱ�
		if(b==1) {
			return a%c;
		}
		
		long temp = pow(a,b/2);//������ ����
		
		//������ Ȧ���� ������ �� ������ *�� ������ *������
		if(b%2==1) {
			return (temp*temp%c)*a%c;
		}
		
		//������ ¦���϶�
		return temp*temp%c;
		
	}

}
