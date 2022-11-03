package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOne_Tile {
	
	//1�� 00 Ÿ�Ϸ� n���� ���̷� �� ���� ������ ��
	//1=1/ 2=11,00/ 3=100,001,111/4=1111,0000,1100,0011,1001 ������ ���ĸ� ���� 
	//�ĺ���ġ ������ ���󰡰� �ִ°� ���δ�
	
	static int[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		list = new int[num+1];
		
		
		int fibo = fibo(num);
		System.out.println(fibo);

	}
	
	public static int fibo(int a) {

		list[0]=1;
		list[1]=2;
		
		for(int i=2;i<a;i++) {
		
			list[i]=(list[i-1]+list[i-2])%15746;
			
		}
		return list[a-1];

}

}
