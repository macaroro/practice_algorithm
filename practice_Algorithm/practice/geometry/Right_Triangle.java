package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Right_Triangle {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        StringBuilder sb = new StringBuilder();
	       
	 
	        while(true) {
	        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	            
	        	int a = Integer.parseInt(st.nextToken());
	        	int b = Integer.parseInt(st.nextToken());
	        	int c = Integer.parseInt(st.nextToken());
	        	
	        	
				// 0 0 0 을 입력받으면 종료
	        	if(a == 0 && b == 0 && c == 0) break;
	            
	        	
	        	if((a * a + b * b) == c * c) {
					sb.append("right").append('\n');
				}
	        	else if(a * a == (b * b + c * c)) {
					sb.append("right").append('\n');
				}
	        	else if(b * b == (c * c + a * a)) {
					sb.append("right").append('\n');
				}
	        	else {
					sb.append("wrong").append('\n');
				}
	        	
			}
			System.out.println(sb);

}
}
