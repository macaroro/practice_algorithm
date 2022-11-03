package practice_Algorithm.dynamic_Programming;

import java.io.*;


public class Fibonacci {
	//���� ��ȹ���� �Ѹ���� ���� ���� �Ѵٸ�, ������ ���� ���� �ٽ� �������� ����̴�
	static int[] list;
	static int count1 = 0;
	static int count2 = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		//��Ͱ� �ƴ϶� ���� ��ȹ������ �Ǻ���ġ ���� ���ϱ�
		//fn=fn-1+fn-2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		list = new int[num];
		fibo1(num);
		fibo2(num);
		
		int i = count1;
		int j = count2;

		System.out.println(i+" "+j);
		
		
	}
	
	
	public static int fibo1(int a) {
		
		if(a==1||a==2) {
			count1++;
			return 1;
		}else {
			return fibo1(a-1)+fibo1(a-2);
		}

	}
	
	
	public static int fibo2(int a) {
		list[0]=1;
		list[1]=1;
		
		for(int i=2;i<a;i++) {
			count2++;
			list[i]=list[i-1]+list[i-2];
			
		}
		return list[a-1];

}
}
