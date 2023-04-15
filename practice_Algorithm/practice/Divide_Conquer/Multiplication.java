package practice_Algorithm.Divide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiplication {

	//모듈러 산술(모듈러 연산)은 정수의 합과 곱을 어떤 주어진 수의 나머지를 이용하여 정의하는 방법
	//(a+b)%c = (a%c + b%c)%c
	//(a-b)%c = (a%c - b%c)%c
	//(a*b)%c = (a%c * b%c)%c
	
	public static long c;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long a = Long.parseLong(st.nextToken());//곱할수
		long b = Long.parseLong(st.nextToken());//a를 몇번 곱할지
	    c = Long.parseLong(st.nextToken());//곱한수를 c로 나눈다

	    
	    System.out.println(pow(a,b));
		

	}

	private static long pow(long a, long b) {
		
		//지수가 1이면 바로 나머지 구하기
		if(b==1) {
			return a%c;
		}
		
		long temp = pow(a,b/2);//지수를 분할
		
		//지수가 홀수면 지수를 반 나눈것 *반 나눈것 *나머지
		if(b%2==1) {
			return (temp*temp%c)*a%c;
		}
		
		//지수가 짝수일때
		return temp*temp%c;
		
	}

}
