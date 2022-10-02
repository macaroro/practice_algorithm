package practice_Algorithm.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_N {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
//		Java: long sum(int[] a); (클래스 이름: Test)
//		a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//		리턴값: a에 포함되어 있는 정수 n개의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lenth = Integer.parseInt(br.readLine());
		
		
		int a[] = new int[lenth];//배열의 길이설정
		
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
