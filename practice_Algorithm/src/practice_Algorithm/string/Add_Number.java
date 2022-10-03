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
			//숫자 0이 아스키 코드 48 그 이후로는 48+n....
			//그러므로 입력한수의 아스키 코드를 받아서 -48하게 되면 입력한 수를 알수 있음
		}
		
		System.out.println(sum);

	}

}
