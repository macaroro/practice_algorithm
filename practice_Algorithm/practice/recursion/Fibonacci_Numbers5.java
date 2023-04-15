package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci_Numbers5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int fibonacci = fibonacci(num);
		System.out.println(fibonacci);

	}
	
	public static int fibonacci(int num) {
		
	if(num==0) return 0;
	if(num==1) return 1;
	
	return fibonacci(num-2)+fibonacci(num-1);
		
		
	}
}
