package practice_Algorithm.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Find_PrimeNumber2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringTokenizer st  = new StringTokenizer(br.readLine()," ");
	     StringBuilder sb = new  StringBuilder();
	     
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int i =start; i<=end;i++) {
				boolean isPrime = true;
				
				if(i==1) continue;
				
				for(int j=2; j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					sb.append(i).append("\n");
				}
			}
			System.out.println(sb);

	}

}
