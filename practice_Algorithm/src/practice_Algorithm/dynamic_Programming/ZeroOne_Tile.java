package practice_Algorithm.dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOne_Tile {
	
	//1과 00 타일로 n개의 길이로 된 수를 만들어야 함
	//1=1/ 2=11,00/ 3=100,001,111/4=1111,0000,1100,0011,1001 등으로 이후를 보면 
	//파보나치 수열을 따라가고 있는게 보인다
	
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
