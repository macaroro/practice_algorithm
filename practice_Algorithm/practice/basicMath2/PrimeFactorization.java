package practice_Algorithm.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i =2; i<=num; i++) {
			
			
			boolean isPrime = true;
			if(i == 1) {	
				continue;
			}
			for(int j = 2; j <= Math.sqrt(i); j++) {//Math.sqrt(i)제곱근 구하기
			
				if(i % j == 0) {
					isPrime = false;	
					break;
				}
			}
			if(isPrime) {
				list.add(i);
			}
		}
		for(int i=0; i<list.size();i++) {
			while (num % list.get(i) == 0) {
				System.out.println(list.get(i));
				num /= list.get(i);
			}
			
		
		

	}

}
}
