package practice_Algorithm.debuging;

import java.util.Scanner;

public class Debuging {

	//����: �迭���� �־��� ������ ���� ���ϴ� ���α׷��� ���Ͻÿ�(����ã��:����� ����)
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		//int answer = 0;//������ �ʱ�ȭ�� �߸�(��� testcase�� �������� �� ���� �����)
		
		//int[] a = new int[100001];
	//	int[] s = new int[100001];//�迭�� ���� ������ ����Ǿ� �ִ� ���� ���� �ڷ����� �޶� �׷� long�� �ٲ�� ��
		
		long[] a = new long[100001];
		long[] s = new long[100001];
		for(int i=1;i<=100000;i++) {
			a[i] = (long)(Math.random()*Long.MAX_VALUE);
			//s[i] = s[i-1]+a[i];//�迭�ȿ� ���� ��� 0���� ä���� �߸� ����(�������� ���� �迭)
			s[1]=a[1];
			s[i] = s[i-1]+a[i];
		}
		
		for(int t=1;t<testcase;t++) {
			int query = sc.nextInt();
			int answer=0;
			for(int i=0;i<query;i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				answer += s[end]-s[start-1];
				//System.out.println(testcase+" "+answer);//�� �׽�Ʈ���̽��� ���� �� �� ������ �׷��� testcase�� t�� �ٲ�� ��
				System.out.println(t+" "+answer);
			}
		}

	}

}
