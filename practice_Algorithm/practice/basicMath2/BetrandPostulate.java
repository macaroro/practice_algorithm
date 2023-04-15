package practice_Algorithm.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BetrandPostulate {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringBuilder sb = new  StringBuilder();
	     
	     
	    
	     while(true) {
	     int test_Case = Integer.parseInt(br.readLine());
	     if(test_Case == 0) break;
	     int count=0;
	     
	 	for(int i =test_Case+1; i<=test_Case*2;i++) {
			boolean isPrime = true;
			
			if(i==1) continue;
			
			for(int j=2; j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
			
			
	 	}
	 	sb.append(count).append("\n");
	     }
	     
	     System.out.println(sb);
	}

}
