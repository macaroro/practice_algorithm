package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	//재귀는 자신을 정의할 때 자기 자신을 재 참조하는 방법을 재귀라고 한다.\
	// 함수가 자신의 함수를 호출하고 호출하는게 재귀함수
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int factorial = factorial(num);
		
		System.out.println(factorial);
		
	}
	
	public static int factorial(int num) {
		
		if(num<=1) {
			return 1;
		}
		return num*factorial(num-1);
		
		
	}

}
