package practice_Algorithm.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class PrimeNumber {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		int add=0;
		List<Integer> list = new ArrayList<>();
		
		for(int i =start; i<=end; i++) {
			
			
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
				add+=i;
				list.add(i);
			}
		}
		
      
      if(list.isEmpty()) {
    	  System.out.println(-1);
      }else {
    	  System.out.println(add);
          System.out.println(Collections.min(list)); 
      }
	}

}
