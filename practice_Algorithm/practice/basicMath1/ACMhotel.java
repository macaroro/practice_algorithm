package practice_Algorithm.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMhotel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int test_Case=Integer.parseInt(br.readLine());
	
		for(int i=0;i<test_Case;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int high = Integer.parseInt(st.nextToken());
			int lengh = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if(num%high==0) {
				sb.append((high*100)+(num/high)).append("\n");
			}else {
				sb.append(((num%high)*100)+((num/high)+1)).append("\n");
			}
		}
		
		System.out.println(sb);

	}

}
