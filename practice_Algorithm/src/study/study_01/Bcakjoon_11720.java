package study.study_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램
public class Bcakjoon_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int count_num = Integer.parseInt(br.readLine());
		String add_num = String.valueOf(br.readLine());
		int sum=0;
		
	    char[] ch = add_num.toCharArray();

	    //char을 int 형으로 바꾸려먼 아스키 코드를 이용('0'을 빼면됨)
	    for(int i = 0; i < ch.length; i++) 
	    {
	    	 sum += ch[i]-'0';
	    }
	        System.out.println(sum);

		
}
}
