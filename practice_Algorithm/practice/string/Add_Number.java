package practice_Algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		//전의 코드
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
			//0의 아스키 코드는 48 그 뒤로 1씩 증가 
			//char 형태의 숫자를 int로 바꾸고 싶다면 원하는 숫자의 아스키 코드에 0의 아스키 코드를 빼면 됨
		}
		System.out.println(sum);


	}

}
