package practice_Algorithm.number_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Binomial_Coefficient {
	//이항계수(조합)
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));
		
	}
	
	static int factorial(int a) {
		if(a==0) return 1;
		
		return a*factorial(a-1);
	}

}
